package com.airtribe.learntrack.service;

import com.airtribe.learntrack.entity.Student;
import com.airtribe.learntrack.repository.StudentRepository;
import com.airtribe.learntrack.util.IdGenerator;

public class StudentService {

    private StudentRepository repo = new StudentRepository();

    public void addStudent(String fname, String lname, String email, String batch) {
        int id = IdGenerator.getStudentId();
        Student s = new Student(id, fname, lname, email, batch);
        repo.save(s);
        System.out.println("Student added!");
    }

    public void viewStudents() {
        for (Student s : repo.findAll()) {
            s.display();
        }
    }

    public Student findStudent(int id) {
        return repo.findById(id);
    }
}