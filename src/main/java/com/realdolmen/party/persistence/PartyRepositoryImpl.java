package com.realdolmen.party.persistence;

import com.realdolmen.party.model.Party;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by JHRAU70 on 18/09/2014.
 */
@Named
@SessionScoped
public class PartyRepositoryImpl implements Serializable, PartyRepository{
    private List<Party> parties;

    @PostConstruct
    public void init(){
        parties = new ArrayList<>();
        parties.add(new Party("1", "loc1", "1","1","1","1"));
        parties.add(new Party("2", "loc2", "2","2","2","2"));
        parties.add(new Party("2", "loc3", "3","3","3","3"));
    }


    @Override
    public void add(Party party) {
        parties.add(party);
    }

    @Override
    public List<Party> getParties() {
        return parties;
    }
}
