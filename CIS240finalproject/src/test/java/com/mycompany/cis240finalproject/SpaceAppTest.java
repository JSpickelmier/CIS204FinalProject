/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cis240finalproject;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Jacks
 */
public class SpaceAppTest {
    
    public SpaceAppTest() {
    }

    /**
     * Test of main method, of class SpaceApp.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        SpaceApp.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ReturnTripDeltaV method, of class SpaceApp.
     */
    @Test
    public void testReturnTripDeltaV() {
        System.out.println("ReturnTripDeltaV");
        double DeltaV = 0.0;
        SpaceApp instance = new SpaceApp();
        double expResult = 0.0;
        double result = instance.ReturnTripDeltaV(DeltaV);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ReturnTripCost method, of class SpaceApp.
     */
    @Test
    public void testReturnTripCost() {
        System.out.println("ReturnTripCost");
        double Cost = 0.0;
        SpaceApp instance = new SpaceApp();
        double expResult = 0.0;
        double result = instance.ReturnTripCost(Cost);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of TripType method, of class SpaceApp.
     */
    @Test
    public void testTripType() {
        System.out.println("TripType");
        SpaceApp instance = new SpaceApp();
        int expResult = 0;
        int result = instance.TripType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Destination method, of class SpaceApp.
     */
    @Test
    public void testDestination() {
        System.out.println("Destination");
        SpaceApp instance = new SpaceApp();
        int expResult = 0;
        int result = instance.Destination();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of LEO method, of class SpaceApp.
     */
    @Test
    public void testLEO() {
        System.out.println("LEO");
        SpaceApp instance = new SpaceApp();
        boolean expResult = false;
        boolean result = instance.LEO();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of MercuryGet method, of class SpaceApp.
     */
    @Test
    public void testMercuryGet() {
        System.out.println("MercuryGet");
        SpaceApp instance = new SpaceApp();
        Planet expResult = null;
        Planet result = instance.MercuryGet();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of VenusGet method, of class SpaceApp.
     */
    @Test
    public void testVenusGet() {
        System.out.println("VenusGet");
        SpaceApp instance = new SpaceApp();
        Planet expResult = null;
        Planet result = instance.VenusGet();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of EarthGet method, of class SpaceApp.
     */
    @Test
    public void testEarthGet() {
        System.out.println("EarthGet");
        SpaceApp instance = new SpaceApp();
        Planet expResult = null;
        Planet result = instance.EarthGet();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of MarsGet method, of class SpaceApp.
     */
    @Test
    public void testMarsGet() {
        System.out.println("MarsGet");
        SpaceApp instance = new SpaceApp();
        Planet expResult = null;
        Planet result = instance.MarsGet();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of JupiterGet method, of class SpaceApp.
     */
    @Test
    public void testJupiterGet() {
        System.out.println("JupiterGet");
        SpaceApp instance = new SpaceApp();
        Planet expResult = null;
        Planet result = instance.JupiterGet();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SaturnGet method, of class SpaceApp.
     */
    @Test
    public void testSaturnGet() {
        System.out.println("SaturnGet");
        SpaceApp instance = new SpaceApp();
        Planet expResult = null;
        Planet result = instance.SaturnGet();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of UranusGet method, of class SpaceApp.
     */
    @Test
    public void testUranusGet() {
        System.out.println("UranusGet");
        SpaceApp instance = new SpaceApp();
        Planet expResult = null;
        Planet result = instance.UranusGet();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of NeptuneGet method, of class SpaceApp.
     */
    @Test
    public void testNeptuneGet() {
        System.out.println("NeptuneGet");
        SpaceApp instance = new SpaceApp();
        Planet expResult = null;
        Planet result = instance.NeptuneGet();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of PlutoGet method, of class SpaceApp.
     */
    @Test
    public void testPlutoGet() {
        System.out.println("PlutoGet");
        SpaceApp instance = new SpaceApp();
        Planet expResult = null;
        Planet result = instance.PlutoGet();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of PlanetReturn method, of class SpaceApp.
     */
    @Test
    public void testPlanetReturn() {
        System.out.println("PlanetReturn");
        SpaceApp instance = new SpaceApp();
        Planet expResult = null;
        Planet result = instance.PlanetReturn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of MoonNames method, of class SpaceApp.
     */
    @Test
    public void testMoonNames() {
        System.out.println("MoonNames");
        Planet inputplnt = null;
        SpaceApp instance = new SpaceApp();
        ArrayList expResult = null;
        ArrayList result = instance.MoonNames(inputplnt);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of MercuryFiller method, of class SpaceApp.
     */
    @Test
    public void testMercuryFiller() {
        System.out.println("MercuryFiller");
        SpaceApp instance = new SpaceApp();
        instance.MercuryFiller();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of VenusFiller method, of class SpaceApp.
     */
    @Test
    public void testVenusFiller() {
        System.out.println("VenusFiller");
        SpaceApp instance = new SpaceApp();
        instance.VenusFiller();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of EarthFiller method, of class SpaceApp.
     */
    @Test
    public void testEarthFiller() {
        System.out.println("EarthFiller");
        SpaceApp instance = new SpaceApp();
        instance.EarthFiller();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of MarsFiller method, of class SpaceApp.
     */
    @Test
    public void testMarsFiller() {
        System.out.println("MarsFiller");
        SpaceApp instance = new SpaceApp();
        instance.MarsFiller();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of JupiterFiller method, of class SpaceApp.
     */
    @Test
    public void testJupiterFiller() {
        System.out.println("JupiterFiller");
        SpaceApp instance = new SpaceApp();
        instance.JupiterFiller();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SaturnFiller method, of class SpaceApp.
     */
    @Test
    public void testSaturnFiller() {
        System.out.println("SaturnFiller");
        SpaceApp instance = new SpaceApp();
        instance.SaturnFiller();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of UranusFiller method, of class SpaceApp.
     */
    @Test
    public void testUranusFiller() {
        System.out.println("UranusFiller");
        SpaceApp instance = new SpaceApp();
        instance.UranusFiller();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of NeptuneFiller method, of class SpaceApp.
     */
    @Test
    public void testNeptuneFiller() {
        System.out.println("NeptuneFiller");
        SpaceApp instance = new SpaceApp();
        instance.NeptuneFiller();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of PlutoFiller method, of class SpaceApp.
     */
    @Test
    public void testPlutoFiller() {
        System.out.println("PlutoFiller");
        SpaceApp instance = new SpaceApp();
        instance.PlutoFiller();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SatBOXRtrn method, of class SpaceApp.
     */
    @Test
    public void testSatBOXRtrn() {
        System.out.println("SatBOXRtrn");
        SpaceApp instance = new SpaceApp();
        int expResult = 0;
        int result = instance.SatBOXRtrn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SatelittesRtrn method, of class SpaceApp.
     */
    @Test
    public void testSatelittesRtrn() {
        System.out.println("SatelittesRtrn");
        Planet InputP = null;
        int SatIndex = 0;
        SpaceApp instance = new SpaceApp();
        Sattelites expResult = null;
        Sattelites result = instance.SatelittesRtrn(InputP, SatIndex);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SatDestination method, of class SpaceApp.
     */
    @Test
    public void testSatDestination() {
        System.out.println("SatDestination");
        SpaceApp instance = new SpaceApp();
        boolean expResult = false;
        boolean result = instance.SatDestination();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of TwoWayTravelTime method, of class SpaceApp.
     */
    @Test
    public void testTwoWayTravelTime() {
        System.out.println("TwoWayTravelTime");
        String Time = "";
        SpaceApp instance = new SpaceApp();
        String expResult = "";
        String result = instance.TwoWayTravelTime(Time);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CostFormatter method, of class SpaceApp.
     */
    @Test
    public void testCostFormatter() {
        System.out.println("CostFormatter");
        Double input = null;
        SpaceApp instance = new SpaceApp();
        String expResult = "";
        String result = instance.CostFormatter(input);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
