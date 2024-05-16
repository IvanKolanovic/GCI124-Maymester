package edu.rit.Unit3;

public class Student extends Person {
    private int numberOfCourses;
    private String[] courses;

    public Student() {
        super(); // Person()
        this.numberOfCourses = 0;
        this.courses = new String[30];
    }

    public Student(String name, String address, String email) {
        super(name, address, email); // Person(String name, String address, String email)
        this.numberOfCourses = 0;
        this.courses = new String[30];
    }

    public int getNumberOfCourses() {
        return numberOfCourses;
    }

    public void setNumberOfCourses(int numberOfCourses) {
        this.numberOfCourses = numberOfCourses;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() +
                ", numberOfCourses=" + numberOfCourses +
                "}";
    }

    @Override
    public void goOnBreak(int minutes) {
        super.goOnBreak(minutes);
        System.out.println("Going to Avenue Mall to the food corner.");
    }
}
