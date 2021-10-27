package co.com.poli.demo.entity;

import lombok.*;

import java.util.Objects;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
public class Student {
    private Long id;
    private String name;
    private Boolean status;

    public Student(Long id, String name, Boolean status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id.equals(student.id) &&
                name.equals(student.name) &&
                status.equals(student.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, status);
    }
}
