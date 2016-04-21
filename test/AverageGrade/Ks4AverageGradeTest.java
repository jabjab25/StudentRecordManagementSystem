/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AverageGrade;

import ORM.Classes;
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
public class Ks4AverageGradeTest {
    
    public Ks4AverageGradeTest() {
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
     * Test of setStudnent method, of class Ks4AverageGrade.
     */
//    @Test
//    public void testSetStudnent() {
//        System.out.println("setStudnent");
//        Students s1 = null;
//        Ks4AverageGrade instance = new Ks4AverageGrade();
//        instance.setStudnent(s1);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of setMarkedWork method, of class Ks4AverageGrade.
     */
//    @Test
//    public void testSetMarkedWork() {
//        System.out.println("setMarkedWork");
//        Markedworks m = null;
//        Ks4AverageGrade instance = new Ks4AverageGrade();
//        instance.setMarkedWork(m);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of calcAverageGrade method, of class Ks4AverageGrade.
     */
    @Test
    public void testCalcAverageGrade() {
        System.out.println("calcAverageGrade");
        Markedworks ints = new Markedworks();
        Classes i1 = new Classes();
        i1.setClassId();
        i1.setKeyStage("ks4");
        ints.setClassId(i1);
        ints.setTask1("A");
        ints.setTask2("B");
        ints.setTask3("C");
        ints.setTask4("D");
        ints.setTask5("E");
        Ks4AverageGrade instance = new Ks4AverageGrade();
        instance.setMarkedWork(ints);
        instance.calcAverageGrade();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of calcValueAdded method, of class Ks4AverageGrade.
     */
    @Test
    public void testCalcValueAdded() {
        System.out.println("calcValueAdded");
        Markedworks ints = new Markedworks();
        Classes i1 = new Classes();
        Students s1 = new Students();
        i1.setClassId();
        i1.setKeyStage("ks4");
        s1.setClassId(i1);
        s1.setTargetGrade("B");
        ints.setClassId(i1);
        ints.setTask1("A");
        ints.setTask2("B");
        ints.setTask3("C");
        ints.setTask4("D");
        ints.setTask5("E");
        Ks4AverageGrade instance = new Ks4AverageGrade();
        instance.setMarkedWork(ints);
        instance.setStudnent(s1);
        double expResult = -1.0;
        double result = instance.calcValueAdded();
        assertEquals(expResult, result,0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
