package model;

public class Student extends User {

    public Student(String userId, String name) {
        super(userId, name);
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Student");
    }
}