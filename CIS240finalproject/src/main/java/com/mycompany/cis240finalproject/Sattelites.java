/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cis240finalproject;



/**
 *
 * @author Jacks
 */
public class Sattelites {
    private Planet HomePlanet;
    private String Name;
    private String TravelTime;
    private double DeltaVCapture;
    private double DeltaVLowOrbit;
    private double DeltaVLanding;
    
   public Sattelites (Planet HomePlanet, String Name, String TravelTime, double DeltaVCapture, double DeltaVLowOrbit, double DeltaVLanding ) {
    this.HomePlanet = HomePlanet;
    this.Name = Name;
    this.TravelTime = TravelTime;
    this.DeltaVCapture = DeltaVCapture;
    this.DeltaVLowOrbit = DeltaVLowOrbit;
    this.DeltaVLanding = DeltaVLanding;
   }

    public double CostOfJourneyHighOrbit() {
        return DeltaVCapture * 100000;
    }
    
    public double CostOfJourneyLowOrbit() {
        return DeltaVLowOrbit * 100000;
    }
    
    public double CostOfJourneyLanding() {
        return DeltaVLanding * 100000;
    }

   
    public Planet getHomePlanet() {
        return HomePlanet;
    }

    public void setHomePlanet(Planet HomePlanet) {
        this.HomePlanet = HomePlanet;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getTravelTime() {
        return TravelTime;
    }

    public void setTravelTime(String TravelTime) {
        this.TravelTime = TravelTime;
    }

    public double getDeltaVCapture() {
        return DeltaVCapture;
    }

    public void setDeltaVCapture(double DeltaVCapture) {
        this.DeltaVCapture = DeltaVCapture;
    }

    public double getDeltaVLowOrbit() {
        return DeltaVLowOrbit;
    }

    public void setDeltaVLowOrbit(double DeltaVLowOrbit) {
        this.DeltaVLowOrbit = DeltaVLowOrbit;
    }

    public double getDeltaVLanding() {
        return DeltaVLanding;
    }

    public void setDeltaVLanding(double DeltaVLanding) {
        this.DeltaVLanding = DeltaVLanding;
    }

    @Override
    public String toString() {
        return "Sattelites{" + "HomePlanet=" + HomePlanet + ", Name=" + Name + ", TravelTime=" + TravelTime + ", DeltaVCapture=" + DeltaVCapture + ", DeltaVLowOrbit=" + DeltaVLowOrbit + ", DeltaVLanding=" + DeltaVLanding + '}';
    }
   
   
   
}


