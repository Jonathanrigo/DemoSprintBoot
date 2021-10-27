package co.com.poli.demo.helper;

import co.com.poli.demo.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentData {
    private static List<Student> listStudents;

    static {
        listStudents = new ArrayList<Student>(){
            {
                add(new Student(10L,"Ana",Boolean.TRUE));
                add(new Student(20L,"Jose",Boolean.FALSE));
                add(new Student(30L,"Juan",Boolean.TRUE));
            }
        };
    }
}
