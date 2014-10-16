/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fhws.fsfba;

import edu.fhws.fsfba.MyServlet;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Matthias Reining
 */
public class MyServletTest {
    
    MyServlet myServlet;
    
    @Before
    public void init() {        
        myServlet = new MyServlet();        
    }

    @Test
    public void shouldReturnZero() {        
        assertEquals(0, myServlet.calculateLength(null));
    }
    
    @Test
    public void shouldReturnCorrectLength() {        
        assertEquals(6, myServlet.calculateLength("123456"));
    }
}
