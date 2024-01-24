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

        Window w = new Window();
//        window.wind(4,3);
        w.setHeight(10);
        System.out.println(w.getHeight());
        w.setWidth(100);
        System.out.println(w.getWidth());

//        Student s1 = new Student("Mike", 3);
//        System.out.println(s1.getName());
//        System.out.println(s1.getGrade());

    }

    Book b1 = new Book("Java入門","Mike",3000);
//    b1.setTitle("Java応用");
//    System.out.println(b1.getTitle());
}
