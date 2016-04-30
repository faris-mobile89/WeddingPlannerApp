package com.app.fyweddingplanner.models;

import java.io.Serializable;

/**
 * Created by USER on 4/19/2016.
 */
public class WeddingPlanner implements Serializable{

    public String name;
    public String offers;
    public String description;
    public String location;
    public String phone;
    public String pService;

    public String getpService() {
        return pService;
    }

    public void setpService(String pService) {
        this.pService = pService;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOffers() {
        return offers;
    }

    public void setOffers(String offers) {
        this.offers = offers;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

