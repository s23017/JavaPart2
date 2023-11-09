package exercise;

import chapter7_2.joining;

public class E721_1 {
    public static void main(String[] args) {
        joining j = new joining("","-");
        j.add("apple");
        j.add("banana");
        j.add("peach");
        System.out.println(j.getCsv());
    }
}
