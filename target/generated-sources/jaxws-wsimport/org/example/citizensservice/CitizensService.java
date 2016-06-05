
package org.example.citizensservice;

import java.math.BigInteger;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import com.example.citizensservice.Citizen;
import com.example.citizensservice.CitizenList;
import com.example.citizensservice.ObjectFactory;
import com.example.citizensservice.Void;


/**
 * Interface for provide CRUD Operations to Citizens
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CitizensService", targetNamespace = "http://www.example.org/CitizensService/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CitizensService {


    /**
     * 
     * @param id
     * @return
     *     returns com.example.citizensservice.Citizen
     */
    @WebMethod(action = "http://www.example.org/CitizensService/findCitizen")
    @WebResult(name = "citizen", targetNamespace = "http://www.example.com/CitizensService", partName = "citizen")
    public Citizen findCitizen(
        @WebParam(name = "integer", targetNamespace = "http://www.example.com/CitizensService", partName = "id")
        BigInteger id);

    /**
     * 
     * @param citizen
     */
    @WebMethod(action = "http://www.example.org/CitizensService/createCitizen")
    @Oneway
    public void createCitizen(
        @WebParam(name = "citizen", targetNamespace = "http://www.example.com/CitizensService", partName = "citizen")
        Citizen citizen);

    /**
     * 
     * @param citizen
     */
    @WebMethod(action = "http://www.example.org/CitizensService/editCitizen")
    @Oneway
    public void editCitizen(
        @WebParam(name = "citizen", targetNamespace = "http://www.example.com/CitizensService", partName = "citizen")
        Citizen citizen);

    /**
     * 
     * @param citizen
     */
    @WebMethod(action = "http://www.example.org/CitizensService/removeCitizen")
    @Oneway
    public void removeCitizen(
        @WebParam(name = "citizen", targetNamespace = "http://www.example.com/CitizensService", partName = "citizen")
        Citizen citizen);

    /**
     * 
     * @param findAllCitizensRequest
     * @return
     *     returns com.example.citizensservice.CitizenList
     */
    @WebMethod(action = "http://www.example.org/CitizensService/findAllCitizens")
    @WebResult(name = "citizenList", targetNamespace = "http://www.example.com/CitizensService", partName = "citizens")
    public CitizenList findAllCitizens(
        @WebParam(name = "void", targetNamespace = "http://www.example.com/CitizensService", partName = "findAllCitizensRequest")
        Void findAllCitizensRequest);

}
