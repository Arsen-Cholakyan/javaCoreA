package myExamples.chapter7.overload;

public class OverloadExample {
    //1-ին օրինակ
    public void number(){
        int n = 9;
        System.out.println(n);
    }

    //2-րդ օրինակ
    public void number(int n){
        System.out.println(n);
    }

    //3-րդ օրինակ
    public int number(int n, String name){
        System.out.print(name + " ");
        return n;
    }
}
