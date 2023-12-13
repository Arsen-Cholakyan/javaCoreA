package bookExamples.chapter8.figur;

public class FigureMain {
    public static void main(String[] args) {
        Triangular t = new Triangular(2,2);
        Figur f = t;
        System.out.println(f.area());
    }
}
