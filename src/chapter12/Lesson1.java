package chapter12;

import java.util.ArrayList;
import java.util.List;

public class Lesson1 {
    public static void main(String[] args) {

//        String[] greetings = new String[3];
//        greetings[0] = "おはよう";
//        greetings[1] = "こんにちは";
//        greetings[2] = "こんばんは";
//
//        for (int i=0; i<greetings.length; i++){
//            System.out.println(greetings[i]);
//        }


        //forEachメソッドを使い、全要素を表示する

        List<String> greetings = new ArrayList<>();
        greetings.add("おはよう");
        greetings.add("こんにちは");
        greetings.add("こんばんは");

        greetings.forEach(System.out::println);





//        for(String s:greetings){
//            System.out.println(s);
//        }

//        //greetingsリストの０番目の要素を取得して表示する
//        String s = greetings.get(0);
//        System.out.println(s);
//
//        //その値が「おはよう」なら　「yes」と表示する
//        if(s.equals("おはよう")){
//            System.out.println("yes");
//
//            //greetingsリストが「good morning」という要素を含んているか
//            System.out.println(greetings.contains("good morning"));
//
//            //greetingsリストがから出なかったら、
//            if (greetings.isEmpty()){
//                System.out.println(greetings.size());
//            }
//
//            greetings.remove(2);
//        }
//    }
    }
}