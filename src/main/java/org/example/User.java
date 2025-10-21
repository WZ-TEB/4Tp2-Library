package org.example;

import java.util.UUID;

public class User {
    //klasa odnosząca się tylko do użytkownika w próżni
    //zawiera tylko dane Usera, konstruktor, gettery & settery
    private String firstName;
    private String lastName;
    private String email;
    private final String userId;

    public User(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.userId = UUID.randomUUID().toString();
        //ID jest generowane automatycznie jako UUID
        //oszczedza nam to problemow z powtarzalnoscia ID
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserId() {
        return userId;
    }
}
