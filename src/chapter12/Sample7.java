package chapter12;

import java.util.ArrayList;
import java.util.HashMap;

public class Sample7 {
    public static void main(String[] args) {
        //文字列型のArrayListを作る
        var list = new ArrayList<String>();
        //このリストに Java, Kotlin, Python を追加する
        list.add("Java");
        list.add("Kotlin");
        list.add("Python");
        //このリストの要素をすべて表示する
        list.forEach(System.out::println);

        //文字列型のHashMapを作る
        //上のリストの値を取り出し、このマップに入れる
        //0 Java , 1 Kotlin, 2 Python
        //キー　値
        var map = new HashMap<Integer,String>();
        for(int i=0; i < list.size(); i++){
            map.put(i, list.get(i));
        }
        //このマップの要素をすべて表示する
        map.forEach((k, v) -> System.out.println(k + " " + v));
    }
}
