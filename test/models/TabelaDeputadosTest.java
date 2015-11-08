/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import controllers.Busca;
import edu.unb.fga.dadosabertos.Deputado;
import java.util.List;
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
    public static List<Deputado> lista;
    public static TabelaDeputados valorEsperado;
    
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
    Busca teste = new Busca();
    lista = teste.buscarDeputados();
    valorEsperado = new TabelaDeputados(lista);
    
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
        TabelaDeputados instance = new TabelaDeputados(lista);
        int expResult = lista.size();
        int result = instance.getRowCount();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getColumnCount method, of class TabelaDeputados.
     */
    @Test
    public void testGetColumnCount() {
        System.out.println("getColumnCount");
        TabelaDeputados instance = new TabelaDeputados(lista);
        int expResult = 6;
        int result = instance.getColumnCount();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of getValueAt method, of class TabelaDeputados.
     */
    @Test
    public void testGetValueAt() {
        System.out.println("getValueAt");
        int rowIndex = 0;
        int columnIndex = 0;
        TabelaDeputados instance = new TabelaDeputados(lista);
        Object expResult = valorEsperado.getValueAt(rowIndex, columnIndex);
        Object result = instance.getValueAt(rowIndex, columnIndex);
        assertEquals(expResult, result);
    }

    /**
     * Test of getColumnName method, of class TabelaDeputados.
     */
    @Test
    public void testGetColumnName() {
        System.out.println("getColumnName");
        int x = 0;
        TabelaDeputados instance = new TabelaDeputados(lista);
        String expResult = "Nome completo";
        String result = instance.getColumnName(x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
