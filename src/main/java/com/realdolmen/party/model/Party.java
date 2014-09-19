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

    /**
     * JPA constructor
     */
    protected Party() {
    }


    private Party(Builder builder) {
        this.name = builder.name;
        this.location = builder.location;
        this.price = builder.price;
        this.numberOfTickets = builder.numberOfTickets;
        this.artist = builder.artist;
        this.minimumAge = builder.minimumAge;
        this.startDate = builder.startDate;
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

    public static final class Builder {

        private String name;
        private String location;
        private String price;
        private String numberOfTickets;
        private String artist;
        private String minimumAge;

        private Date startDate;

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withPrice(String price) {
            this.price = price;
            return this;
        }

        public Builder withNumberOfTickets(String nbOfTickets){
            this.numberOfTickets = nbOfTickets;
            return this;
        }

        public Builder withStartDate(Date startDate) {
            this.startDate = startDate;
            return this;
        }

        public Builder withLocation(String location) {
            this.location = location;
            return this;
        }

        public Builder withArtist(String artist) {
            this.artist = artist;
            return this;
        }

        public Builder withMinimumAge(String minimumAge) {
            this.minimumAge = minimumAge;
            return this;
        }

        public Party build() {
            return new Party(this);
        }
    }
}
