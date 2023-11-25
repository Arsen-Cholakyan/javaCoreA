package myExamples.chapter6.metodExamples;

public class Metods {

    //1 մեթոդ որը ինչ որ մի բան կնդունե;
    void ars(String name) {
        System.out.println(name);
    }

    //2 մեթոդ որը ինչ որ մի բան կվերադարձնե;
    String ars2(String name){
        return name;
    }

    //3 մեթոդ որը ոչ կվերադարձնե ոչ կնդունե

    void ars3(){
        for (int i = 0; i < 5; i++) {
            System.out.println("hello");
        }
    }
}
