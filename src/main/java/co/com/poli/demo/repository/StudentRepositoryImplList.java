package co.com.poli.demo.repository;

import co.com.poli.demo.entity.Student;
import co.com.poli.demo.helper.StudentData;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepositoryImplList implements StudentRepository{

    @Override
    public List<Student> findAllStudent() {
        return StudentData.getListStudents();
    }

    @Override
    public Student addStudent(Student student) {
        List<Student> listStudent = StudentData.getListStudents();
        listStudent.add(student);
        StudentData.setListStudents(listStudent);
        return student;
    }

    @Override
    public Student updateStudent(Student student) {
        List<Student> listStudent = StudentData.getListStudents();
        listStudent.set(listStudent.indexOf(student),student);
        StudentData.setListStudents(listStudent);
        return student;
    }

    @Override
    public Student deleteStudent(Long id) {
        List<Student> listStudent = StudentData.getListStudents();
        Student student = findByIdStudent(id);
        listStudent.remove(student);
        StudentData.setListStudents(listStudent);
        return student;
    }

    @Override
    public Student findByIdStudent(Long id) {
        List<Student> listStudent = StudentData.getListStudents();
        return listStudent.get(listStudent.indexOf(new Student(id)));
    }
}
