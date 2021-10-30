package co.com.poli.demo.services;

import co.com.poli.demo.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> findAllStudent();
    Student addStudent(Student student);
    Student updateStudent(Student student);
    Student deleteStudent(Long id);
    Student findByIdStudent(Long id);

}
