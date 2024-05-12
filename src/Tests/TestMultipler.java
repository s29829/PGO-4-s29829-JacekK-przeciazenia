package Tests;

import Pgo4exec.Multiplier;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;


public class TestMultipler {

    Multiplier multiplier = new Multiplier();

    @Test
    public void testMuliplierTwoInteger() {
        int a = 3, b = 7, c = 21;
        Assertions.assertEquals(multiplier.multiply(a, b), c);
    }

    @Test
    public void testMuliplierFourInteger() {
        int a = 3, b = 7, a1 = 2, b1 = 6, c = 252;
        Assertions.assertEquals(multiplier.multiply(a, b, a1, b1), c);
    }

    @Test
    public void testMuliplierTwoDouble() {
        double a = 3.2, b = 7.6, c = 24.32;
        Assertions.assertEquals(multiplier.multiply(a, b), c);
    }

    @Test
    public void testMuliplierTwoBigDecimal() {
        BigDecimal aBig = new BigDecimal("3889.82");
        BigDecimal bBig = new BigDecimal("7788656.689");
        BigDecimal cBig = new BigDecimal("30296472562.00598");
        Assertions.assertEquals(multiplier.multiply(aBig, bBig), cBig);
    }


    @Test
    public void testMultiplerListOfInteger () {
        ArrayList<Integer> listInt = new ArrayList<>();
        listInt.add(67);
        listInt.add(34);
        listInt.add(287);
        listInt.add(435);
        Assertions.assertEquals(multiplier.multiply(listInt), 284396910);
    }
}
