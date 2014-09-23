package com.realdolmen.party.controller;

import com.realdolmen.party.model.Party;
import com.realdolmen.party.services.PartyService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by JHRAU70 on 19/09/2014.
 */
@RequestScoped
@ManagedBean
public class PartyController {

    @Inject
    private PartyService partyService;

    public String saveOrUpdate(Party party) {
        try {
            partyService.add(party);
        } catch (IllegalArgumentException e) {
            return "error";
        }
        return null;
    }


    public List<Party> getPartiesByLocation(String location) {
        return partyService.getPartiesByLocation(location);
    }
}
