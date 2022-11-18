package com.example.tdd.entity;

import java.util.ArrayList;
import java.util.List;

public class Origin {

    private int id;
    private String name;
    private List<Destination> destinations;

    public Origin(int id, String name) {
        this.id = id;
        this.name = name;
        this.destinations = new ArrayList<>();
    }

    public Origin(int id, String name, List<Destination> destinations) {
        this.id = id;
        this.name = name;
        this.destinations = destinations;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Destination> getDestinations() {
        return destinations;
    }

    public void setDestinations(List<Destination> destinations) {
        this.destinations = destinations;
    }
}
