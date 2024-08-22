package com.thqqqqp.study.test;

import java.util.ArrayList;

class Person {
    private String name;
    private int age;

    void sayHello() {
        System.out.println("你好");
    }
}

class Student extends Person {
    private String studentId;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    void sayHello(){

    }

    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        Student stu1 = new Student();
        Student stu2 = new Student();
        studentList.add(stu1);
        studentList.add(stu2);
    }
}
