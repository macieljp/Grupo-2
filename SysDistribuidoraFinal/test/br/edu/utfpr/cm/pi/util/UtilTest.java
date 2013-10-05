/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.pi.util;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tayly
 */
public class UtilTest {
    
    public UtilTest() {
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
     * Test of abrirJFrameCentralizado method, of class Util.
     */
   

    
    /**
     * Test of validarID method, of class Util.
     */
    @Test
    public void testValidarID() {
        System.out.println("validarID");
        String id = "1";
        Util instance = new Util();
        boolean expResult = true;
        boolean result = instance.validarID(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of validarValorDouble method, of class Util.
     */
    @Test
    public void testValidarValorDouble() {
        System.out.println("validarValorDouble");
        String valor = "0.5";
        Util instance = new Util();
        boolean expResult = true;
        boolean result = instance.validarValorDouble(valor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    
    /**
     * Test of validaCPF method, of class Util.
     */
    @Test
    public void testValidaCPF() {
        System.out.println("validaCPF");
        String cpf = "746.251.064-27";
        cpf = cpf.replace(".", "");//retirando os pontos
        cpf = cpf.replace("-", "");//retirando o traço
        boolean expResult = true;
        boolean result = Util.validaCPF(cpf);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of validarCNPJ method, of class Util.
     */
    @Test
    public void testValidarCNPJ() {
        System.out.println("validarCNPJ");
        String str_cnpj = "73.279.044/0001-76";
        str_cnpj = str_cnpj.replace(".", "");//retirando os pontos
        str_cnpj = str_cnpj.replace("-", "");//retirando o traço
        str_cnpj = str_cnpj.replace("/", "");//retirando a barra
        boolean expResult = true;
        boolean result = Util.validarCNPJ(str_cnpj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
}
