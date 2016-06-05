/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.citizensseeker.controllers;

import com.mycompany.citizensseeker.enums.Gender;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author efraintoribioreyes
 */
@ManagedBean
@ViewScoped
public class EnumValuesProvider implements Serializable {
    
    public Gender[] getGenders() {
        return Gender.values();
    }
}
