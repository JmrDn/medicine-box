package com.example.medicinebox.model;

public class AllUsersModel {
    String email;
    String name;
    String userId;

    public AllUsersModel(String email, String name, String userId){
        this.email = email;
        this.name = name;
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getUserId() {
        return userId;
    }
}
