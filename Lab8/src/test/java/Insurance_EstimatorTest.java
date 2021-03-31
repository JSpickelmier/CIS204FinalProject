/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Jacks
 */
public class Insurance_EstimatorTest {

    public Insurance_EstimatorTest() {
    }

    @Test
    public void testCalculateLifeInsurance() throws InvalidAgeException {
        System.out.println("calculateLifeInsurance");
        int age = 33;
        double expResult = 465;
        double result = Insurance_Estimator.calculateLifeInsurance(age);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testThatExceptionThrown() throws Exception {
        Exception exception = assertThrows(InvalidAgeException.class, () -> {
            Insurance_Estimator.calculateLifeInsurance(2);
        });
    }

}
