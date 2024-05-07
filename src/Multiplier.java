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

    public static BigDecimal multiply(BigDecimal a, BigDecimal b) {
        return a.multiply(b);
    }

    public static Integer multiply(ArrayList<Integer> abList) {
        int outcome = 0;
        System.out.println("Start "+outcome);

        if (abList.size() > 0) {
            outcome = abList.get(0);
            System.out.println("00 "+outcome);


            if (abList.size() > 1) {
                outcome = abList.get(0) * abList.get(1);
                System.out.println("01 "+outcome);

            }
            if (abList.size() > 2) {
                for (int i = 2; i < abList.size(); i++) {
                    outcome = outcome * abList.get(i);
                    System.out.println(outcome);
                }
            }

        }
        return outcome;
    }


//    }

}
