package com.example.tennisclub.dto;



import java.util.List;

public class AdminDto {
    private String name;
    private String reservation;
    private String image;
    private List<UserDto> userDto;
    private List<CourtDto> courtDto;

    public AdminDto(String name, String reservation, String image, List<UserDto> userDto, List<CourtDto> courtDto) {
        this.name = name;
        this.reservation = reservation;
        this.image = image;
        this.userDto = userDto;
        this.courtDto = courtDto;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<UserDto> getUserDto() {
        return userDto;
    }

    public void setUserDto(List<UserDto> userDto) {
        this.userDto = userDto;
    }

    public List<CourtDto> getCourtDto() {
        return courtDto;
    }

    public void setCourtDto(List<CourtDto> courtDto) {
        this.courtDto = courtDto;
    }
}