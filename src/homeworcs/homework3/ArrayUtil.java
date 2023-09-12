package homeworcs.homework3;

public class ArrayUtil {


    int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};






























    //1.Տպել բոլոր էլեմենտները իրար կողք, բաժանված պռաբելով։
    void task1() {
        System.out.println("1-ին առաջադրանք");
        int a = 0;
        while (a < numbers.length) {
            System.out.print(numbers[a] + "  ");
            a++;
        }
    }

    //2.Տպել մասիվի առաջին էլեմենտը
    void task2() {
        System.out.println("2-րդ առաջադրանք");
        if (numbers.length >= 0) {
            System.out.println(numbers[0]);
        }
    }

    //3.Տպել մասիվի վերջին էլեմենտը
    void task3() {
        System.out.println("3-րդ առաջադրանք");
        int lastElement;
        if (numbers.length == 0) {
            System.out.println(numbers[0]);
        } else {
            lastElement = numbers.length - 1;
            System.out.println(numbers[lastElement]);
        }
    }

    //4.Տպել մասիվի երկարությունը
    void task4() {
        System.out.println("4-րդ առաջադրանք");
        System.out.println(numbers.length);
    }

    //5.Տպել մասիվի ամենափոքր թիվը
    void task5() {
        System.out.println("5-րդ առաջադրանք");
        int theSmallest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < theSmallest) {
                theSmallest = numbers[i];
            }
        }
        System.out.println(theSmallest);
    }

    //6. Տպել մասիվի մեջտեղի թիվը, ստուգել որ 2-ից մեծ լինի երկարությունը, եթե փոքր կամ հավասար
    // էղավ, տպեք որ can't print middle values. եթե զույգ է մասիվի մեջի էլեմենտների
    // թիվը, տպեք մեջտեղի երկու էլեմենտները, եթե կենտ է մի հատը։

    void task6() {
        System.out.println("6-րդ առաջադրանք");
        int middleNumber;
        if (numbers.length <= 2) {
            System.out.println("can't print middle values");
        } else {
            middleNumber = numbers.length / 2;
            System.out.println(numbers[middleNumber]);
            if (numbers.length % 2 == 0) {
                System.out.println(numbers[middleNumber]);
                System.out.println(numbers[middleNumber + 1]);
            } else {
                System.out.println(numbers[middleNumber]);
            }
        }
    }

    //7.Հաշվել ու տպել մասիվում զույգերի քանակը։
    void task7() {
        System.out.println("7-րդ առաջադրանք");
        int numberOfDivisibleNumbers = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                numberOfDivisibleNumbers++;
            }
        }
        System.out.println(numberOfDivisibleNumbers);
    }

    //8.Հաշվել ու տպել մասիվում կենտերի քանակը։
    void task8() {
        System.out.println("8-րդ առաջադրանք");
        int numberOfOddNumbers = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 1) {
                numberOfOddNumbers++;
            }
        }
        System.out.println(numberOfOddNumbers);
    }

    //9.Տպել մասիվում էլեմենտների գումարը։
    void task9() {
        System.out.println("9-րդ առաջադրանք");
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = numbers[i] + sum;
        }
        System.out.println(sum);
    }

    //10.Տպել մասիվում թվերի միջին թվաբանականը։
    void task10() {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum/numbers.length);
    }
}
