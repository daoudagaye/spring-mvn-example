package com.organisation.spring.model;

public class User {
    private int id;
    private String surname;
    private String name;
    private String mail;

    public User() {}

    public User(int id, String surname, String name, String mail) {
        this.surname = surname;
        this.name = name;
        this.mail = mail;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
