package org.example.TP0.EX01;

public class PersonCorrection {
    private String firstName;
    private String lastName;
    private int age;

    public PersonCorrection(String firstName, String lastName, int age) {
        if(age<0){
            throw new IllegalArgumentException("Age must be positive");
        }
        this.firstName = firstName;
        this.lastName  = lastName;
        this.age       = age;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public boolean isAdult() {
        return age >= 18;
    }
}
