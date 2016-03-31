/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ORM;

import java.util.Date;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jermaine
 */
public class StudentsTest {
    
    public StudentsTest() {
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
     * Test of getStudentId method, of class Students.
     */
    @Test
    public void testGetStudentId() {
        System.out.println("getStudentId");
        Students instance = new Students();
        instance.setStudentId();
        String expResult = "1000";
        String result = instance.getStudentId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setStudentId method, of class Students.
     */
    @Test
    public void testGetStudentId1() {
        System.out.println("setStudentId");
        Students instance = new Students();
        instance.setStudentId();
        String expResult = "1001";
        String result = instance.getStudentId();
        assertEquals(expResult,result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetStudentId2() {
        System.out.println("setStudentId");
        Students instance = new Students();
        instance.setStudentId();
        String expResult = "1002";
        String result = instance.getStudentId();
        assertEquals(expResult,result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getFirstName method, of class Students.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        Students instance = new Students();
        String expResult = "jermaine";
        instance.setFirstName("jermaine");
        String result = instance.getFirstName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setFirstName method, of class Students.
     */
//    @Test
//    public void testSetFirstName() {
//        System.out.println("setFirstName");
//        String firstName = "";
//        Students instance = new Students();
//        instance.setFirstName(firstName);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of getLastName method, of class Students.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        Students instance = new Students();
        instance.setLastName("Bacon");
        String expResult = "Bacon";
        String result = instance.getLastName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setLastName method, of class Students.
     */
//    @Test
//    public void testSetLastName() {
//        System.out.println("setLastName");
//        String lastName = "";
//        Students instance = new Students();
//        instance.setLastName(lastName);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of getEmailAddress method, of class Students.
     */
    @Test
    public void testGetEmailAddress() {
        System.out.println("getEmailAddress");
        Students instance = new Students();
        instance.setEmailAddress("jb13abj@herts.ac.uk");
        String expResult = "jb13abj@herts.ac.uk";
        String result = instance.getEmailAddress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEmailAddress method, of class Students.
     */
//    @Test
//    public void testSetEmailAddress() {
//        System.out.println("setEmailAddress");
//        String emailAddress = "";
//        Students instance = new Students();
//        instance.setEmailAddress(emailAddress);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of getDateOfBirth method, of class Students.
     */
    @Test
    public void testGetDateOfBirth() {
        System.out.println("getDateOfBirth");
        Students instance = new Students();
        Date expResult = new Date(1994,8,13);
        instance.setDateOfBirth(new Date(1994,8,13));
        Date result = instance.getDateOfBirth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDateOfBirth method, of class Students.
     */
//    @Test
//    public void testSetDateOfBirth() {
//        System.out.println("setDateOfBirth");
//        Date dateOfBirth = null;
//        Students instance = new Students();
//        instance.setDateOfBirth(dateOfBirth);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of getAddressLine1 method, of class Students.
     */
    @Test
    public void testGetAddressLine1() {
        System.out.println("getAddressLine1");
        Students instance = new Students();
        String expResult = "29 Lavender Road";
        instance.setAddressLine1("29 Lavender Road");
        String result = instance.getAddressLine1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setAddressLine1 method, of class Students.
     */
//    @Test
//    public void testSetAddressLine1() {
//        System.out.println("setAddressLine1");
//        String addressLine1 = "";
//        Students instance = new Students();
//        instance.setAddressLine1(addressLine1);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of getPostCode method, of class Students.
     */
    @Test
    public void testGetPostCode() {
        System.out.println("getPostCode");
        Students instance = new Students();
        String expResult = "CR0 3BH";
        instance.setPostCode("CR0 3BH");
        String result = instance.getPostCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of getPostCode method, of class Students.
     */
    @Test
    public void testGetPostCode1() {
        System.out.println("getPostCode");
        Students instance = new Students();
        String expResult = "AL10 9GL";
        instance.setPostCode("AL10 9GL");
        String result = instance.getPostCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

//    /**
//     * Test of setPostCode method, of class Students.
//     */
//    @Test
//    public void testSetPostCode() {
//        System.out.println("setPostCode");
//        String postCode = "";
//        Students instance = new Students();
//        instance.setPostCode(postCode);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of checkPostcode method, of class Students.
     */
    @Test
    public void testCheckPostcode() {
        System.out.println("checkPostcode");
        String postCode = "AL10 9GL";
        Students instance = new Students();
        boolean expResult = true;
        boolean result = instance.checkPostcode(postCode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTargetGrade method, of class Students.
     */
    @Test
    public void testGetTargetGrade() {
        System.out.println("getTargetGrade");
        Students instance = new Students();
        String expResult = "5a";
        instance.setTargetGrade("5a");
        String result = instance.getTargetGrade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

//    /**
//     * Test of setTargetGrade method, of class Students.
//     */
//    @Test
//    public void testSetTargetGrade() {
//        System.out.println("setTargetGrade");
//        String targetGrade = "";
//        Students instance = new Students();
//        instance.setTargetGrade(targetGrade);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of getMarkedWorkId method, of class Students.
     */
    @Test
    public void testGetMarkedWorkId() {
        System.out.println("getMarkedWorkId");
        Students instance = new Students();
        Markedworks expResult = null;
        Markedworks result = instance.getMarkedWorkId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setMarkedWorkId method, of class Students.
     */
//    @Test
//    public void testSetMarkedWorkId() {
//        System.out.println("setMarkedWorkId");
//        Markedworks markedWorkId = null;
//        Students instance = new Students();
//        instance.setMarkedWorkId(markedWorkId);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of getClassId method, of class Students.
     */
    @Test
    public void testGetClassId() {
        System.out.println("getClassId");
        Students instance = new Students();
        Classes expResult = null;
        Classes result = instance.getClassId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setClassId method, of class Students.
     */
//    @Test
//    public void testSetClassId() {
//        System.out.println("setClassId");
//        Classes classId = null;
//        Students instance = new Students();
//        instance.setClassId(classId);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of getMarkedworksList method, of class Students.
     */
    @Test
    public void testGetMarkedworksList() {
        System.out.println("getMarkedworksList");
        Students instance = new Students();
        List<Markedworks> expResult = null;
        List<Markedworks> result = instance.getMarkedworksList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setMarkedworksList method, of class Students.
     */
//    @Test
//    public void testSetMarkedworksList() {
//        System.out.println("setMarkedworksList");
//        List<Markedworks> markedworksList = null;
//        Students instance = new Students();
//        instance.setMarkedworksList(markedworksList);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of getClassesList method, of class Students.
     */
//    @Test
//    public void testGetClassesList() {
//        System.out.println("getClassesList");
//        Students instance = new Students();
//        List<Classes> expResult = null;
//        List<Classes> result = instance.getClassesList();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setClassesList method, of class Students.
//     */
//    @Test
//    public void testSetClassesList() {
//        System.out.println("setClassesList");
//        List<Classes> classesList = null;
//        Students instance = new Students();
//        instance.setClassesList(classesList);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of hashCode method, of class Students.
     */
//    @Test
//    public void testHashCode() {
//        System.out.println("hashCode");
//        Students instance = new Students();
//        int expResult = 0;
//        int result = instance.hashCode();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of equals method, of class Students.
//     */
//    @Test
//    public void testEquals() {
//        System.out.println("equals");
//        Object object = null;
//        Students instance = new Students();
//        boolean expResult = false;
//        boolean result = instance.equals(object);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of toString method, of class Students.
//     */
//    @Test
//    public void testToString() {
//        System.out.println("toString");
//        Students instance = new Students();
//        String expResult = "";
//        String result = instance.toString();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    //}
    
}
