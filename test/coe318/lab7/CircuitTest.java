/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package coe318.lab7;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author moizc
 */
public class CircuitTest {
    
    public CircuitTest() {
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
     * Test of add method, of class Circuit, using a null component.
     */
    @Test
    public void testAddNullComponent() {
        System.out.println("add null component");
        Component c = null;
        Circuit instance = Circuit.getInstance();
        
        assertThrows(IllegalArgumentException.class, () -> {instance.add(c);});
    }

    /**
     * Test of toString method, of class Circuit.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        
        VoltageSource vs = new VoltageSource(4.0, 0, 1);
        Resistor r = new Resistor(2.0, 0, 1);
        Circuit instance = Circuit.getInstance();
        
        instance.add(vs);
        instance.add(r);
        
        String expResult = "V1 0 1 DC 4.0\nR1 0 1 2.0";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
