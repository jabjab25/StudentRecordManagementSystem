/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ORM;

import java.util.List;
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
public class MarkedworksTest {
    
    public MarkedworksTest() {
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
     * Test of getMarkedWorkId method, of class Markedworks.
     */
    @Test
    public void testGetMarkedWorkId() {
        System.out.println("getMarkedWorkId");
        Markedworks instance = new Markedworks();
        String expResult = "1";
        instance.setMarkedWorkId();
        String result = instance.getMarkedWorkId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

//    /**
//     * Test of setMarkedWorkId method, of class Markedworks.
//     */
//    @Test
//    public void testSetMarkedWorkId() {
//        System.out.println("setMarkedWorkId");
//        String markedWorkId = "";
//        Markedworks instance = new Markedworks();
//        instance.setMarkedWorkId();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of getTask1 method, of class Markedworks.
     */
    @Test
    public void testGetTask1() {
        System.out.println("getTask1");
        Markedworks instance = new Markedworks();
        String expResult = "4a";
        instance.setTask1("4a");
        String result = instance.getTask1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTask1 method, of class Markedworks.
     */
//    @Test
//    public void testSetTask1() {
//        System.out.println("setTask1");
//        String task1 = "";
//        Markedworks instance = new Markedworks();
//        instance.setTask1(task1);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of getTask2 method, of class Markedworks.
     */
    @Test
    public void testGetTask2() {
        System.out.println("getTask2");
        Markedworks instance = new Markedworks();
        String expResult = "B";
        instance.setTask2("B");
        String result = instance.getTask2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTask2 method, of class Markedworks.
     */
//    @Test
//    public void testSetTask2() {
//        System.out.println("setTask2");
//        String task2 = "";
//        Markedworks instance = new Markedworks();
//        instance.setTask2(task2);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of getTask3 method, of class Markedworks.
     */
    @Test
    public void testGetTask3() {
        System.out.println("getTask3");
        Markedworks instance = new Markedworks();
        String expResult = "73";
        instance.setTask3("73");
        String result = instance.getTask3();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTask3 method, of class Markedworks.
     */
//    @Test
//    public void testSetTask3() {
//        System.out.println("setTask3");
//        String task3 = "";
//        Markedworks instance = new Markedworks();
//        instance.setTask3(task3);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of getTask4 method, of class Markedworks.
     */
    @Test
    public void testGetTask4() {
        System.out.println("getTask4");
        Markedworks instance = new Markedworks();
        String expResult = "";
        String result = instance.getTask4();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTask4 method, of class Markedworks.
     */
    @Test
    public void testSetTask4() {
        System.out.println("setTask4");
        String task4 = "";
        Markedworks instance = new Markedworks();
        instance.setTask4(task4);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTask5 method, of class Markedworks.
     */
    @Test
    public void testGetTask5() {
        System.out.println("getTask5");
        Markedworks instance = new Markedworks();
        String expResult = "";
        String result = instance.getTask5();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTask5 method, of class Markedworks.
     */
    @Test
    public void testSetTask5() {
        System.out.println("setTask5");
        String task5 = "";
        Markedworks instance = new Markedworks();
        instance.setTask5(task5);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTask6 method, of class Markedworks.
     */
    @Test
    public void testGetTask6() {
        System.out.println("getTask6");
        Markedworks instance = new Markedworks();
        String expResult = "";
        String result = instance.getTask6();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTask6 method, of class Markedworks.
     */
    @Test
    public void testSetTask6() {
        System.out.println("setTask6");
        String task6 = "";
        Markedworks instance = new Markedworks();
        instance.setTask6(task6);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTask7 method, of class Markedworks.
     */
    @Test
    public void testGetTask7() {
        System.out.println("getTask7");
        Markedworks instance = new Markedworks();
        String expResult = "";
        String result = instance.getTask7();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTask7 method, of class Markedworks.
     */
    @Test
    public void testSetTask7() {
        System.out.println("setTask7");
        String task7 = "";
        Markedworks instance = new Markedworks();
        instance.setTask7(task7);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTask8 method, of class Markedworks.
     */
    @Test
    public void testGetTask8() {
        System.out.println("getTask8");
        Markedworks instance = new Markedworks();
        String expResult = "";
        String result = instance.getTask8();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTask8 method, of class Markedworks.
     */
    @Test
    public void testSetTask8() {
        System.out.println("setTask8");
        String task8 = "";
        Markedworks instance = new Markedworks();
        instance.setTask8(task8);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTask9 method, of class Markedworks.
     */
    @Test
    public void testGetTask9() {
        System.out.println("getTask9");
        Markedworks instance = new Markedworks();
        String expResult = "";
        String result = instance.getTask9();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTask9 method, of class Markedworks.
     */
    @Test
    public void testSetTask9() {
        System.out.println("setTask9");
        String task9 = "";
        Markedworks instance = new Markedworks();
        instance.setTask9(task9);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTask10 method, of class Markedworks.
     */
    @Test
    public void testGetTask10() {
        System.out.println("getTask10");
        Markedworks instance = new Markedworks();
        String expResult = "";
        String result = instance.getTask10();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTask10 method, of class Markedworks.
     */
    @Test
    public void testSetTask10() {
        System.out.println("setTask10");
        String task10 = "";
        Markedworks instance = new Markedworks();
        instance.setTask10(task10);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStudentsList method, of class Markedworks.
     */
    @Test
    public void testGetStudentsList() {
        System.out.println("getStudentsList");
        Markedworks instance = new Markedworks();
        List<Students> expResult = null;
        List<Students> result = instance.getStudentsList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStudentsList method, of class Markedworks.
     */
    @Test
    public void testSetStudentsList() {
        System.out.println("setStudentsList");
        List<Students> studentsList = null;
        Markedworks instance = new Markedworks();
        instance.setStudentsList(studentsList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTeacherId method, of class Markedworks.
     */
    @Test
    public void testGetTeacherId() {
        System.out.println("getTeacherId");
        Markedworks instance = new Markedworks();
        Teachers expResult = null;
        Teachers result = instance.getTeacherId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTeacherId method, of class Markedworks.
     */
    @Test
    public void testSetTeacherId() {
        System.out.println("setTeacherId");
        Teachers teacherId = null;
        Markedworks instance = new Markedworks();
        instance.setTeacherId(teacherId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStudentId method, of class Markedworks.
     */
    @Test
    public void testGetStudentId() {
        System.out.println("getStudentId");
        Markedworks instance = new Markedworks();
        Students expResult = null;
        Students result = instance.getStudentId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStudentId method, of class Markedworks.
     */
    @Test
    public void testSetStudentId() {
        System.out.println("setStudentId");
        Students studentId = null;
        Markedworks instance = new Markedworks();
        instance.setStudentId(studentId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getClassId method, of class Markedworks.
     */
    @Test
    public void testGetClassId() {
        System.out.println("getClassId");
        Markedworks instance = new Markedworks();
        Classes expResult = null;
        Classes result = instance.getClassId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setClassId method, of class Markedworks.
     */
    @Test
    public void testSetClassId() {
        System.out.println("setClassId");
        Classes classId = null;
        Markedworks instance = new Markedworks();
        instance.setClassId(classId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTeachersList method, of class Markedworks.
     */
    @Test
    public void testGetTeachersList() {
        System.out.println("getTeachersList");
        Markedworks instance = new Markedworks();
        List<Teachers> expResult = null;
        List<Teachers> result = instance.getTeachersList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTeachersList method, of class Markedworks.
     */
    @Test
    public void testSetTeachersList() {
        System.out.println("setTeachersList");
        List<Teachers> teachersList = null;
        Markedworks instance = new Markedworks();
        instance.setTeachersList(teachersList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getClassesList method, of class Markedworks.
     */
    @Test
    public void testGetClassesList() {
        System.out.println("getClassesList");
        Markedworks instance = new Markedworks();
        List<Classes> expResult = null;
        List<Classes> result = instance.getClassesList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setClassesList method, of class Markedworks.
     */
    @Test
    public void testSetClassesList() {
        System.out.println("setClassesList");
        List<Classes> classesList = null;
        Markedworks instance = new Markedworks();
        instance.setClassesList(classesList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Markedworks.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Markedworks instance = new Markedworks();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Markedworks.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Markedworks instance = new Markedworks();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Markedworks.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Markedworks instance = new Markedworks();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
