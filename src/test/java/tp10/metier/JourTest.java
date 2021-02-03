/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp10.metier;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author leonl
 */
public class JourTest {
    
    public JourTest() {
    }
    public static final int nbJour =2;
    @org.junit.jupiter.api.Test
    public void testConstructorJour() {
        Jour j =new Jour(nbJour);
        assertSame(nbJour,j.getNoJour());
    }
    
    @org.junit.jupiter.api.Test
    public void testToStringJour() {
        Jour j =new Jour(nbJour);
        assertEquals("Jour " +nbJour,j.toString(),"to String doesn't works");
    }
    
    @org.junit.jupiter.api.Test
    public void testHashEqual(){
        Jour j1=new Jour(nbJour);
        Jour j2=new Jour(nbJour);
        Jour j3=new Jour(3);
        assertEquals(j1.hashCode(),j2.hashCode(),"we are the same");
        assertEquals(j1,j2,"we are the same");
        assertNotEquals(j3,j2,"we are not the same");
    }
    
    
}
