/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cis240finalproject;

import java.util.ArrayList;

/**
 *
 * @author Jacks
 */
public class Sattelites extends Planet {
    private Planet HomePlanet;
    
    public Sattelites (String Name, String Traveltime, double DeltaVCapture, double DeltaVLowOrbit, double DeltaVLanding, ArrayList<Sattelites> Moons) {
        super(Name, Traveltime, DeltaVCapture, DeltaVLowOrbit, DeltaVLanding, Moons);
        this.HomePlanet = HomePlanet;
        
    }

    public Planet getHomePlanet() {
        return HomePlanet;
    }

    public void setHomePlanet(Planet HomePlanet) {
        this.HomePlanet = HomePlanet;
    }
    
    
}
