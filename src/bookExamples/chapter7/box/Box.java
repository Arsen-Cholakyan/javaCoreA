package bookExamples.chapter7.box;

public class Box {
    double wight;
    double heg;
    double dept;

    Box (){
    }

    Box(double w,double h,double d){
        wight = w;
        heg = h;
        dept = d;
    }

    Box(Box b){
        wight = b.wight;
        heg = b.heg;
        dept = b.dept;
    }
}
