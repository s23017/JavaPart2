package exercise4;

public class Window {
    int height = 2;
    int width = 3;
    public void area(int newheight, int newwidth) {
        this.height = newheight;
        this.width = newwidth;
        System.out.println(newheight);
        System.out.println(newwidth);
    }
}
