package dao;

import model.Student;

import java.util.List;

public interface StudentDao {
    List<Student>studentList()throws Exception;
    boolean addStudent(Student student) throws Exception;
    Student getStudentById(int id) throws Exception;
    boolean editStudent(Student student, int id) throws Exception;
    boolean deleteStudent(int id) throws Exception;
    List<Student> getSearchStudent(String keyword) throws Exception;
}
