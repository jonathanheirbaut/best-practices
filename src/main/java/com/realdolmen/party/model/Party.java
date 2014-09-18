package com.realdolmen.party.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by JHRAU70 on 18/09/2014.
 */
@Entity
public class Party {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name, location, price, numberOfTickets, artist, minimumAge;
    @Temporal(TemporalType.DATE)
    private Date startDate;

    public Party() {
    }

    public Party(String name, String location, String price, String numberOfTickets, String artist, String minimumAge, Date startDate) {
        this.name = name;
        this.location = location;
        this.price = price;
        this.numberOfTickets = numberOfTickets;
        this.artist = artist;
        this.minimumAge = minimumAge;
        this.startDate = startDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(String numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getMinimumAge() {
        return minimumAge;
    }

    public void setMinimumAge(String minimumAge) {
        this.minimumAge = minimumAge;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
