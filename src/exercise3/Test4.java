package exercise3;

public class Test4 {
    public static void main(String[] args) {
        String password = "ab55dd";
        if (password_check(password)) {
            System.out.println("正しい");
        } else {
            System.out.println("誤りあります");
        }

    }


    //変数passwordが5文字以上かどうかチェックするメソッドを作る
    //引数:password
    //戻り値:boolean(正しいときtrue)
    public static boolean password_check(String password) {
        if (password.length() < 5) {
            return false;
        }

        return true;
    }

    //英字が２文字以上入ってるか？入っていたらtrueで変えす
    //isLetterメソッドを使う

    //数字が２つ以上入っているか？入っていいたらtrueで返す
    /*
    int letteercnt = 0;
    int numericcnt = 0;
   for(
    int i = 0; i<password.length();i++){
        char c = password.charAt(i);
        if (isLetter(c)) {
            lettercnt++;
        }
        if (isNumeric(c)){
        numericcnt++;
    }
}
   if(lettercnt >=2){
        return true;
    }else{
        return false;
    }


     */



   public static boolean isLetter(char ch){
        ch = Character.toUpperCase(ch);
        if(ch >= 'A' && ch <= 'Z') {
            return true;
        }else{
            return false;
        }
   }
}
