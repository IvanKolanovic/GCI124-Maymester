package edu.rit.Unit3;

import java.util.Arrays;

public class SchoolMain {
    public static void main(String[] args) {
        Student student = new Student("Ivan Kolanovic", "Oko vrulja", "iak13cad@rit.edu");
        System.out.println(student);
        Faculty faculty = new Faculty("Ivan Ivanovic", "Zagreb 123", "ik3130@g.rit.edu", "Office 13", "F:10:00-12:00");
        System.out.println(faculty);
        Person student2 = new Student("Pero Peric", "Negdi 123", "test@gmail.com");

        student.goOnBreak(10);
        faculty.goOnBreak(10);
        faculty.addCourse("GCIS.124");
        System.out.println(Arrays.toString(faculty.getCourses()));
        System.out.println(faculty.getNumberOfCourses());

    }
}
