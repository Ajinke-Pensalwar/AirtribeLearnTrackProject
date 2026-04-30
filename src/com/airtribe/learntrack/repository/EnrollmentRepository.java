package com.airtribe.learntrack.repository;

import java.util.ArrayList;
import java.util.List;
import com.airtribe.learntrack.entity.Enrollment;

public class EnrollmentRepository {

    private List<Enrollment> enrollments = new ArrayList<>();

    public void save(Enrollment e) {
        enrollments.add(e);
    }

    public List<Enrollment> findAll() {
        return enrollments;
    }
}