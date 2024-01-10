package exercise;

public class Test4 {
    public static void main(String[] args) {
//1から100までの数を順に見ていく
//その数が3の倍数以外だったとき、カウントをアップする
//そのカウントを最後表示する
//答えは67
//        int sum = 0;
//        for (int i = 1; i < 101; i++){
//            if(i % 3 !=0){
//                sum += 1;
//            }
//        }
//        System.out.println(sum);

        int[] array = new int[3];
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;

        int[] array2 = {10, 20, 30};
        //--------------------------------
        int[] first = {0, 1, 2};
        int[] second = {10, 11, 12};
        int[] result;

        //resultの中身{0,1,2,10,11,12}
        result = new int[first.length + second.length];

        //first配列の値を一つずつ、result配列に代入する
        for(int i=0; i<first.length; i++){
            result[i] = first[i];
        }

        //second配列の値を一つずつ、result配列に代入する
        for(int i=0; i< second.length; i++){
            result[i + first.length] = second[i];
        }

        //result配列の中身表示する
        System.out.println(result);
    }
}

