import Pgo4exec.Adder;
import Pgo4exec.Address;
import Pgo4exec.Multiplier;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("PGO-4 przeciazenia");
        System.out.println("___________________________________");


        Address addres = new Address();
        addresShowExamples(addres);


        Adder adder = new Adder();
        adderShowExamples(adder);


        Multiplier multiplier = new Multiplier();
        multiplerShowExamples(multiplier);


    }

    private static void multiplerShowExamples(Multiplier multiplier) {

        int a = 8, b = 2, c = 7, d = 12;
        double e = 12.4234, f = 3242.234;

        BigDecimal aBig = new BigDecimal("4531.2543");
        BigDecimal bBig = new BigDecimal("15433.2453");

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(67);
        intList.add(34);
        intList.add(287);
        intList.add(435);

        System.out.println("a) Multiply of two integer: a=" + a + " * b=" + b + " is: " + multiplier.multiply(a, b));
        System.out.println("b) Multiply of four integer: a=" + a + " * b=" + b + " * c=" + a + " * d=" + b + " is: " + multiplier.multiply(a, b, c, d));
        System.out.println("c) Multiply of two double: e=" + a + " * f=" + b + " is: " + multiplier.multiply(e, f));
        System.out.println("d) Multiply of two BigDecimal: aBig=" + a + " * bBig=" + b + " is: " + multiplier.multiply(aBig, bBig));
        System.out.println("e) Multiply of integer's list = {67, 34, 287, 436}" + multiplier.multiply(intList));
        System.out.println(" ");
    }

    private static void adderShowExamples(Adder adder) {
        int a = 8, b = 2;
        System.out.println("Sum of two integer: a=" + a + " + b=" + b + " is: " + adder.add(a, b));

        BigDecimal aBig = new BigDecimal("4531.2543");
        BigDecimal bBig = new BigDecimal("15433.2453");
        System.out.println("Sum of two BigDecimal a=" + aBig + " + b=" + bBig + " is: " + adder.add(aBig, bBig));
        System.out.println(" ");
    }

    private static void addresShowExamples(Address addres) {
        System.out.println(addres.createAddress("Poland"));
        System.out.println(addres.createAddress("Poland", "Warszawa"));
        System.out.println(addres.createAddress("Poland", "Warszawa", "02-222"));
        System.out.println(addres.createAddress("Poland", "Warszawa", "02-222", "Koszykowa"));
        System.out.println(addres.createAddress("Poland", "Warszawa", "02-222", "Koszykowa", "86A"));
        System.out.println("");
    }
}