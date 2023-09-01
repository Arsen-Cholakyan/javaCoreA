package homeworcs.homework2;

public class ForExamples {
    public static void main(String[] args) {

        // 1. Տպել 1-ից 1000 թվերը իրար կողք, արանքում դնելով - սինվոլը։ Այնպես գրեք, որ վերջում - չլինի։

        System.out.println("1 վարժություն");

        String minus = "-";
        String[] numbers = new String[1002];

        for (int i = 1; i < numbers.length; i++) {
            if (i < 501){
                numbers[i] = i + "";
            }
            if (i == 501){
                numbers[i] = minus;
            }
            if (i > 501){
                numbers[i] = i - 1 + " ";
            }
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] != "-") {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();


        // 2. Տպել 1-ից 100 թվերի մեջ ընկած զույգերը օգտագործելով % գործողությունը։
        System.out.println("2 վարժություն");
        int[] numbers2 = new int[101];
        for (int i = 1; i < numbers2.length; i++) {
            numbers2[i] = i;
        }
        for (int i = 1; i < numbers2.length; i++) {
            if (numbers2[i]  % 2 == 0){
                System.out.print(numbers2[i] +" ");
            }
        }
        System.out.println();

        // 3. Հայտարարել թվերի մասիվ՝ int[] array = {2,5,8,4,9,3,7}, ֆոր- օգտագործելով գտնել մասիվի ամենամեծ թիվը ու տպել։
        System.out.println("3 վարժություն");
        int number  = 0;
        int[] array = {2,5,8,4,9,3,7};
        for (int i = 0; i < array.length; i++) {
            if (array[i] > number){
                number = array[i];
            }
        }
        System.out.println(number);

        // 1. Տպել 1-ից 1000 թվերը իրար կողք, արանքում դնելով - սինվոլը։ Այնպես գրեք, որ վերջում - չլինի։
        // 2. օրինակ
        System.out.println("1-ին վարժության 2-րդ օրինակ");
        int[] numbers3 = new int[1001];
        char[] minus1 = {'-'};
        for (int i = 1; i < numbers3.length; i++) {
            if (i == 501){
                for (int j = 0; j < minus1.length; j++) {
                    System.out.print(minus1[j] + " ");
                }
            }
            numbers3[i] = i;
            System.out.print(numbers3[i] + " ");
        }
        System.out.println();

        for (int i = 1; i < numbers3.length; i++) {
            System.out.print(numbers3[i] + " ");
        }
    }
}
