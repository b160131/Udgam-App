package com.example.navigationbar.Events.event.mData;


import java.security.SecureRandomSpi;

public class Day {

    String Name;
    String day;
    int Image;
    String description;
    String Venue;
    String Date;
    String Time;
    String Nu1;
    String Nu2;
    String entryFeee;


    public Day(String Name, int Image, String day, String description, String Venue, String Date, String Time, String Nu1, String Nu2,String entryFeee) {
        this.Name = Name;
        this.Image = Image;
        this.day = day;
        this.description = description;
        this.Venue = Venue;
        this.Date = Date;
        this.Time = Time;
        this.Nu1 = Nu1;
        this.Nu2 = Nu2;
        this.entryFeee=entryFeee;

    }

    public String getName() {
        return Name;
    }

    public int getImage() {
        return Image;
    }

    public String getday() {
        return day;
    }

    public String getDescription() {
        return description;
    }

    public String getVenue() {

        return Venue;
    }

    public String getTime() {
        return Time;
    }


    public String getDate() {
        return Date;
    }
    public String getNu1() {
        return Nu1;
    }

    public String getNu2() {
        return Nu2;
    }

    public String getentryFeee() {
        return entryFeee;
    }

}