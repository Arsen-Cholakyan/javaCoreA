package myExamples.chapter7.complexVariableAndObjekt.test1;

import myExamples.chapter7.complexVariableAndObjekt.test1.Test;

public class TestTest {
    public static void main(String[] args) {
        int f = 33;
        int k = 21;

        Test test = new Test();
        test.numbers(f,k);
        System.out.println(f + " " +k);
    }
}