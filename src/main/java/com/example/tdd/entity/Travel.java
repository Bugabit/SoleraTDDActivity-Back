package com.example.tdd.entity;

import java.util.Date;

public class Travel {
    private int id;
    private String company;
    private String flightNumber;
    private Date travelDate;
    private double transitTime;
    private int layover;
    private boolean luggage;
    private double price;

    public Travel(int id, String company, String flightNumber, Date travelDate, double transitTime, int layover,
                  boolean luggage, double price) {
        this.id = id;
        this.company = company;
        this.flightNumber = flightNumber;
        this.travelDate = travelDate;
        this.transitTime = transitTime;
        this.layover = layover;
        this.luggage = luggage;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Date getTravelDate() {
        return travelDate;
    }

    public void setTravelDate(Date travelDate) {
        this.travelDate = travelDate;
    }

    public double getTransitTime() {
        return transitTime;
    }

    public void setTransitTime(double transitTime) {
        this.transitTime = transitTime;
    }

    public int getLayover() {
        return layover;
    }

    public void setLayover(int layover) {
        this.layover = layover;
    }

    public boolean isLuggage() {
        return luggage;
    }

    public void setLuggage(boolean luggage) {
        this.luggage = luggage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
