package com.airtribe.learntrack.service;

import com.airtribe.learntrack.entity.Course;
import com.airtribe.learntrack.repository.CourseRepository;
import com.airtribe.learntrack.util.IdGenerator;

public class CourseService {

    private CourseRepository repo = new CourseRepository();

    public void addCourse(String name) {
        Course c = new Course(IdGenerator.getCourseId(), name);
        repo.save(c);
        System.out.println("Course added!");
    }

    public void viewCourses() {
        for (Course c : repo.findAll()) {
            c.display();
        }
    }
}