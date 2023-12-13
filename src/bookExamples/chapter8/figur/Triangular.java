package bookExamples.chapter8.figur;

public class Triangular extends Figur {
    Triangular(double a, double b ){
        super(a, b);
    }

    @Override
    double area() {
        return dim1 * dim2;
    }
}
