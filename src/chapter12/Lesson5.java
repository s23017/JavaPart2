package chapter12;

import java.util.TreeSet;

public class Lesson5 {
    public static void main(String[] args) {
    var tree = new TreeSet<Book>();
    tree.add(new Book("Harry Potter"));
    tree.add(new Book("Remix your Body"));
    tree.add(new Book("How Cats work"));

    tree.forEach(System.out::println);

    }
}
