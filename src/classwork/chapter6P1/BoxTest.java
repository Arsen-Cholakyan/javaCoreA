package classwork.chapter6P1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BoxTest {
    public static void main(String[] args) {
        //այս պահին կպատրաստվի մի մի փոփոխական, որը կլինի Box տիպի;
        //Այդպիդի փոփոխականներին կսեն օբեկտներ որովհետև նրանց տիպը բարդ է։
        Box box = new Box();
        box.Width = 100000;
        System.out.println(box.Width);
        //էս պահին Width-ի արժոքը դառավ են արժեքը որը որ կանստրուկտորի մեջ կվերցնե
        box = new Box();
        System.out.println(box.Width);
        System.out.println(box.height);
        System.out.println(box.depth);
    }
}
