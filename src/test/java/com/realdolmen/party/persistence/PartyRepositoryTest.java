package com.realdolmen.party.persistence;

import com.realdolmen.party.model.Party;
import org.junit.Test;

import javax.inject.Inject;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by JHRAU70 on 18/09/2014.
 */
public class PartyRepositoryTest {
    @Inject
    private PartyRepository partyRepository;

    @Test
    public void canRetrieveAllParties() throws Exception {
        System.out.println(partyRepository);
        List<Party> parties = partyRepository.getParties();

        assertEquals("Not all parties could be retrieved", 3, parties.size());
    }
}
