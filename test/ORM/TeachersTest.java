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
public class TeachersTest {
    
    public TeachersTest() {
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
     * Test of getTeacherId method, of class Teachers.
     */
    @Test
    public void testGetTeacherId() {
        System.out.println("getTeacherId");
        Teachers instance = new Teachers();
        String expResult = "";
        String result = instance.getTeacherId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTeacherId method, of class Teachers.
     */
    @Test
    public void testSetTeacherId() {
        System.out.println("setTeacherId");
        String teacherId = "";
        Teachers instance = new Teachers();
        instance.setTeacherId(teacherId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirstName method, of class Teachers.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        Teachers instance = new Teachers();
        String expResult = "";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFirstName method, of class Teachers.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String firstName = "";
        Teachers instance = new Teachers();
        instance.setFirstName(firstName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastName method, of class Teachers.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        Teachers instance = new Teachers();
        String expResult = "";
        String result = instance.getLastName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLastName method, of class Teachers.
     */
    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String lastName = "";
        Teachers instance = new Teachers();
        instance.setLastName(lastName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmailAddress method, of class Teachers.
     */
    @Test
    public void testGetEmailAddress() {
        System.out.println("getEmailAddress");
        Teachers instance = new Teachers();
        String expResult = "";
        String result = instance.getEmailAddress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmailAddress method, of class Teachers.
     */
    @Test
    public void testSetEmailAddress() {
        System.out.println("setEmailAddress");
        String emailAddress = "";
        Teachers instance = new Teachers();
        instance.setEmailAddress(emailAddress);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMarkedworksList method, of class Teachers.
     */
    @Test
    public void testGetMarkedworksList() {
        System.out.println("getMarkedworksList");
        Teachers instance = new Teachers();
        List<Markedworks> expResult = null;
        List<Markedworks> result = instance.getMarkedworksList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMarkedworksList method, of class Teachers.
     */
    @Test
    public void testSetMarkedworksList() {
        System.out.println("setMarkedworksList");
        List<Markedworks> markedworksList = null;
        Teachers instance = new Teachers();
        instance.setMarkedworksList(markedworksList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsers method, of class Teachers.
     */
    @Test
    public void testGetUsers() {
        System.out.println("getUsers");
        Teachers instance = new Teachers();
        Users expResult = null;
        Users result = instance.getUsers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsers method, of class Teachers.
     */
    @Test
    public void testSetUsers() {
        System.out.println("setUsers");
        Users users = null;
        Teachers instance = new Teachers();
        instance.setUsers(users);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMarkedWorkId method, of class Teachers.
     */
    @Test
    public void testGetMarkedWorkId() {
        System.out.println("getMarkedWorkId");
        Teachers instance = new Teachers();
        Markedworks expResult = null;
        Markedworks result = instance.getMarkedWorkId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMarkedWorkId method, of class Teachers.
     */
    @Test
    public void testSetMarkedWorkId() {
        System.out.println("setMarkedWorkId");
        Markedworks markedWorkId = null;
        Teachers instance = new Teachers();
        instance.setMarkedWorkId(markedWorkId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getClassId method, of class Teachers.
     */
    @Test
    public void testGetClassId() {
        System.out.println("getClassId");
        Teachers instance = new Teachers();
        Classes expResult = null;
        Classes result = instance.getClassId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setClassId method, of class Teachers.
     */
    @Test
    public void testSetClassId() {
        System.out.println("setClassId");
        Classes classId = null;
        Teachers instance = new Teachers();
        instance.setClassId(classId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getClassesList method, of class Teachers.
     */
    @Test
    public void testGetClassesList() {
        System.out.println("getClassesList");
        Teachers instance = new Teachers();
        List<Classes> expResult = null;
        List<Classes> result = instance.getClassesList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setClassesList method, of class Teachers.
     */
    @Test
    public void testSetClassesList() {
        System.out.println("setClassesList");
        List<Classes> classesList = null;
        Teachers instance = new Teachers();
        instance.setClassesList(classesList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Teachers.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Teachers instance = new Teachers();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Teachers.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Teachers instance = new Teachers();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Teachers.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Teachers instance = new Teachers();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
