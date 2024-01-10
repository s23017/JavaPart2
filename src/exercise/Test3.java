package exercise;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int sum = 0;
        boolean isExit = false;

        while(isExit == false){
            if(sc.hasNextInt()){
                //もし、数値が入力されたら、足していく
                int number = sc.nextInt();
                sum = sum + number;


            }else if(sc.hasNextLine()){
                //もし、文字が入力されたら、ENTERという文字かどうか調べる
                //ENTERが入力されたらループを止めたい
                String s = sc.nextLine();
                if(s.equals("ENTER")){
                    isExit = true;
                }
            }
        }

        System.out.println(sum);
    }
}
