package bookExamples.chapter6.box2;

public class Box {
    public   double Width;
    public double height;
    public double depth;


    public void setDim(double w, double h, double d){
        Width = w;
        height = h;
        depth = d;
    }

    public double vail(){
        System.out.println("ընդանուր գումարը հավասար է");
        return Width * depth * height;
    }
}
