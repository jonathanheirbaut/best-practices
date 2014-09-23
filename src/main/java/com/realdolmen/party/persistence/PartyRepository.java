package com.realdolmen.party.persistence;

import com.realdolmen.party.model.Party;

import javax.ejb.Remote;
import java.util.List;

/**
 * Created by JHRAU70 on 18/09/2014.
 */
@Remote
public interface PartyRepository {
    Party add(Party party);
    List<Party> getParties();
    void deleteParty(Party party);

    List<Party> getPartiesByLocation(String location);
}
