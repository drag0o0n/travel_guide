package com.example.travel_guide;

public class User {
    private String email;
    private String firstName;
    private String lastName;
    private String password;
    private String preferredContinent;

    public User(String email, String firstName, String lastName, String password, String preferredContinent) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.preferredContinent = preferredContinent;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPreferredContinent() {
        return preferredContinent;
    }

    public void setPreferredContinent(String preferredContinent) {
        this.preferredContinent = preferredContinent;
    }
    @Override
    public String toString() {
        return "User{" +
                "\nEmail= " + email +
                "\nfirstName= " + firstName +
                "\nlastName = " + lastName +
                "\npassword = " + password +
                "\npreferredContinent = " + preferredContinent +
                +'\n' + '}' + '\n';
    }
}
























