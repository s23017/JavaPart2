package exercise;

import exercise2.User;

import java.util.HashMap;

public class Exercise1241 {
    public static void main(String[] args) {

        //HashMapを作る キー:String 値 : User
        var map = new HashMap<String, User>();

        //Userのインスタンスを作る 3名分
        User u1 = new User("ab123", "田中宏");
        User u2 = new User("ab224", "佐藤修");
        User u3 = new User("ab331", "木村正一");

        //そのインスタンスをマップに入れる
        //キー　Userのid    値 : Userインスタンス
        map.put("ab123", u1);
        map.put("ab224", u2);
        map.put("ab331", u3);

        //マップからキーがab224の値を表示する
        System.out.println(map.get("ab224"));

    }
}
