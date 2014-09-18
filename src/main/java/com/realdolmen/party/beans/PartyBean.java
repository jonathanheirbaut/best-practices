package com.realdolmen.party.beans;

import com.realdolmen.party.model.Party;
import com.realdolmen.party.services.PartyService;
import com.realdolmen.party.services.PartyServiceImpl;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

/**
 * Created by JHRAU70 on 18/09/2014.
 */
@Named
@RequestScoped
public class PartyBean implements Serializable {
    @Inject
    private PartyService partyService;

    public PartyBean() {
    }

    public void delete(Party party){
        partyService.delete(party);
    }

    public List<Party> parties(){
        return partyService.getParties();
    }
}
