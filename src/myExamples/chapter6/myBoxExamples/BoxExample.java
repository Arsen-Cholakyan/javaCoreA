package myExamples.chapter6.myBoxExamples;

public class BoxExample {
    public static void main(String[] args) {
        //մեկ օբեկտին մի քանի սիլկա նայելու օրինակը
        Box myBox = new Box();
        myBox.height = 10.45;
        Box myBox2 = myBox;
        System.out.println(myBox2.height);
        Box myBox3 = myBox2;
        System.out.println(myBox3.height);
        System.out.println(myBox.height);
    }
}
