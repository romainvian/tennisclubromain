package com.example.tennisclub.dto;

import java.util.Date;

public class CourtDto {
    private long id;
    private String name;
    private Date dateofreservation;
    private boolean isAvailable;

    public CourtDto(long id, String name, Date dateofreservation, boolean isAvailable) {
        this.id = id;
        this.name = name;
        this.dateofreservation = dateofreservation;
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

    public Date getDateofreservation() {
        return dateofreservation;
    }

    public void setDateofreservation(Date dateofreservation) {
        this.dateofreservation = dateofreservation;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
