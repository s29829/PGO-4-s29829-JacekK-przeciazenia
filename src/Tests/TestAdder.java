package Tests;

import Pgo4exec.Adder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class TestAdder {

    Adder adder = new Adder();

    @Test
    public void testAddTwoInteger() {
        int a = 8, b = 2;
        Assertions.assertEquals(adder.add(a,b),10);
    }

    @Test
    public void testAddTwoBigDecimal() {
        BigDecimal aBig = new BigDecimal("4531.2543");
        BigDecimal bBig = new BigDecimal("15433.2453");
        BigDecimal cBig = new BigDecimal("19964.4996");
        Assertions.assertEquals(adder.add(aBig, bBig), cBig);
    }
}
