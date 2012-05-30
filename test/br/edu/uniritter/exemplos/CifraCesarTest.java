/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uniritter.exemplos;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Gordo
 */
public class CifraCesarTest {
    
    CifraCesar cifra;
        
    @Before
    public void setUp() {
        cifra = new CifraCesar();
    }
    
    @Test
    public void testeCifraCesar() {
        assertEquals("ymj gttp nx ts ymj yfgqj", cifra.encripta("the book is on the table",5));
    }
    @Test
    public void testeCifraCesar2() {
        assertEquals("fGaeE", cifra.encripta("aBvzZ",5));
    }
    @Test
    public void testeCifraCesar3() {
        assertEquals("BG", cifra.encripta("ZE",2));
    }
    
}
