package com.example.tennisclub.Entity;

import java.util.Date;
import java.util.List;

public class Coach {
    private long id;
    private String name;
    private Date dateofLesson;
    private boolean isAvailable;
    private List <User> Usertotrain;

    public Coach(long id, String name, Date dateofLesson, boolean isAvailable, List<User> usertotrain) {
        this.id = id;
        this.name = name;
        this.dateofLesson = dateofLesson;
        this.isAvailable = isAvailable;
        Usertotrain = usertotrain;
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

    public List<User> getUsertotrain() {
        return Usertotrain;
    }

    public void setUsertotrain(List<User> usertotrain) {
        Usertotrain = usertotrain;
    }
}
