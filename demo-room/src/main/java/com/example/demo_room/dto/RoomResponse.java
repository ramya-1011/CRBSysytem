package com.example.demo_room.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RoomResponse extends CommonAPIResponse {
    private long id;
    private String city;
    private String building;
    private int floor;
    private int capacity;
    private String description;
    private String type;
    private boolean isBooked=false;
    private List<BookedRoomResponse> bookings;

    public RoomResponse(long id, String city, String building,
                        int floor, int capacity, String description, String type) {
        this.id = id;
        this.city = city;
        this.building = building;
        this.floor = floor;
        this.capacity = capacity;
        this.description = description;
        this.type = type;
    }

    public RoomResponse(long id, String type, String building, String city,int floor, int capacity, String description) {
    }

    public RoomResponse() {

    }
}