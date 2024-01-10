package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        //標準入力で数値を受け取る
        //一番目には入力値の合計数
        //二番目以降から整数が入力される
        //その整数の中から一番大きい数を見せつけて出力
        Scanner sc =new Scanner(System.in);
        int b = sc.nextInt();
        int list[] = new int[b];
        int max = list[0];
        for (int i = 0; i < b; i++){
            list[i] = sc.nextInt();
            if (max < list[i]){
                max  = list[i];
            }
        }

        System.out.println(Arrays.toString(list));
        System.out.println(max);
        //入力された整数をいったん、配列に入れる
        //その配列の中から一番大きい数を見つける


        //3
        //1
        //10
        //5

        //一番大きい数は10なので、10を出力

//        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        //size文の要素が入る配列を作る
        int[] array = new int[size];

        //size回ループさせ、入力された値を配列に格納する
        for(int i=0; i<size; i++){
            array[i] = sc.nextInt();
        }

        //配列の中から一つずつ要素を参照し、一番大きい数を見つける
        int maximum = array[0];
        for(int i = 1; i<array.length; i++){
            if(array[i] > maximum){
                maximum = array[i];
            }
        }
        //見つけた一番大きい数を表示する
        System.out.println(maximum);
    }
}
