package Pgo4exec;

import java.math.BigDecimal;

public class Adder {

    public static int add(int a, int b) {
        return a + b;
    }


    public static BigDecimal add(BigDecimal a, BigDecimal b) {
        return a.add(b);
    }
}
