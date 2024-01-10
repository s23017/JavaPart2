package exercise;

public class Test1 {
    public static void main(String[] args) {
//
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 10; j++) {
//                System.out.print("q");
//                if (j == 9) {
//                    System.out.println();
//                }
//
//            }
//        }
//    }
//    public static void main(String[] args) {
//        for (int h = 0; h < 10; h++) {
//            for (int w = 0; w < 20; w++) {
//                if (h == 0 || h == 10 - 1 || w == 0 || w == 20 - 1) {
//                    System.out.print("B");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

        for (int y = 1; y <= 5; y++) {
            for (int x = 1; x <= y; x++) {
                System.out.print("+");
            }
            for (int x = 1; x <= 5 - y; x++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
