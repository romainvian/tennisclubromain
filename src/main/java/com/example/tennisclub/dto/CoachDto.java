package com.example.tennisclub.dto;

import com.example.tennisclub.Entity.User;

import java.util.Date;
import java.util.List;

public class CoachDto {
    private long id;
    private String name;
    private Date dateofLesson;
    private boolean isAvailable;
    private List<UserDto> UserDtototrain;

    public CoachDto(long id, String name, Date dateofLesson, boolean isAvailable, List<UserDto> userDtototrain) {
        this.id = id;
        this.name = name;
        this.dateofLesson = dateofLesson;
        this.isAvailable = isAvailable;
        UserDtototrain = userDtototrain;
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

    public Date getDateofLesson() {
        return dateofLesson;
    }

    public void setDateofLesson(Date dateofLesson) {
        this.dateofLesson = dateofLesson;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public List<UserDto> getUserDtototrain() {
        return UserDtototrain;
    }

    public void setUserDtototrain(List<UserDto> userDtototrain) {
        UserDtototrain = userDtototrain;
    }
}
