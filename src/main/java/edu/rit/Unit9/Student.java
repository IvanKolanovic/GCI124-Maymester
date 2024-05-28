package edu.rit.Unit9;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Student implements Comparable<Student> {
    private final String firstName;
    private final String lastName;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return lastName + "," + firstName;
    }

    @Override
    public int compareTo(Student o) {
        return this.firstName.compareTo(o.firstName);
    }

    public static void main(String[] args) {
        List<Student> students = new LinkedList<>();
        students.add(new Student("Bart", "Simpson"));
        students.add(new Student("Bart", "VanHouten"));
        students.add(new Student("Milhouse", "VanHouten"));
        students.add(new Student("Todd", "Flanders"));
        students.add(new Student("Nelson", "Muntz"));
        students.add(new Student("Ralph", "Wiggum"));

//        Collections.sort(students);
//        System.out.println(students);

//        students.sort(new MyComparator());
//        System.out.println(students);

//        students.sort(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getLastName().compareTo(o2.getLastName());
//            }
//        });
//        System.out.println(students);

//        students.sort((o1, o2) -> {
//            return o2.lastName.compareTo(o1.lastName);
//        });
//        students.sort((o1, o2) -> o2.lastName.compareTo(o1.lastName));
//        System.out.println(students);

//        students.sort(Student::compareTo);
//        System.out.println(students);


//        for (Student student : students) {
//            System.out.println(student);
//        }

        //students.forEach(student -> System.out.println(student));
        //   students.forEach(System.out::println);

//        List<String> studentNames = students.stream().map(student -> student.getFirstName() + " " + student.getLastName()).toList();
//        studentNames.forEach(System.out::println);

        students = students.stream().filter(student -> !student.firstName.equals("Bart")).toList();
        students.forEach(System.out::println);


    }
}

class MyComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getLastName().compareTo(o2.getLastName());
    }
}
