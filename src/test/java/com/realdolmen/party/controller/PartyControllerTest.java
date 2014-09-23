package com.realdolmen.party.controller;

import com.realdolmen.party.model.Party;
import com.realdolmen.party.services.PartyService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.IllegalFormatCodePointException;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by JHRAU70 on 19/09/2014.
 */
@RunWith(MockitoJUnitRunner.class)
public class PartyControllerTest {
    @Mock
    private PartyService partyService;

    private Party party;

    @InjectMocks
    PartyController partyController = new PartyController();

    @Before
      public void setup() {
        party = new Party.Builder().withName("Party").withLocation("Antwerpem").withStartDate(new Date()).build();
    }

    @Test
    public void canCreateNewParty() {
        partyController.saveOrUpdate(party);
        Mockito.verify(partyService, Mockito.times(1)).add(party);
    }

    @Test
    public void canCreateNewParty_ThrowsExceptionWithNull() {
        Mockito.doThrow(new IllegalArgumentException()).when(partyService).add(null);
        assertEquals("error", partyController.saveOrUpdate(null));
    }

    @Test
    public void canGetAllPartiesForGivenLocation(){
        List<Party> mockPartyList = new ArrayList<>();
        mockPartyList.add(party);
        Mockito.when(partyService.getPartiesByLocation("ALocation")).thenReturn(mockPartyList);
        List<Party> parties = partyController.getPartiesByLocation("ALocation");
        assertNotNull(parties);
        assertFalse(parties.isEmpty());
    }

}
