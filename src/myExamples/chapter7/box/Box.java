package myExamples.chapter7.box;

public class Box {
    double wight;
    double hgt;
    double dept;

    Box(){
    }

    Box(double w, double h, double d){
        wight = w;
        hgt= h;
        dept = d;
    }

    Box( Box o, Box d){
        wight = o.wight;
        hgt = d.hgt;
        dept = d.dept;
    }
}
