/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

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
public class BuscaTest {
    private Busca buscar;
    public static List<Deputado> expResult;
    
    public BuscaTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        buscar = new Busca();
        expResult = buscar.buscarDeputados();
    }
    
    @After
    public void tearDown() {
   // expResult = null;
   // assertNull(expResult);
    }

    /**
     * Test of buscarDeputados method, of class Busca.
     */
    @Test
    public void testBuscarDeputados() {
        System.out.println("buscarDeputados");
        Busca instance = new Busca();
        List<Deputado> result = instance.buscarDeputados();
        Deputado teste = result.get(0);
        Deputado teste2 = expResult.get(0);
        assertEquals(teste.getNome(), teste2.getNome());
        
        
    }
    
}
