package exercise;

import javax.swing.text.Style;
import java.util.Arrays;

public class Test8 {
    public static void main(String[] args) {
//        String[] words = {"cat", "dog", "apple", "bear", "book"};
//
//        //配列の1番目の値を引き出し表示する cat
//        System.out.println(words[0]);
//        //配列の3番目の値を引き出す表示する apple
//        System.out.println(words[2]);
//        //配列の最後の値ヲ引き出し表示する  book
//        System.out.println(words[words.length-1]);
        int[][] intMatrix = {
                {1, 1, 1, 1, 1},
                {2, 4, 6, 8, 0},
                {9, 8, 7, 6, 5}
        };

        //すべての値を足して合計を表示する
        int sum = 0;
        for (int y=0; y< intMatrix.length; y++){
            for (int x=0; x<intMatrix[y].length; x++){
                sum += intMatrix[y][x];
            }
        }

        System.out.println("合計:" + sum);

        int[] data1 = {1, 2, 3};
        System.out.println(Arrays.deepToString(intMatrix));

        //真ん中の値（６）を抜き出し表示する
        System.out.print(intMatrix[1][2]);

        /*
        3 3 3 3 3
        6 12 21 18 15
        27 24 21 18 15
         */
        for(int y=0; y< intMatrix.length; y++){
            for (int x=0; x<intMatrix[0].length; x++){
                System.out.print(intMatrix[y][x] * 3 + " ");
            }
            System.out.println();
        }
    }
}
