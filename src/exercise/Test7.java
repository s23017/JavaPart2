package exercise;

public class Test7 {
    public static void main(String[] args) {
//        int[][] table = new int[10][10];
//
//        for (int y = 0; y < table.length; y++) {
//            for (int x = 0; x < table[0].length; x++) {
//                table[y][x] = (y+1) * (x+1);
//                System.out.print(table[y][x] + " ");
//            }
//            System.out.println();
//        }
//    }
//}
/*
1 2 3 4 5 6 7 8 9 10
2 4 6 8 10 12 14 16 18 20
.....
....
10 20 30 40 50 60 70 80 90 100
 */
//二次元配列に入れて、表示する
//足し算はせずに、行と列の掛け算で表示す

        int[][] data = {{10, 20, 30}, {40, 50, 60}};
        for (int i = 0; i < data.length; i++) {
            for (int k = 0; k < data[0].length; k++) {
                System.out.print(data[i][k] + " ");
            }
            System.out.println();
        }
        /*
        10 20 30
        40 50 60
        */
    }
}
