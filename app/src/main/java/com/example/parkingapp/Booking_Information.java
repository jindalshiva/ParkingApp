package com.example.parkingapp;

public class Booking_Information {

    private String vehicleType,vehicleNo, slot,userId,date,stime,etime;
    int schedule;

    Booking_Information(){
    }

    public Booking_Information(String vehicleType, String vehicleNo, String slot, String userId, String date, String stime, String etime, int schedule) {
        this.vehicleType = vehicleType;
        this.vehicleNo = vehicleNo;
        this.slot = slot;
        this.userId = userId;
        this.date = date;
        this.stime = stime;
        this.etime = etime;
        this.schedule = schedule;
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

    public String getSlot() {
        return slot;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStime() {
        return stime;
    }

    public void setStime(String stime) {
        this.stime = stime;
    }

    public String getEtime() {
        return etime;
    }

    public void setEtime(String etime) {
        this.etime = etime;
    }

    public int getSchedule() {
        return schedule;
    }

    public void setSchedule(int schedule) {
        this.schedule = schedule;
    }
}
