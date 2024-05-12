package Pgo4exec;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Multiplier {


    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int multiply(int a, int b, int c, int d) {
        return multiply(a, b) * multiply(c, d);
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static BigDecimal multiply(BigDecimal aBig, BigDecimal bBig) {
        if (aBig == null || bBig == null) {
            throw new IllegalArgumentException("Argument cannot be null");
        }
        return aBig.multiply(bBig);
    }

    public static int multiply(ArrayList<Integer> abList) {
        if (abList == null || abList.size() == 0) {
            throw new IllegalArgumentException("Argument cannot be null");
        }
        int outcome = 0;
        if (abList.size() > 0) {
            outcome = abList.get(0);
            if (abList.size() > 1) {
                outcome = abList.get(0) * abList.get(1);
            }
            if (abList.size() > 2) {
                for (int i = 2; i < abList.size(); i++) {
                    outcome = outcome * abList.get(i);
                    if (outcome < 0) {
                        throw new RuntimeException("Out of range");
                    }
                }
            }

        }
        return outcome;
    }


}
