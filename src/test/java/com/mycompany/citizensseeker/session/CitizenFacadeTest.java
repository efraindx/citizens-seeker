/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.citizensseeker.session;

import com.mycompany.citizensseeker.entity.Citizen;
import java.util.List;
import javax.ejb.embeddable.EJBContainer;
import javax.naming.NamingException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author efraintoribioreyes
 */
public class CitizenFacadeTest {
    
    public CitizenFacadeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of find method, of class CitizenFacade.
     */
    //@org.junit.Test
    public void testEJB() throws NamingException {
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        CitizenFacade instance = (CitizenFacade)container.getContext().lookup("java:global/classes/CitizenFacade");
        assertNotNull(instance.findAll());
        container.close();
    }
    
}
