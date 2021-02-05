/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import dto.EmployeeDTO;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author melo-
 */
public class EmployeeFacadeTest {
    
    public EmployeeFacadeTest() {
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
     * Test of getEmployeeFacade method, of class EmployeeFacade.
     */
    @Test
    public void testGetEmployeeFacade() {
        System.out.println("getEmployeeFacade");
        EntityManagerFactory _emf = null;
        EmployeeFacade expResult = null;
        EmployeeFacade result = EmployeeFacade.getEmployeeFacade(_emf);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createEmployee method, of class EmployeeFacade.
     */
    @Test
    public void testCreateEmployee() {
        System.out.println("createEmployee");
        EmployeeDTO rm = null;
        EmployeeFacade instance = null;
        EmployeeDTO expResult = null;
        EmployeeDTO result = instance.createEmployee(rm);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmployeeByID method, of class EmployeeFacade.
     */
    @Test
    public void testGetEmployeeByID() {
        System.out.println("getEmployeeByID");
        long id = 0L;
        EmployeeFacade instance = null;
        EmployeeDTO expResult = null;
        EmployeeDTO result = instance.getEmployeeByID(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmployeesByName method, of class EmployeeFacade.
     */
    @Test
    public void testGetEmployeesByName() {
        System.out.println("getEmployeesByName");
        String Name = "";
        EmployeeFacade instance = null;
        EmployeeDTO expResult = null;
        EmployeeDTO result = instance.getEmployeesByName(Name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllEmployees method, of class EmployeeFacade.
     */
    @Test
    public void testGetAllEmployees() {
        System.out.println("getAllEmployees");
        String Name = "";
        String address = "";
        int salary = 0;
        EmployeeFacade instance = null;
        List<EmployeeDTO> expResult = null;
        List<EmployeeDTO> result = instance.getAllEmployees(Name, address, salary);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmployeesWithHighestSalary method, of class EmployeeFacade.
     */
    @Test
    public void testGetEmployeesWithHighestSalary() {
        System.out.println("getEmployeesWithHighestSalary");
        String Name = "";
        String address = "";
        int salary = 0;
        EmployeeFacade instance = null;
        List<EmployeeDTO> expResult = null;
        List<EmployeeDTO> result = instance.getEmployeesWithHighestSalary(Name, address, salary);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
