package bookExamples;

public class Chapter5 {
    public static void main(String[] args) {

        //գրքի 1-ին օրինակ
        int a, b;
        b= 10;
        a = 5;
        if (a < b) a = 0;
         else b = 0;

        //գրքի 2-րդ օրինակ
//        int bytesAvailable = 10;
//        int n = 3;
//        if (bytesAvailable > 0){
//            ProcessData();
//            bytesAvailable -= n;
//        }else {
//            waitForMoreData();
//        }

        //գրքի 3-րդ օրինակ
        int i = 2;
        int k = 12;
        int c = 0;
        int d = 30;
        int j = 8;

        if (i == 10){
            if (j < 10) a =b;
            if (k > 100) c = d;
            else a = c;
        }else a = d;

        //գրքի 4-րդ օրինակ
        int month = 4;
        String season = " ";
        if (month == 12 || month == 1 || month == 2){
            season = "ձմեռ";
        }else if (month == 3 || month == 4 || month==5){
            season = "գարուն";
        }else if (month == 6 || month == 7 || month == 8){
            season = "ամառ";
        }else if (month == 9 || month == 10 || month==11){
            season = "աշուն";
        }else System.out.println("հօրինված ամիս");

        System.out.println("ապրիլ ամիսը պատկանում է " + season);


        //գրքի 5-րդ օրինակ
        for (int l = 0; l < 6; l++) {
            switch (l){
                case 0:
                    System.out.println("l-ը հավասար է 0-ի");
                    break;
                case 1:
                    System.out.println("l-ը հավասար է 1-ի");
                    break;
                case 2:
                    System.out.println("l-ը հավասար է 2-ի");
                    break;
                case 3:
                    System.out.println("l-ը հավասար է 3-ի");
                    break;
                default:
                    System.out.println("l-ը մեծ է 3-ից ");
            }
        }

        //գրքի 5-րդ օրինակ
        for (int l = 0; l < 12; l++) {
            switch (i){
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("i-ն փոքր է 5-ից");
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.println("i-ն փոքր է 10-ից");
                    break;
                default:
                    System.out.println("i-ն մեծ կամ հավասար է 10");
            }
        }

        //գրքի 6-րդ օրինակ
        int monte = 4;
        String season1 = " ";
        switch (monte){
            case 12:
            case 1:
            case 2:
                season1 = "ձմեռ";
                break;
            case 3:
            case 4:
            case 5:
                season1 = "գարուն";
                break;
            case 6:
            case 7:
            case 8:
                season1="ամառ";
                break;
            case 9:
            case 10:
            case 11:
                season1="աշուն";
                break;
            default:
                System.out.println("այդպիսի ամիիս գօյուտյուն չունի");
        }
        System.out.println(season1);


        //գրքի 7-րդ օրինակ
        String str = "երկու";
        switch (str){
            case "մեկ":
                System.out.println("մեկ");
            break;
            case  "երկու":
                System.out.println("երկու");
             break;
            case "երեք":
                System.out.println("երեք");
                break;
            default:
                System.out.println("ոչ մեկին էլ հավասար չեր");
        }

        //գրքի 8-րդ օրինակ while
        int n = 10;
        while (n > 0){
            System.out.println("տակտ" + n);
            n--;
        }

    }
}
