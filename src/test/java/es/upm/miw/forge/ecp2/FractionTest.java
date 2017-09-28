package es.upm.miw.forge.ecp2;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class FractionTest {
	
	
	private Fraction fraction;


    @Before
    public void before() {
        fraction = new Fraction(1,2);
    }

    @Test
    public void testDefaultConstructor() {
    	fraction = new Fraction();
    	  assertEquals(1, fraction.getNumerator());
          assertEquals(1, fraction.getDenominator());
          assertEquals(1, fraction.decimal(), 1);

    }
    @Test
    public void testDecimal() {
        assertEquals(0.5, fraction.decimal(), 1);
    }
    
    @Test
    public void testGetters() {
        assertEquals(1, fraction.getNumerator());
        assertEquals(2, fraction.getDenominator());

    }
    
    @Test
    public void testIsPropia() {
        assertEquals(true, fraction.isPropia());
    }
    
    @Test
    public void testMultiply() {
        Fraction fractionB = new Fraction(2,6);
        fraction.multiply(fractionB);
        assertEquals(1, fraction.getNumerator());
        assertEquals(2, fraction.getDenominator());
    }

}
