package com.example.parkingapp;

import java.sql.Time;
import java.util.Date;

public class Booking_Information {

    String vehicleType,vehicleNo,slot1;
    Date date;
    Time time;

    Booking_Information(){

    }

    public Booking_Information(String vehicleType, String vehicleNo, String slot1, Date date, Time time) {
        this.vehicleType = vehicleType;
        this.vehicleNo = vehicleNo;
        this.slot1 = slot1;
        this.date = date;
        this.time = time;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public String getSlot1() {
        return slot1;
    }

    public void setSlot1(String slot1) {
        this.slot1 = slot1;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
