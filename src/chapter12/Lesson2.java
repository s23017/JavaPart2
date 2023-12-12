package chapter12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lesson2 {
    public static void main(String[] args) {
        //映画のタイトルに入れたリストを作る
        //forEachメソッドを使い、是尿素を表示させる
        List<String> movies = new ArrayList<>();
        movies.add("Avater");
        movies.add("Titanic");
        movies.add("Spider-Man");
        movies.add("Frozen");
        movies.add("2012");

        movies.sort(Comparator.naturalOrder());

        movies.forEach(System.out::println);
    }
}
