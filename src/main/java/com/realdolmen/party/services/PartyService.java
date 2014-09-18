package com.realdolmen.party.services;

import com.realdolmen.party.model.Party;

import java.util.List;

/**
 * Created by JHRAU70 on 18/09/2014.
 */
public interface PartyService {
    void add(Party party);
    List<Party> getParties();
    void delete(Party party);
}
