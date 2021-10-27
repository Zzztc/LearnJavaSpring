package com.learnspring.ba05;

public class Student {
    private String name;
    private int age;
    //引用类型
    private School school;

    public Student() {
        System.out.println("student无参构造方法");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("setName==="+name);
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("setAge==="+age);
        this.age = age;
    }

}
