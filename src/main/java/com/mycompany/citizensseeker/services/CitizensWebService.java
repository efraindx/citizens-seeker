/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.citizensseeker.services;

import javax.jws.WebService;
import com.mycompany.citizensseeker.session.CitizenFacade;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author efraintoribioreyes
 */
@WebService(serviceName = "CitizensService", portName = "CitizensServiceSOAP", endpointInterface = "org.example.citizensservice.CitizensService", targetNamespace = "http://www.example.org/CitizensService/", wsdlLocation = "WEB-INF/wsdl/CitizensService.wsdl")
public class CitizensWebService {
    
    @EJB
    private CitizenFacade citizenFacade;

    public com.example.citizensservice.Citizen findCitizen(java.math.BigInteger id) {
        
        com.mycompany.citizensseeker.entity.Citizen citizen = citizenFacade.find(id);
        com.example.citizensservice.Citizen citizenWS = new com.example.citizensservice.Citizen();
        citizenWS.setId(BigInteger.valueOf(citizen.getIdcitizens()));
        citizenWS.setFirstName(citizen.getFirstName());
        citizenWS.setLastName(citizen.getLastName());
        citizenWS.setDirection(citizen.getDirection());
        citizenWS.setEmailAddress(citizen.getEmailAddress());
        citizenWS.setGender(com.example.citizensservice.GenderType.fromValue(citizen.getGender().toString()));
        citizenWS.setPhoneNumber(citizen.getPhoneNumber());
        
        return citizenWS;
    }

    public void createCitizen(com.example.citizensservice.Citizen citizenWS) {
        com.mycompany.citizensseeker.entity.Citizen citizen = new com.mycompany.citizensseeker.entity.Citizen();
        citizen.setFirstName(citizenWS.getFirstName());
        citizen.setLastName(citizenWS.getLastName());
        citizen.setDirection(citizenWS.getDirection());
        citizen.setEmailAddress(citizenWS.getEmailAddress());
        citizen.setGender(com.mycompany.citizensseeker.enums.Gender.valueOf(citizenWS.getGender().value()));
        citizen.setPhoneNumber(citizenWS.getPhoneNumber());
        
        citizenFacade.create(citizen);
    }

    public void editCitizen(com.example.citizensservice.Citizen citizenWS) {
        com.mycompany.citizensseeker.entity.Citizen citizen = new com.mycompany.citizensseeker.entity.Citizen();
        citizen.setIdcitizens(citizenWS.getId().intValue());
        citizen.setFirstName(citizenWS.getFirstName());
        citizen.setLastName(citizenWS.getLastName());
        citizen.setDirection(citizenWS.getDirection());
        citizen.setEmailAddress(citizenWS.getEmailAddress());
        citizen.setGender(com.mycompany.citizensseeker.enums.Gender.valueOf(citizenWS.getGender().value()));
        citizen.setPhoneNumber(citizenWS.getPhoneNumber());
        
        citizenFacade.edit(citizen);
    }

    public void removeCitizen(com.example.citizensservice.Citizen citizenWS) {
        com.mycompany.citizensseeker.entity.Citizen citizen = new com.mycompany.citizensseeker.entity.Citizen();
        citizen.setIdcitizens(citizenWS.getId().intValue());
        citizen.setFirstName(citizenWS.getFirstName());
        citizen.setLastName(citizenWS.getLastName());
        citizen.setDirection(citizenWS.getDirection());
        citizen.setEmailAddress(citizenWS.getEmailAddress());
        citizen.setGender(com.mycompany.citizensseeker.enums.Gender.valueOf(citizenWS.getGender().value()));
        citizen.setPhoneNumber(citizenWS.getPhoneNumber());
        
        citizenFacade.remove(citizen);
    }

    public com.example.citizensservice.CitizenList findAllCitizens(com.example.citizensservice.Void findAllCitizensRequest) {
        com.example.citizensservice.CitizenList citizenList = new com.example.citizensservice.CitizenList();
        
        List<com.mycompany.citizensseeker.entity.Citizen> citizens = citizenFacade.findAll();
        
        for(com.mycompany.citizensseeker.entity.Citizen citizen : citizens) {
            com.example.citizensservice.Citizen citizenWS = new com.example.citizensservice.Citizen();
            citizenWS.setId(BigInteger.valueOf(citizen.getIdcitizens()));
            citizenWS.setFirstName(citizen.getFirstName());
            citizenWS.setLastName(citizen.getLastName());
            citizenWS.setDirection(citizen.getDirection());
            citizenWS.setEmailAddress(citizen.getEmailAddress());
            citizenWS.setGender(com.example.citizensservice.GenderType.fromValue(citizen.getGender().toString()));
            citizenWS.setPhoneNumber(citizen.getPhoneNumber());
            
            citizenList.getCitizen().add(citizenWS);
        }
        return citizenList;
    }
    
}
