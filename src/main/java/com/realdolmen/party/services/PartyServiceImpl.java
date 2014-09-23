package com.realdolmen.party.services;

import com.realdolmen.party.persistence.PartyRepository;
import com.realdolmen.party.model.Party;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

/**
 * Created by JHRAU70 on 18/09/2014.
 */

@Named
@SessionScoped
public class PartyServiceImpl implements Serializable, PartyService{
    @Inject
    private PartyRepository partyRepository;


    public void add(Party party){
        partyRepository.add(party);
    }

    public List<Party> getParties() {
        return partyRepository.getParties();
    }

    @Override
    public void delete(Party party) {
        partyRepository.deleteParty(party);
    }

    @Override
    public List<Party> getPartiesByLocation(String location) {
        return partyRepository.getPartiesByLocation(location);
    }


}
