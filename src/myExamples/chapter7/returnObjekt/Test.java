package myExamples.chapter7.returnObjekt;

public class Test {
    int a ;

    Test(int i){
        a = i;
    }

    Test incrByTen(){
        Test test = new Test(a + 10);
        return test;
    }
}
