/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AverageGrade;

import ORM.Markedworks;
import ORM.Students;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jermaine
 */
public class Ks5AverageGradeTest {
    
    public Ks5AverageGradeTest() {
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
     * Test of setStudnent method, of class Ks5AverageGrade.
     */
    @Test
    public void testSetStudnent() {
        System.out.println("setStudnent");
        Students s1 = null;
        Ks5AverageGrade instance = new Ks5AverageGrade();
        instance.setStudnent(s1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMarkedWork method, of class Ks5AverageGrade.
     */
    @Test
    public void testSetMarkedWork() {
        System.out.println("setMarkedWork");
        Markedworks m = null;
        Ks5AverageGrade instance = new Ks5AverageGrade();
        instance.setMarkedWork(m);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcAverageGrade method, of class Ks5AverageGrade.
     */
    @Test
    public void testCalcAverageGrade() {
        System.out.println("calcAverageGrade");
        Ks5AverageGrade instance = new Ks5AverageGrade();
        instance.calcAverageGrade();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcValueAdded method, of class Ks5AverageGrade.
     */
    @Test
    public void testCalcValueAdded() {
        System.out.println("calcValueAdded");
        Ks5AverageGrade instance = new Ks5AverageGrade();
        double expResult = 0.0;
        double result = instance.calcValueAdded();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
