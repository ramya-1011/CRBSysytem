package com.example.demo_room.dto;

import com.example.demo_room.Model.ConferenceRoom;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class BookedRoomResponse {
    private long bookingID;
    private String EmployeeName;
    private long EmployeeId;
    private long Employee_ph_no;
    private int attendees;
    private LocalDate bookingDate;
    private LocalTime startTime;
    private LocalTime endTime;
    private String confirmationCode;
    private  RoomResponse room;

    public BookedRoomResponse(long bookingID, long employeeId, int attendees,
                              LocalDate bookingDate, LocalTime startTime, LocalTime endTime, String confirmationCode) {
        this.bookingID = bookingID;
        EmployeeId = employeeId;
        this.attendees = attendees;
        this.bookingDate = bookingDate;
        this.startTime = startTime;
        this.endTime = endTime;
        this.confirmationCode = confirmationCode;
    }
}