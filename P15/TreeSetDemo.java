package P15;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        System.out.println();

        TreeSet<String> fruits = new TreeSet<>();
        fruits.add("Mangga");
        fruits.add("Apel");
        fruits.add("Jeruk");
        fruits.add("Jambu");

        for (String temp : fruits) {
            System.out.println(temp);
        }
        System.out.println();

        System.out.println("First: " + fruits.first());
        System.out.println("Last: " + fruits.last());
        System.out.println();

        fruits.remove("Jeruk");
        System.out.println("Setelah remove: " + fruits);
        fruits.pollFirst();
        System.out.println("Setelah poll first: " + fruits);
        fruits.pollLast();
        System.out.println("Setelah poll last: " + fruits);
        System.out.println();
    }
}