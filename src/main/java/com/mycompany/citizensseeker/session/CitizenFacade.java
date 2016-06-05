/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.citizensseeker.session;

import com.mycompany.citizensseeker.entity.Citizen;
import java.util.Collection;
import javax.annotation.security.PermitAll;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author efraintoribioreyes
 */
@Stateless
public class CitizenFacade extends AbstractFacade<Citizen> {

    @PersistenceContext(unitName = "citizens_jdbcPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CitizenFacade() {
        super(Citizen.class);
    }
    
    @PermitAll
    public int verify() {
        String result = null;
        Query q = em.createNamedQuery("Citizen.findAll");
        Collection entities = q.getResultList();
        int s = entities.size();
        for (Object o : entities) {
            Citizen se = (Citizen)o;
            System.out.println("Found: " + se.getFirstName());
        }

        return s;
    }
    
    @PermitAll
    public void insert(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.println("Inserting # " + i);
            Citizen e = new Citizen(i);
            em.persist(e);
        }
    }
    
}
