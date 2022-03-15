package dao.impl;

import dao.StudentDao;
import enumCode.ErrorCode;
import model.Group;
import model.Student;
import util.DBHelper;
import util.Util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {

    @Override
    public List<Student> studentList() {
        Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Student> studentList = new ArrayList<Student>();
        String sql = "SELECT s.id,s.name,s.surname,s.contact,s.address,s.to_date ,s.from_date,g.group_name FROM student s\r\n" +
                "inner join group_class g on s.group_id = g.id\r\n" +
                "where s.active =1";

        try {
            c = DBHelper.getConnection();

            if (c != null) {
                ps = c.prepareStatement(sql);
                rs = ps.executeQuery();
                while (rs.next()) {

                    Student student = new Student();
                    Group group = new Group();
                    student.setId(rs.getInt("id"));
                    student.setName(rs.getString("name"));
                    student.setSurname(rs.getString("surname"));
                    student.setContact(rs.getString("contact"));
                    student.setAddress(rs.getString("address"));
                    student.setTo_date(rs.getDate("to_date"));
                    student.setFrom_date(rs.getDate("from_date"));
                    group.setGroup_name(rs.getString("group_name"));
                    student.setGroup(group);
                    studentList.add(student);
                }
            } else {
                System.out.println("Connection is null");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Util.close(ps, c, rs);
        }

        return studentList;
    }



    @Override
    public boolean addStudent(Student student) throws Exception {
        boolean result = false;
        Connection c = null;
        PreparedStatement ps = null;
        String sql = "Insert into student(name,surname,contact,address,to_date)\r\n" + "VALUES(?,?,?,?,?)";
        try {
            c = DBHelper.getConnection();
            if (c != null) {
                ps = c.prepareStatement(sql);
                ps.setString(1, student.getName());
                ps.setString(2, student.getSurname());
                ps.setString(3, student.getContact());
                ps.setString(4, student.getAddress());
                ps.setDate(5, new java.sql.Date(student.getTo_date().getTime()));
                ps.execute();
                result = true;
            } else {
                System.out.println("Connection is null");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Util.close(ps, c);
        }
        return result;
    }

    @Override
    public Student getStudentById(int id) throws Exception {
        Student student = new Student();
        Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT id ,name,surname,contact,address,to_date ,from_date FROM student\r\n" + "where id =?";
        try {
            c = DBHelper.getConnection();
            if (c != null) {
                ps = c.prepareStatement(sql);
                ps.setInt(1, id);
                rs = ps.executeQuery();
                if (rs.next()) {
                    student.setId(rs.getInt("id"));
                    student.setName(rs.getString("name"));
                    student.setSurname(rs.getString("surname"));
                    student.setContact(rs.getString("contact"));
                    student.setAddress(rs.getString("address"));
                    student.setTo_date(rs.getDate("to_date"));
                    student.setFrom_date(rs.getDate("from_date"));
                } else {
                    student = null;
                }
            } else {
                System.out.println("Connection is null");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Util.close(ps, c, rs);
        }
        return student;
    }

    @Override
    public boolean editStudent(Student student, int id) throws Exception {
        boolean result = false;
        Connection c = null;
        PreparedStatement ps = null;
        String sql = "UPDATE student set name = ? ,surname = ?, contact = ? , address = ?,to_date = ?,from_date = ?\r\n"
                + "where id = ?";
        try {
            c = DBHelper.getConnection();
            if (c != null) {
                ps = c.prepareStatement(sql);
                ps.setString(1, student.getName());
                ps.setString(2, student.getSurname());
                ps.setString(3, student.getContact());
                ps.setString(4, student.getAddress());
                ps.setDate(5, new java.sql.Date(student.getTo_date().getTime()));
                ps.setDate(6, new java.sql.Date(student.getFrom_date().getTime()));
                ps.setInt(7, id);
                ps.execute();
                result = true;

            } else {
                System.out.println("Connection is null");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Util.close(ps, c);
        }
        return result;
    }

    @Override
    public boolean deleteStudent(int id) throws Exception {
        boolean result = false;
        Connection c = null;
        PreparedStatement ps = null;
        String sql = "Update student set active = 0 where id = ?";
        try {
            c=DBHelper.getConnection();
            if(c!=null) {
                ps = c.prepareStatement(sql);
                ps.setInt(1, id);
                ps.execute();
                result = true;
            }else {
                System.out.println("Connection is null");
            }

        }catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public List<Student> getSearchStudent(String keyword) throws Exception {
        List<Student> students = new ArrayList<Student>();
        Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs =null;
        String sql = "select id, name,surname, contact,address, to_date,from_date from student\r\n" +
                "where active =1 and name like(?) or surname like(?)";
        try {
            c = DBHelper.getConnection();
            if(c!=null) {
                ps = c.prepareStatement(sql);
                ps.setString(1, "%"+keyword+"%");
                ps.setString(2, "%"+keyword+"%");
                rs = ps.executeQuery();
                while(rs.next()) {
                    Student student = new Student();
                    student.setId(rs.getInt("id"));
                    student.setName(rs.getString("name"));
                    student.setSurname(rs.getString("surname"));
                    student.setContact(rs.getString("contact"));
                    student.setAddress(rs.getString("address"));
                    student.setTo_date(rs.getDate("to_date"));
                    student.setFrom_date(rs.getDate("from_date"));
                    students.add(student);
                }
            }else {
                System.out.println("Connection is null");
            }
        }catch (Exception e) {

            ErrorCode.NotFound.getCode();
        }finally {
            Util.close(ps, c, rs);
        }
        return students;
    }
}
