package chapter12;

import java.util.HashSet;

public class Sample6 {
    public static void main(String[] args) {
        //文字列のHashSetを作る
        var set  = new HashSet<String>();
        //山田、田中、池田を追加する
        set.add("山田");
        set.add("田中");
        set.add("池田");
        //p.292参考
        //何件の要素があるかを表示する
        System.out.println(set.size());

        //セットの中身が空かどうか表示する(true or false)
        System.out.println(set.isEmpty());

        //池田を削除する
        set.remove("池田");

        //セットの中身をすべて表示する
        set.forEach(System.out::println);
    }
}
