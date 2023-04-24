package collections;

import java.util.*;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList al1 = new ArrayList();
        al1.add(100);
        al1.add(231);
        al1.add(434);
        al1.add(442);
        al1.add("Mayank");
        al1.add("Mahajan");
        System.out.println(al1);
        System.out.println("***********************************");

        ArrayList al2 = new ArrayList();
        al2.add(332);
        al2.add("PW");
        al2.add(802);
        al2.add("Body");

        System.out.println(al2);
        al2.addAll(al1);
        System.out.println(al2);


    }
}
