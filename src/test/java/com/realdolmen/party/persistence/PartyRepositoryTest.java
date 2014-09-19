package com.realdolmen.party.persistence;

import com.realdolmen.party.model.Party;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.ejb.EJB;
import javax.inject.Inject;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by JHRAU70 on 18/09/2014.
 */
public class PartyRepositoryTest {

    @Inject
    private PartyRepository partyRepository;

    @Ignore
    @Test
    public void canRetrieveAllParties() throws Exception {
        List<Party> parties = partyRepository.getParties();

        assertEquals("Not all parties could be retrieved", 3, parties.size());
    }

    @Test
    // TODO: test fails because of nullpointer because it cannot inject a partyRepository
    public void canPersistParty() throws Exception {
        Party party = partyRepository.add(new Party.Builder().withStartDate(new Date()).build());

        assertNotNull("Party could not be persisted", party.getId());
    }


}
