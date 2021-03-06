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
        Fraction fractionB = new Fraction(2,3);
        Fraction fractionResult = new Fraction(0,0);
        fractionResult = fraction.multiply(fractionB);
        assertEquals(2, fractionResult.getNumerator());
        assertEquals(6, fractionResult.getDenominator());
    }
    
    @Test
    public void testSumFraction() {
    		Fraction b = new Fraction(1,3);
    		Fraction result = fraction.sum(b);
    		assertEquals(5, result.getNumerator());
        assertEquals(6, result.getDenominator());
    }

}
