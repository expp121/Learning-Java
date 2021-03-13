package com.course.buildings;

public class School extends Building {
    private int numberOfClassrooms;
    private String gradeLevel;

    public void setNumberOfClassrooms(int numberOfClassrooms) {
        this.numberOfClassrooms = numberOfClassrooms;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public String getGradeLevel() {
        return this.gradeLevel;
    }

    public int getNumberOfClassrooms() {
        return this.numberOfClassrooms;
    }

}
