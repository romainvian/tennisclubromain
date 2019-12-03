package com.example.tennisclub.Entity;

import java.util.List;

public class Admin {
    private String name;
    private String reservation;
    private String picture;
    private List<User> ListUsers;
    private List <Court> ListCourt;


    public Admin(String name, String reservation, String picture) {
        this.name = name;
        this.reservation = reservation;
        this.picture = picture;
        List<User> Users;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReservation() {
        return reservation;
    }

    public void setReservation(String reservation) {
        this.reservation = reservation;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public List<User> getListUsers() {
        return ListUsers;
    }

    public void setListUsers(List<User> listUsers) {
        ListUsers = listUsers;
    }

    public List<Court> getListCourt() {
        return ListCourt;
    }

    public void setListCourt(List<Court> listCourt) {
        ListCourt = listCourt;
    }
}



