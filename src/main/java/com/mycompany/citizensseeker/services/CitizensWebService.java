/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.citizensseeker.services;

import javax.jws.WebService;

/**
 *
 * @author efraintoribioreyes
 */
@WebService(serviceName = "CitizensService", portName = "CitizensServiceSOAP", endpointInterface = "org.example.citizensservice.CitizensService", targetNamespace = "http://www.example.org/CitizensService/", wsdlLocation = "WEB-INF/wsdl/CitizensService.wsdl")
public class CitizensWebService {

    public com.example.citizensservice.Citizen findCitizen(java.math.BigInteger id) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public void createCitizen(com.example.citizensservice.Citizen citizen) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public void editCitizen(com.example.citizensservice.Citizen citizen) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public void removeCitizen(com.example.citizensservice.Citizen citizen) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public com.example.citizensservice.CitizenList findAllCitizens(com.example.citizensservice.Void findAllCitizensRequest) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }
    
}
