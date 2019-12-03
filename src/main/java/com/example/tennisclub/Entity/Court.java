package com.example.tennisclub.Entity;

import java.util.Date;

public class Court {
    private long id;
    private String name;
    private Date dateOfReservation;
    private boolean isAvailable;

    public Court(long id, String name, Date dateOfReservation, boolean isAvailable) {
        this.id = id;
        this.name = name;
        this.dateOfReservation = dateOfReservation;
        this.isAvailable = isAvailable;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfReservation() {
        return dateOfReservation;
    }

    public void setDateOfReservation(Date dateOfReservation) {
        this.dateOfReservation = dateOfReservation;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
