package com.mycompany.cis240finalproject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author Jacks
 */
public class Planet {
    private String Name;
    private String TravelTime;
    private double DeltaVCapture;
    private double DeltaVLowOrbit;
    private double DeltaVLanding;
    private ArrayList<Sattelites> Moons = new ArrayList(); 
    
    public Planet (String Name, String TravelTime, double DeltaVCapture, double DeltaVLowOrbit, double DeltaVLanding, ArrayList<Sattelites> Moons) {
    this.Name = Name;
    this.TravelTime = TravelTime;
    this.DeltaVCapture = DeltaVCapture;
    this.DeltaVLowOrbit = DeltaVLowOrbit;
    this.DeltaVLanding = DeltaVLanding;
    this.Moons = Moons;
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
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getTraveltime() {
        return TravelTime;
    }

    public void setTraveltime(String Traveltime) {
        this.TravelTime = Traveltime;
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

    public ArrayList<Sattelites> getSattelites() {
        return Moons;
    }

    public void setSattelites(ArrayList<Sattelites> Sattelites) {
        this.Moons = Sattelites;
    }

    @Override
    public String toString() {
        return "Planet{" + "Name=" + Name + ", TravelTime=" + TravelTime + ", DeltaVCapture=" + DeltaVCapture + ", DeltaVLowOrbit=" + DeltaVLowOrbit + ", DeltaVLanding=" + DeltaVLanding + ", Moons=" + Moons + '}';
    }
    
    
}