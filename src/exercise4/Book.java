package exercise4;

public class Book {
    //private フィールド
    //名前　文字列
    //作者　文字列
    //価格　整数
    private String title;
    private String author;
    private int price;

    //コンストラクタの引数で
    //名前と作者と価格が入られるようにする

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    //getterとsetterを作る

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

