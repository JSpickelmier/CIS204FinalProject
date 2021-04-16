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
    private double Traveltime;
    private double DeltaVCapture;
    private double DeltaVLowOrbit;
    private double DeltaVLanding;
    private ArrayList<String> Sattelites = new ArrayList(); 
    
    public Planet(){
    Name = "";
    Traveltime = 0;
    DeltaVCapture = 0;
    DeltaVLowOrbit = 0;
    DeltaVLanding = 0;   
   
}

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public double getTraveltime() {
        return Traveltime;
    }

    public void setTraveltime(double Traveltime) {
        this.Traveltime = Traveltime;
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

    public ArrayList<String> getSattelites() {
        return Sattelites;
    }

    public void setSattelites(ArrayList<String> Sattelites) {
        this.Sattelites = Sattelites;
    }
    
}