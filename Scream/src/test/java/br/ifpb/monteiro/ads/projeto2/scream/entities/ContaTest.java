/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ifpb.monteiro.ads.projeto2.scream.entities;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Hugo
 */
public class ContaTest {
    
    public ContaTest() {
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
     * Test of getId method, of class Conta.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Conta instance = new Conta();
        instance.setId(12345678910L);   // ####################
        Long expResult = 12345678910L;
        Long result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Conta.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Long id = 12345678910L;
        Conta instance = new Conta();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getListUsuarioProjeto method, of class Conta.
     */
//    @Test
//    public void testGetListUsuarioProjeto() {
//        System.out.println("getListUsuarioProjeto");
//        Conta instance = new Conta();
//        List<UsuarioProjeto> expResult = null;
//        List<UsuarioProjeto> result = instance.getListUsuarioProjeto();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setListUsuarioProjeto method, of class Conta.
//     */
//    @Test
//    public void testSetListUsuarioProjeto() {
//        System.out.println("setListUsuarioProjeto");
//        List<UsuarioProjeto> listUsuarioProjeto = null;
//        Conta instance = new Conta();
//        instance.setListUsuarioProjeto(listUsuarioProjeto);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of getNome method, of class Conta.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Conta instance = new Conta();
        instance.setNome("Z");
        String expResult = "X";
        String result = instance.getNome();
        Assert.assertEquals(false, expResult == result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Conta.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "X";
        Conta instance = new Conta();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSenha method, of class Conta.
     */
    @Test
    public void testGetSenha() {
        System.out.println("getSenha");
        Conta instance = new Conta();
        instance.setSenha("X");
        String expResult = "X";
        String result = instance.getSenha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSenha method, of class Conta.
     */
    @Test
    public void testSetSenha() {
        System.out.println("setSenha");
        String senha = "X";
        Conta instance = new Conta();
        instance.setSenha(senha);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getUsuario method, of class Conta.
     */
    @Test
    public void testGetUsuario() {
        System.out.println("getUsuario");
        Conta instance = new Conta();
        instance.setUsuario("X");
        String expResult = "X";
        String result = instance.getUsuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setUsuario method, of class Conta.
     */
    @Test
    public void testSetUsuario() {
        System.out.println("setUsuario");
        String usuario = "";
        Conta instance = new Conta();
        instance.setUsuario(usuario);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Conta.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Conta instance = new Conta();
        instance.setEmail("X");
        String expResult = "X";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //ail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class Conta.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Conta instance = new Conta();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
