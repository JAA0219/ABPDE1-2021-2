/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package APP1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Familia
 */
public class CONSULTORIOTest {
    
    public CONSULTORIOTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getMenu method, of class CONSULTORIO.
     */
    @Test
    public void testGetMenu() {
        System.out.println("getMenu");
        CONSULTORIO instance = new CONSULTORIO();
        Menu expResult = null;
        Menu result = instance.getMenu();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMenu method, of class CONSULTORIO.
     */
    @Test
    public void testSetMenu() {
        System.out.println("setMenu");
        Menu menu = null;
        CONSULTORIO instance = new CONSULTORIO();
        instance.setMenu(menu);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOpcion method, of class CONSULTORIO.
     */
    @Test
    public void testGetOpcion() {
        System.out.println("getOpcion");
        CONSULTORIO instance = new CONSULTORIO();
        instance.getOpcion();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOpcion method, of class CONSULTORIO.
     */
    @Test
    public void testSetOpcion() {
        System.out.println("setOpcion");
        Opcion opcion = null;
        CONSULTORIO instance = new CONSULTORIO();
       
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class CONSULTORIO.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        CONSULTORIO.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
