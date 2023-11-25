package myExamples.chapter6.canstruktorExample;

public class Ars {
    private  String name;
    private String surname;
    private int age;

    Ars(String n, String s, int age){
        name = n;
        surname = s;
        this.age = age;
    }
    public void printArs(){
        System.out.println(name + " " + surname + " " + age);
    }

}
