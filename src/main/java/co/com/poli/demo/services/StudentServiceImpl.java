package co.com.poli.demo.services;

import co.com.poli.demo.entity.Student;
import co.com.poli.demo.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> findAllStudent() {
        return studentRepository.findAllStudent();
    }

    @Override
    public Student addStudent(Student student) {
        return studentRepository.addStudent(student);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.updateStudent(student);
    }

    @Override
    public Student deleteStudent(Long id) {
        return studentRepository.deleteStudent(id);
    }

    @Override
    public Student findByIdStudent(Long id) {
        return studentRepository.findByIdStudent(id);
    }
}
