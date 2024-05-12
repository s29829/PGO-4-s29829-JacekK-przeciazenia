package Tests;

import Pgo4exec.Multiplier;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;

// przyjmującą jako parametry dwie zmienne typu int
//b) przyjmującą jako parametry 4 zmienne typu int (ta metoda powinna w swoim ciele wywoływać powyższą metodę przyjmującą dwa parametry typu int)
//c) przyjmującą jako parametry 2 zmienne typu double
//d) przyjmującą jako parametry dwa obiekty typu BigDecimal
//e) przyjmującą jako parametr listę obiektów klasy Integer

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
