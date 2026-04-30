package com.airtribe.learntrack.repository;

import java.util.ArrayList;
import java.util.List;
import com.airtribe.learntrack.entity.Student;

public class StudentRepository {

    private List<Student> students = new ArrayList<>();

    public void save(Student s) {
        students.add(s);
    }

    public List<Student> findAll() {
        return students;
    }

    public Student findById(int id) {
        for (Student s : students) {
            if (s.getId() == id) return s;
        }
        return null;
    }
}