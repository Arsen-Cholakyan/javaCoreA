package bookExamples.chapter7.testExample;

public class Test {
    int a;
    int b;

    Test (int i, int f){
        a = i;
        b = f;
    }

    boolean ecolTu(Test o){
        if (o.a == a && o.b == b){
            return true;
        }else {
            return false;
        }
    }
}
