package com.mycompany.citizensseeker.entity;

import com.mycompany.citizensseeker.enums.Gender;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-06-05T16:07:39")
@StaticMetamodel(Citizen.class)
public class Citizen_ { 

    public static volatile SingularAttribute<Citizen, String> firstName;
    public static volatile SingularAttribute<Citizen, String> lastName;
    public static volatile SingularAttribute<Citizen, String> emailAddress;
    public static volatile SingularAttribute<Citizen, String> phoneNumber;
    public static volatile SingularAttribute<Citizen, Gender> gender;
    public static volatile SingularAttribute<Citizen, Integer> idcitizens;
    public static volatile SingularAttribute<Citizen, String> dateBirth;
    public static volatile SingularAttribute<Citizen, String> direction;

}