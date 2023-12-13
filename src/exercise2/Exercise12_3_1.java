package exercise2;

import java.util.HashSet;

public class Exercise12_3_1 {
    public static void main(String[] args) {
        var user = new HashSet<User>();
        user.add(new User("ab123", "田中弘"));
        user.add(new User("ab224", "佐藤修"));
        user.add(new User("ab224", "佐藤おさむ"));
        user.add(new User("ac331", "木村正一"));

        user.forEach(System.out::println);
    }
}
