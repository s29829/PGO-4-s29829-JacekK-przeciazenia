package Tests;

import Pgo4exec.Adder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class TestAdder {

    Adder adder = new Adder();

    @Test
    public void testAddTwoInteger() {
        int a = 8, b = 2, c=10;
        Assertions.assertEquals(adder.add(a,b),10);
    }

    @Test
    public void testAddTwoBigDecimal() {
//        BigDecimal a = new BigDecimal("1.23");
        int a = 8, b = 2, c = 10;
        Assertions.assertEquals(adder.add(a, b), 10);
    }
}
