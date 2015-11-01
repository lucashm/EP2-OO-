/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lucas
 */
public class TabelaDeputadosTest {
    
    public TabelaDeputadosTest() {
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
     * Test of getRowCount method, of class TabelaDeputados.
     */
    @Test
    public void testGetRowCount() {
        System.out.println("getRowCount");
        TabelaDeputados instance = new TabelaDeputados();
        int expResult = 0;
        int result = instance.getRowCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColumnCount method, of class TabelaDeputados.
     */
    @Test
    public void testGetColumnCount() {
        System.out.println("getColumnCount");
        TabelaDeputados instance = new TabelaDeputados();
        int expResult = 0;
        int result = instance.getColumnCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColumnClass method, of class TabelaDeputados.
     */
    @Test
    public void testGetColumnClass() {
        System.out.println("getColumnClass");
        int columnIndex = 0;
        TabelaDeputados instance = new TabelaDeputados();
        Class expResult = null;
        Class result = instance.getColumnClass(columnIndex);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValueAt method, of class TabelaDeputados.
     */
    @Test
    public void testGetValueAt() {
        System.out.println("getValueAt");
        int rowIndex = 0;
        int columnIndex = 0;
        TabelaDeputados instance = new TabelaDeputados();
        Object expResult = null;
        Object result = instance.getValueAt(rowIndex, columnIndex);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isCellEditable method, of class TabelaDeputados.
     */
    @Test
    public void testIsCellEditable() {
        System.out.println("isCellEditable");
        int rowIndex = 0;
        int columnIndex = 0;
        TabelaDeputados instance = new TabelaDeputados();
        boolean expResult = false;
        boolean result = instance.isCellEditable(rowIndex, columnIndex);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValueAt method, of class TabelaDeputados.
     */
    @Test
    public void testSetValueAt() {
        System.out.println("setValueAt");
        Object aValue = null;
        int rowIndex = 0;
        int columnIndex = 0;
        TabelaDeputados instance = new TabelaDeputados();
        instance.setValueAt(aValue, rowIndex, columnIndex);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColumnName method, of class TabelaDeputados.
     */
    @Test
    public void testGetColumnName() {
        System.out.println("getColumnName");
        int x = 0;
        TabelaDeputados instance = new TabelaDeputados();
        String expResult = "";
        String result = instance.getColumnName(x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
