/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.citizensseeker.enums;

/**
 *
 * @author efraintoribioreyes
 */
public enum Gender {
    Male("Male"), Female("Female");
    
    private String label;
    
    private Gender(String label) {
        this.label = label;
    }
    
    public String getLabel() {
        return label;
    }
}
