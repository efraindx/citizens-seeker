/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.citizensseeker.entity;

import com.mycompany.citizensseeker.enums.Gender;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author efraintoribioreyes
 */
@Entity
@Table(name = "citizens")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Citizen.findAll", query = "SELECT c FROM Citizen c"),
    @NamedQuery(name = "Citizen.findByIdcitizens", query = "SELECT c FROM Citizen c WHERE c.idcitizens = :idcitizens"),
    @NamedQuery(name = "Citizen.findByFirstName", query = "SELECT c FROM Citizen c WHERE c.firstName = :firstName"),
    @NamedQuery(name = "Citizen.findByLastName", query = "SELECT c FROM Citizen c WHERE c.lastName = :lastName"),
    @NamedQuery(name = "Citizen.findByGender", query = "SELECT c FROM Citizen c WHERE c.gender = :gender"),
    @NamedQuery(name = "Citizen.findByDateBirth", query = "SELECT c FROM Citizen c WHERE c.dateBirth = :dateBirth"),
    @NamedQuery(name = "Citizen.findByEmailAdress", query = "SELECT c FROM Citizen c WHERE c.emailAdress = :emailAdress"),
    @NamedQuery(name = "Citizen.findByPhoneNumber", query = "SELECT c FROM Citizen c WHERE c.phoneNumber = :phoneNumber")})
public class Citizen implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    @Basic(optional = false)
    @NotNull
    @Column(name = "idcitizens")
    private Integer idcitizens;
    @Size(max = 45)
    @Column(name = "first_name")
    private String firstName;
    @Size(max = 45)
    @Column(name = "last_name")
    private String lastName;
    
    @Enumerated
    @Size(max = 45)
    @Column(name = "gender")
    private Gender gender;
    
    @Size(max = 45)
    @Column(name = "date_birth")
    private String dateBirth;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "direction")
    private String direction;
    @Size(max = 45)
    @Column(name = "email_address")
    private String emailAddress;
    @Size(max = 45)
    @Column(name = "phone_number")
    private String phoneNumber;

    public Citizen() {
    }

    public Citizen(Integer idcitizens) {
        this.idcitizens = idcitizens;
    }

    public Integer getIdcitizens() {
        return idcitizens;
    }

    public void setIdcitizens(Integer idcitizens) {
        this.idcitizens = idcitizens;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcitizens != null ? idcitizens.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Citizen)) {
            return false;
        }
        Citizen other = (Citizen) object;
        if ((this.idcitizens == null && other.idcitizens != null) || (this.idcitizens != null && !this.idcitizens.equals(other.idcitizens))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.citizensseeker.entity.Citizen[ idcitizens=" + idcitizens + " ]";
    }
    
}
