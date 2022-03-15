package model;

import java.util.Date;

public class Payment extends Super{
    private Student student;
    private Lesson lesson;
    private Teacher teacher;
    private double amount;
    private Date createdDate;
    private Date uptadeDate;

    public Payment(Student student, Lesson lesson, Teacher teacher,
                   double amount, Date createdDate, Date uptadeDate) {
        this.student = student;
        this.lesson = lesson;
        this.teacher = teacher;
        this.amount = amount;
        this.createdDate = createdDate;
        this.uptadeDate = uptadeDate;
    }

    public Payment(){
        super();
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUptadeDate() {
        return uptadeDate;
    }

    public void setUpdateDate(Date uptadeDate) {
        this.uptadeDate = uptadeDate;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "student=" + student +
                ", lesson=" + lesson +
                ", teacher=" + teacher +
                ", amount=" + amount +
                ", createdDate=" + createdDate +
                ", uptadeDate=" + uptadeDate +
                '}';
    }
}
