package day36_methods;

public class Painter {
    public static void main(String[] args) {
        Picture.draw();
        Picture.draw(100);
        Picture.draw("Red");
        Picture.draw("Blue", "Green");
    }
}
