package exercise4;

public class Dog {
    int size;
    String name;

    //吠えるメソッドを作る
    //サイズによって吠え方を変える　３パターンで
    //「〇〇は〜と吠えた」と表示する
    public void bark(){
        if (size < 10) {
            System.out.println(name + "は、ワンと吠えた");
        } else if (size == 20) {
            System.out.println(name + "は、バウと吠えた");
        } else {
            System.out.println(name + "は、WAONと吠えた");
        }
    }
}
