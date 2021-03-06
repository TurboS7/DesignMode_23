package model.other;

/**
 * Author zss
 * 2022/1/4 3:16 下午
 * model.other
 * Student
 **/
public class Student {
    private String name;
    private String address;
    private int age;
    private String school;

    public Student() {
    }

    public Student(String name, String address, int age, String school) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
