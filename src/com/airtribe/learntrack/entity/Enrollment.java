package com.airtribe.learntrack.entity;

import com.airtribe.learntrack.enums.EnrollmentStatus;

public class Enrollment {

    private int id;
    private int studentId;
    private int courseId;
    private EnrollmentStatus status;

    public Enrollment(int id, int studentId, int courseId) {
        this.id = id;
        this.studentId = studentId;
        this.courseId = courseId;
        this.status = EnrollmentStatus.ACTIVE;
    }

    public void display() {
        System.out.println("EnrollID: " + id + 
                           " StudentID: " + studentId + 
                           " CourseID: " + courseId + 
                           " Status: " + status);
    }
}