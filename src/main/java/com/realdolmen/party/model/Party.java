package com.realdolmen.party.model;

/**
 * Created by JHRAU70 on 18/09/2014.
 */
public class Party {
    private String name, location, price, tickets, artist, age;

    public Party(String name, String location, String price, String tickets, String artist, String age) {
        this.name = name;
        this.location = location;
        this.price = price;
        this.tickets = tickets;
        this.artist = artist;
        this.age = age;
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

    public String getTickets() {
        return tickets;
    }

    public void setTickets(String tickets) {
        this.tickets = tickets;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
