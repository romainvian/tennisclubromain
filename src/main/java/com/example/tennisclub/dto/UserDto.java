package com.example.tennisclub.dto;

import java.util.Date;

public class UserDto {
    private Long id;
    private String name;
    private String lastname;
    private String email;
    private String password;
    private String classment;
    private Date birthday;
    private long numLicense;
    private long numTel;

    public UserDto(Long id, String name, String lastname, String email, String password, String classment, Date birthday, long numLicense, long numTel) {
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.classment = classment;
        this.birthday = birthday;
        this.numLicense = numLicense;
        this.numTel = numTel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getClassment() {
        return classment;
    }

    public void setClassment(String classment) {
        this.classment = classment;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public long getNumLicense() {
        return numLicense;
    }

    public void setNumLicense(long numLicense) {
        this.numLicense = numLicense;
    }

    public long getNumTel() {
        return numTel;
    }

    public void setNumTel(long numTel) {
        this.numTel = numTel;
    }
}
