package com.realdolmen.party.services;

import com.realdolmen.party.model.Party;

import java.util.List;

/**
 * Created by JHRAU70 on 18/09/2014.
 */
public interface PartyService  {
    /**
     *
     * @param party
     * @throws IllegalArgumentException when party is null
     */
    void add(Party party) throws IllegalArgumentException;
    List<Party> getParties();
    void delete(Party party);

    List<Party> getPartiesByLocation(String location);
}
