/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.services;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author estudiante
 */
public class ConvServicesTest {
    
    public ConvServicesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of CelsiusFahrenheit method, of class ConvServices.
     */
    @Test
    public void testCelsiusFahrenheit() {
        System.out.println("CelsiusFahrenheit");
        float celsius = 10.0F;
        ConvServices instance = new ConvServices();
        float expResult = 50.0F;
        float result = instance.CelsiusFahrenheit(celsius);
        assertEquals(expResult, result, 50.0);
        System.out.println(celsius+"Celsius a Fahrenheit es:"+expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of FahrenheitCelsius method, of class ConvServices.
     */
    @Test
    public void testFahrenheitCelsius() {
        System.out.println("FahrenheitCelsius");
        float fahrenheit = 24.0F;
        ConvServices instance = new ConvServices();
        float expResult = -8.0F;
        float result = instance.FahrenheitCelsius(fahrenheit);
        assertEquals(expResult, result, -8.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
