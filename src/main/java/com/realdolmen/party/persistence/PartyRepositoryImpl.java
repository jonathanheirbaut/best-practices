package com.realdolmen.party.persistence;

import com.realdolmen.party.model.Party;
import com.realdolmen.party.services.PartyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;

/**
 * Created by JHRAU70 on 18/09/2014.
 */
@Stateless
@Named
public class PartyRepositoryImpl implements Serializable, PartyRepository{
    @PersistenceContext
    private EntityManager entityManager;



/*
    private List<Party> parties;
    private Logger logger = LoggerFactory.getLogger(PartyService.class);

    @PostConstruct
    public void init(){
        parties = new ArrayList<>();
        parties.saveOrUpdate(new Party("1", "loc1", "1","1","1","1", new Date()));
        parties.saveOrUpdate(new Party("2", "loc2", "2","2","2","2", new Date()));
        parties.saveOrUpdate(new Party("2", "loc3", "3","3","3","3", new Date()));
    }
*/


/*    @Override
    public void saveOrUpdate(Party party) {
        logger.info("Party " + party.getName() + " is saved");
        parties.saveOrUpdate(party);
    }

    @Override
    public List<Party> getParties() {
        return parties;
    }*/

    @Override
    public Party add(Party party) {
       entityManager.merge(party);
        return party;
    }

    @Override
    public List<Party> getParties() {
        return entityManager.createQuery("SELECT p FROM Party p", Party.class).getResultList();
    }

    @Override
    public void deleteParty(Party party){
       entityManager.remove(entityManager.merge(party));
    }

    @Override
    public List<Party> getPartiesByLocation(String location) {
        return entityManager.createQuery("select p from Party p where p.location = " + location, Party.class).getResultList();
    }
}
