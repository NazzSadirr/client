package dao.impl;

import dao.PaymentDao;
import model.Lesson;
import model.Payment;
import model.Student;
import model.Teacher;
import util.DBHelper;
import util.Util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PaymentDaoImpl implements PaymentDao {
    private Connection c;
    private PreparedStatement ps;
    private ResultSet rs;

    public PaymentDaoImpl(Connection c, PreparedStatement ps, ResultSet rs) {
        this.c = c;
        this.ps = ps;
        this.rs = rs;
    }

    @Override
    public List<Payment> paymentList() throws Exception {
        List<Payment> payments = new ArrayList<>();
        String sql = "select p.id ,s.name,s.surname,l.lesson_name,t.name,t.surname,p.amount,p.created_date,p.update_date from payment p\r\n" +
                "inner join student s on p.student_id = s.id\r\n" +
                "inner join lesson l on p.lesson_id = l.id\r\n" +
                "inner join teacher t on p.teacher_id = t.id";

        try {
            c = DBHelper.getConnection();

            if (c != null) {
                ps = c.prepareStatement(sql);
                rs = ps.executeQuery();
                while (rs.next()) {
                    Student student = new Student();
                    student.setName(rs.getString("s.name"));
                    student.setSurname(rs.getString("s.surname"));

                    Lesson lesson = new Lesson();
                    lesson.setLesson_name(rs.getString("l.lesson_name"));

                    Teacher teacher = new Teacher();
                    teacher.setName(rs.getString("t.name"));
                    teacher.setSurname(rs.getString("t.surname"));

                    Payment payment =new Payment();
                    payment.setId(rs.getInt("p.id"));
                    payment.setAmount(rs.getDouble("p.amount"));
                    payment.setCreatedDate(rs.getDate("p.created_date"));
                    payment.setUpdateDate(rs.getDate("p.update_date"));

                    payment.setStudent(student);
                    payment.setLesson(lesson);
                    payment.setTeacher(teacher);

                    payments.add(payment);


                }
            } else {
                System.out.println("Connection is null");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Util.close(ps, c, rs);
        }

        return payments;

    }


}
