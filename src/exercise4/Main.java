package exercise4;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        dog1.size = 1;
        dog1.name = "イヌ";
        dog1.bark();

        dog2.size = 20;
        dog2.name = "ドッグ";
        dog2.bark();

        dog3.size = 10;
        dog3.name = "イオン";
        dog3.bark();

        //この３匹を配列に入れる
        //for文を使い。吠えるメソッドを呼び出す

        //もしint型の配列ならば
        int[] data = new int[3];
        data[0] = 10;

        Dog[] dogs = new Dog[3];
        dogs[0] = dog1;
        dogs[1] = dog2;
        dogs[2] = dog3;

        for(Dog d: dogs) {

        }

        Window window = new Window();
        window.area(4,3);
    }
}
