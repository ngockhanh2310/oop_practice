package com.workspace.collections;

public class Student {
    private String name;
    private int age;
    private String address;
    private String className;

    public Student(String name, int age, String address, String className) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "\r\nStudent{\r\n\t" +
                "name='" + name + '\'' +
                ",\r\n\t age=" + age +
                ",\r\n\t address='" + address + '\'' +
                ",\r\n\t className='" + className + '\'' +
                '}';
    }
}
