/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.citizensseeker.entity;

import com.mycompany.citizensseeker.enums.Gender;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import com.mycompany.citizensseeker.session.CitizenFacade;
import javax.ejb.embeddable.EJBContainer;
import org.junit.Assert;

/**
 *
 * @author efraintoribioreyes
 */
public class CitizenTest {
    
    public CitizenTest() {
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
     * Test of getIdcitizens method, of class Citizen.
     */
    @Test
    public void testInsert() throws Exception {
       // Lookup the EJB
        System.out.println("Looking up EJB...");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        CitizenFacade instance = (CitizenFacade) container.getContext().lookup("java:global/classes/MyBean");

        System.out.println("Inserting entities...");
        instance.insert(5);
        int res = instance.verify();
        System.out.println("JPA call returned: " + res);
        System.out.println("Done calling EJB");

        Assert.assertTrue("Unexpected number of entities", (res == 5));
        System.out.println("..........SUCCESSFULLY finished embedded test");
    }   
}
