import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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

        multiplier.multiply(list);

//        String name="sonoo";
//        String sf1=String.format("name is %s",name);
//        String sf2=String.format("value is %f",32.33434);
//        String sf3=String.format("value is %32.12f",32.33434);//returns 12 char fractional part filling with 0
//
//        System.out.println(sf1);
//        System.out.println(sf2);
//        System.out.println(sf3);


    }
}