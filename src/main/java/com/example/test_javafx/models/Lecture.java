package com.example.test_javafx.models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Lecture {
    private String title;
    private String location;
    private String lectuerId;
    private String courseId;
    private List<Student> attendance;

    public Lecture(String title, String location, String lectuerId , String courseId) {
        this.title = title;
        this.location = location;
        this.lectuerId = lectuerId;
        this.courseId= courseId;
        this.attendance = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public String getLocation() {
        return location;
    }



    public List<Student> getAttendance() {
        return attendance;
    }

    public void addStudentAttendance(Student student) {
        attendance.add(student);
    }

    public void removeStudentAttendance(Student student) {
        attendance.remove(student);
    }


}
