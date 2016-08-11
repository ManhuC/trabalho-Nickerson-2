/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 20131064010126
 */
public class CozinharTest {
    
    public CozinharTest() {
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
     * Test of getCozinheiro method, of class Cozinhar.
     */
    @Test
    public void testGetCozinheiro() {
        System.out.println("getCozinheiro");
        Cozinhar instance = new Cozinhar();
        String expResult = null;
        String result = instance.getCozinheiro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCozinheiro method, of class Cozinhar.
     */
    @Test
    public void testSetCozinheiro() {
        System.out.println("setCozinheiro");
        String cozinheiro = "";
        Cozinhar instance = new Cozinhar();
        instance.setCozinheiro(cozinheiro);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getIngredientes method, of class Cozinhar.
     */
    @Test
    public void testGetIngredientes() {
        System.out.println("getIngredientes");
        Cozinhar instance = new Cozinhar();
        String expResult = null;
        String result = instance.getIngredientes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setIngredientes method, of class Cozinhar.
     */
    @Test
    public void testSetIngredientes() {
        System.out.println("setIngredientes");
        String ingredientes = "";
        Cozinhar instance = new Cozinhar();
        instance.setIngredientes(ingredientes);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of cozinhar method, of class Cozinhar.
     */
    //@Test
    public void testCozinhar() {
        System.out.println("cozinhar");
        String[] ingrediente = null;
        Cozinhar instance = new Cozinhar();
        int expResult = 1;
        int result = instance.cozinhar(ingrediente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        //Como precisa de uma entrada relativamente complexa, não serve para testar por aqui, graças
        //ao Split e o número obtido por ele.
    }
    
}
