package P16;

import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;

public class LoopCollection {
    public static void main(String[] args) {
        System.out.println();

        Stack<String> fruits = new Stack<>();

        fruits.push("Banana");
        fruits.add("Orange");
        fruits.add("Watermelon");
        fruits.add("Leci");
        fruits.add("Salak");

        fruits.set(fruits.size() - 1, "Strawberry");

        fruits.add("Mango");
        fruits.add("Guava");
        fruits.add("Avocado");

        Collections.sort(fruits);

        System.out.println("=================================");
        System.out.printf("Stack Awal : %s\n", fruits);

        for (String fruit : fruits) {
            System.out.printf("%s ", fruit);
        }

        System.out.println();

        System.out.println("=================================");
        System.out.println("Menggunakan Iterator");

        Iterator<String> it = fruits.iterator();

        while (it.hasNext()) {
            System.out.printf("%s ", it.next());
        }

        System.out.println();

        System.out.println("=================================");
        System.out.println("Menggunakan forEach()");

        fruits.forEach(fruit -> {
            System.out.printf("%s ", fruit);
        });

        System.out.println();

        System.out.println("=================================");
        System.out.println("Menggunakan for");

        for (int i = 0; i < fruits.size(); i++) {
            System.out.printf("%s ", fruits.get(i));
        }

        System.out.println();
        System.out.println();
    }
}