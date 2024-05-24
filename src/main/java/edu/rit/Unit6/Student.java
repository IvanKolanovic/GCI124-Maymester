package edu.rit.Unit6;

import java.util.*;

public class Student implements Comparable<Student> {
    private int id;
    private String email;
    private String name;

    public Student(int id, String email, String name) {
        this.id = id;
        this.email = email;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                '}';
    }


    @Override
    public int hashCode() {
        return (int) Math.pow(name.hashCode(), id);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student student) {
            return this.name.equals(student.name) && this.id == student.id;
        } else
            return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public int compareTo(Student o) {
        return id - o.id;
    }

    public static void main(String[] args) {
        Set<Student> hashSet = new HashSet<>();
        Set<Student> treeSet = new TreeSet<>();

        Student stu1 = new Student(9000, "Bruce", "blhvse@rit.edu");
        Student stu2 = new Student(1001, "Bobby", "rjsvcs@rit.edu");
        Student stu3 = new Student(3506, "Ahmed", "amhics@rit.edu");
        Student stu4 = new Student(9001, "Bruce", "blhvse@rit.edu");

//        hashSet.add(stu1);
//        hashSet.add(stu2);
//        hashSet.add(stu3);
//        hashSet.add(stu4);
//
//        for (Student student : hashSet) {
//            System.out.println(student);
//        }
//
//        System.out.println();
//
//        treeSet.add(stu1);
//        treeSet.add(stu2);
//        treeSet.add(stu3);
//        treeSet.add(stu4);
//        for (Student student : hashSet) {
//            System.out.println(student);
//        }



        Map<Integer, Student> hashMap = new HashMap<>();


        hashMap.put(stu1.getId(), stu1);
        hashMap.put(stu2.getId(), stu2);
        hashMap.put(stu3.getId(), stu3);
        hashMap.put(stu4.getId(), stu4);


        for(int key : hashMap.keySet()){
            System.out.println(hashMap.get(key));
        }









    }
}
