package myExamples.chapter7.complexVariableAndObjekt.test2;

public class Test {
    int a;
    int b;

    Test(int a, int b){
        this.a = a;
        this.b = b;
    }

    void numbers(Test ob){
        ob.a *= 2;
        ob.b -= 3;
        System.out.println(ob.a + " " + ob.b);
    }
}
