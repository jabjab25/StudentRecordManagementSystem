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
public class Ks3AverageGradeTest {
    
    public Ks3AverageGradeTest() {
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
     * Test of setStudnent method, of class Ks3AverageGrade.
     */
 //   @Test
//    public void testSetStudnent() {
//        System.out.println("setStudnent");
//        Students s1 = null;
//        Ks3AverageGrade instance = new Ks3AverageGrade();
//        instance.setStudnent(s1);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of setMarkedWork method, of class Ks3AverageGrade.
     */
//    @Test
//    public void testSetMarkedWork() {
//        System.out.println("setMarkedWork");
//        Markedworks m = null;
//        Ks3AverageGrade instance = new Ks3AverageGrade();
//        instance.setMarkedWork(m);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of calcAverageGrade method, of class Ks3AverageGrade.
     */
    @Test
    public void testCalcAverageGrade() {
        System.out.println("calcAverageGrade");
        Markedworks ints = new Markedworks();
        Classes i1 = new Classes();
        i1.setClassId();
        i1.setKeyStage("ks3");
        ints.setClassId(i1);
        ints.setTask1("5a");
        ints.setTask2("5c");
        ints.setTask3("4a");
        ints.setTask4("7a");
        ints.setTask5("6a");
        Ks3AverageGrade instance = new Ks3AverageGrade();
        instance.setMarkedWork(ints);
        instance.calcAverageGrade();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    @Test 
    public void testValueAdded()
    {
        System.out.println("calcValueAdded");
        Markedworks ints = new Markedworks();
        Classes i1 = new Classes();
        Students s1 = new Students();
        i1.setClassId();
        i1.setKeyStage("ks3");
        ints.setClassId(i1);
        s1.setStudentId();
        s1.setClassId(i1);
        s1.setTargetGrade("5c");
        ints.setTask1("5a");
        ints.setTask2("5c");
        ints.setTask3("4a");
        ints.setTask4("7a");
        ints.setTask5("6a");
        Ks3AverageGrade instance = new Ks3AverageGrade();
        instance.setMarkedWork(ints);
        instance.setStudnent(s1);
        instance.calcValueAdded();
        double expResult = 0.88;
        System.out.println("expected result should be " + expResult);
        double result = instance.calcValueAdded();
        System.out.println("result is "+ result);
        
    }
    
    
}
