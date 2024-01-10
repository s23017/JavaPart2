package exercise;

import java.util.Arrays;

public class Test9 {
    public static void main(String[] args) {
        //配列の値は学籍番号を表している
        //両日とも参加した人数を求めてください
//        int[] day1 = {3, 10, 4, 7, 8};
//        int[] day2 = {9, 8, 6, 10, 1};
//
//        int count = 0;
//        for (int i=0; i<day1.length; i++){
//            for (int k=0; k<day2.length; k++){
//                if ((day1[i] == day2[k])) {
//                    count++;
//                }
//            }
//        }
//        System.out.println(count);

        //char[] data = {'a', 'b', 'c'};
        char c = 0x0061;
        //System.out.println(c);

        char[] array = new char[3];
        array[0] = 0x0061;
        array[1] = 0x0062;
        array[2] = 0x0063;
        System.out.println(Arrays.toString(array));


        /*
        Web Web 休憩 Linux
        Java 休憩 Python 休憩
        休憩 休憩 Web Java
         */
        String[][] calendar = {
                {"Web", "Web", null, "Linux"},
                {"Java", "", "Python", null},
                {null, null, "Web", "Java"}
        };

        for (int y = 0; y < calendar.length; y++) {
            for (int x = 0; x < calendar[y].length; x++) {
                //nullまたは空文字の時休暇と表示する
                if (calendar[y][x] == null || calendar[y][x].equals("")) {
                    System.out.print("休憩");
                } else {
                    System.out.print(calendar[y][x] + " ");
                }
                System.out.println();
            }


        }
    }
}
