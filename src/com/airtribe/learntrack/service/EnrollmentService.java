package com.airtribe.learntrack.service;

import com.airtribe.learntrack.entity.Enrollment;
import com.airtribe.learntrack.repository.EnrollmentRepository;
import com.airtribe.learntrack.util.IdGenerator;

public class EnrollmentService {

    private EnrollmentRepository repo = new EnrollmentRepository();

    public void enroll(int studentId, int courseId) {
        Enrollment e = new Enrollment(
            IdGenerator.getEnrollmentId(), studentId, courseId
        );
        repo.save(e);
        System.out.println("Enrollment done!");
    }

    public void viewEnrollments() {
        for (Enrollment e : repo.findAll()) {
            e.display();
        }
    }
}