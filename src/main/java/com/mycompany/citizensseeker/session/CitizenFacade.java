/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.citizensseeker.session;

import com.mycompany.citizensseeker.entity.Citizen;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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
    
}
