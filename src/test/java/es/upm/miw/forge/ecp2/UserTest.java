package es.upm.miw.forge.ecp2;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class UserTest {
	
    private User user;

    @Before
    public void before() {
       user =  new User(1,"Borja","Guzmán");
    }

    @Test
    public void testGetters() {
        assertEquals(1, user.getNumber());
        assertEquals("Borja", user.getName());
        assertEquals("Guzmán", user.getFamilyName());
    }

    @Test
    public void testFullName() {
        assertEquals("Borja Guzmán", user.fullName());
    }
    
    @Test
    public void testInitials() {
        assertEquals("B.", user.initials());
    }
    
    @Test
    public void testgetUpperCaseName() {
        assertEquals("BORJA", user.getUpperCaseName());
    }

}
