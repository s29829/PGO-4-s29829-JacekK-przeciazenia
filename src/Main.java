import Pgo4exec.Adder;
import Pgo4exec.Address;
import Pgo4exec.Multiplier;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("PGO-4 przeciazenia");

        Multiplier multiplier = new Multiplier();
        Adder adder = new Adder();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(12);
        list.add(8);
        list.add(74);
        list.add(12);

        Address addres = new Address();
        System.out.println(addres.createAddress("Poland"));
        System.out.println(addres.createAddress("Poland", "Warszawa"));
        System.out.println(addres.createAddress("Poland", "Warszawa","02-222"));
        System.out.println(addres.createAddress("Poland", "Warszawa","02-222", "Koszykowa"));
        System.out.println(addres.createAddress("Poland", "Warszawa","02-222", "Koszykowa", "86A"));

        //        multiplier.multiply(list);
//        System.out.println(multiplier.multiply(7,5));
//        System.out.println(multiplier.multiply(7.43,5.54));
//
//        Tests.TestAddress testAddr = new Tests.TestAddress();
//        testAddr.testAddress();


        String name="sonoo";
        String sf1=String.format("name is %s",name);
        String sf2=String.format("value is %f",32.33434);
        String sf3=String.format("value is %32.12f",32.33434);//returns 12 char fractional part filling with 0
//
//        System.out.println(sf1);
//        System.out.println(sf2);
//        System.out.println(sf3);


    }
}