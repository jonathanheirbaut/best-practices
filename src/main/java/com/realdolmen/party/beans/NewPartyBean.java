package com.realdolmen.party.beans;

import com.realdolmen.party.model.Party;
import com.realdolmen.party.services.PartyService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.Date;

/**
 * Created by JHRAU70 on 18/09/2014.
 */
@Named
@RequestScoped
public class NewPartyBean {
    @Inject
    private PartyService partyService;


    private String name, location, price, numberOfTickets, artist, minimumAge;
    private Date startDate;

    public String save() {

        partyService.add(
                new Party.Builder()
                        .withName(name)
                        .withLocation(location)
                        .withPrice(price)
                        .withNumberOfTickets(numberOfTickets)
                        .withArtist(artist)
                        .withMinimumAge(minimumAge)
                        .withStartDate(startDate).build());
        return "index";
    }

    public String update(Party party) {
        this.name = party.getName();
        this.location = party.getLocation();
        this.price = party.getPrice();
        this.numberOfTickets = party.getNumberOfTickets();
        this.artist = party.getArtist();
        this.minimumAge = party.getMinimumAge();
        this.startDate = party.getStartDate();
        return "add";
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
}
