package com.airtribe.learntrack.repository;

import java.util.ArrayList;
import java.util.List;
import com.airtribe.learntrack.entity.Course;

public class CourseRepository {

    private List<Course> courses = new ArrayList<>();

    public void save(Course c) {
        courses.add(c);
    }

    public List<Course> findAll() {
        return courses;
    }
}