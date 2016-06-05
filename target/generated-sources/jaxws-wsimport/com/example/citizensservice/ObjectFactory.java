
package com.example.citizensservice;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.citizensservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CitizenList_QNAME = new QName("http://www.example.com/CitizensService", "citizenList");
    private final static QName _Void_QNAME = new QName("http://www.example.com/CitizensService", "void");
    private final static QName _Citizen_QNAME = new QName("http://www.example.com/CitizensService", "citizen");
    private final static QName _Integer_QNAME = new QName("http://www.example.com/CitizensService", "integer");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.citizensservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Citizen }
     * 
     */
    public Citizen createCitizen() {
        return new Citizen();
    }

    /**
     * Create an instance of {@link Void }
     * 
     */
    public Void createVoid() {
        return new Void();
    }

    /**
     * Create an instance of {@link CitizenList }
     * 
     */
    public CitizenList createCitizenList() {
        return new CitizenList();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CitizenList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.com/CitizensService", name = "citizenList")
    public JAXBElement<CitizenList> createCitizenList(CitizenList value) {
        return new JAXBElement<CitizenList>(_CitizenList_QNAME, CitizenList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Void }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.com/CitizensService", name = "void")
    public JAXBElement<Void> createVoid(Void value) {
        return new JAXBElement<Void>(_Void_QNAME, Void.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Citizen }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.com/CitizensService", name = "citizen")
    public JAXBElement<Citizen> createCitizen(Citizen value) {
        return new JAXBElement<Citizen>(_Citizen_QNAME, Citizen.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.com/CitizensService", name = "integer")
    public JAXBElement<BigInteger> createInteger(BigInteger value) {
        return new JAXBElement<BigInteger>(_Integer_QNAME, BigInteger.class, null, value);
    }

}
