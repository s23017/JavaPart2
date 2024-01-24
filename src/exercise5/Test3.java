package exercise5;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        //標準入力で取得した数値が
        //10より大きいとき-1
        //10より小さい時1
        //10と等しいとき0
        //を戻り値で返すメソッドを作る
        Scanner sc = new Scanner(System.in);

        System.out.println("数値を入力してください:");
        int num = sc.nextInt();

        int result = answer(num);

        System.out.println(result);

        Integer i1 = Integer.valueOf(10);
        System.out.println(i1.compareTo(num));

        //int型からString型へ変更
        int a = 10;
        String s = String.valueOf(a);

        //Stirngからint
        int s2 = Integer.valueOf(s);

    }

    //メソッド
    public static int answer(int value) {
        if (value > 10) {
            return -1;
        } else if (value < 10) {
            return 1;
        } else {
            return 0;
        }
    }
}

