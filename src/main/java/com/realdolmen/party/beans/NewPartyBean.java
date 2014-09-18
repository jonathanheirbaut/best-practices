package com.realdolmen.party.beans;

import com.realdolmen.party.model.Party;
import com.realdolmen.party.services.PartyService;
import com.realdolmen.party.services.PartyServiceImpl;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by JHRAU70 on 18/09/2014.
 */
@Named
@RequestScoped
public class NewPartyBean {
    @Inject
    private PartyService partyService;

    private String name, location, price, tickets, artist, age;

    public String save(){
        partyService.add(new Party(name, location, price, tickets, artist, age));
        return "index";
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
