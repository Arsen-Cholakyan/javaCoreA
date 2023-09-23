package homeworcs.dinamicArray;

public class DynamicArray {


    //սա մեր հիմնական մասիվն է, որտեղ պահելու ենք ավելացվող էլեմենտները
    private int[] array = new int[10];
    //սա մեր մասիվի մեջ ավելացված էլեմենտների քանակն է
    private int size = 0;

    //ստուգել եթե մասիվի մեջ տեղ չկա-> կանչել extend()
    //և ավելացնենք
    public void add(int value) {
        if (size == array.length) {
            System.out.println("մասիվի մեչ տեղ չկա");
            System.out.println("խնդրում ենք մեծացրեկ ձեր մասիվի չապսը");
            extend();
        } else {
            array[size++] = value;
            System.out.println("ավելացվել է " + size + "էլեմենտ");
        }
    }


    //1․ ստեղծել հին մասիվից 10 էլեմենտ ավելի մեծ մասիվ
    //2․ քցել հին մասիվի էլեմենտները նորի մեջ
    //3․ հին մասիվի հղումը կապենք նոր մասիվի հղման հետ։
    private void extend() {
        int[] array2 = new int[20];
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i];
        }
        array = array2;
    }

    //եթե տրված ինդեքսը մեր ունեցած մասիվի ինդեքսի սահմաններում է, վերադարձնել
    // մասիվի index-երրորդ էլեմենտը։ Հակառակ դեպքում վերադարձնել -1։
    public int getByIndex(int index) {
        int a = -1;
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                a = array[i];
            }
        }
        return a;
    }

    //տպել մասիվի ավելացված էլեմենտները
    public void print() {
        System.out.println("ուղակի կտպեմ մասիվի բոլոր էլեմենտները ");
        for (int i = 0; i < size; i++) {
            System.out.print("|" + array[i] + "|");
        }
        System.out.println();
    }


    //ջնջել մասիվի index-երորդ էլեմենտը
    //եթե չկա նման ինդեքսով էլեմենտ, տպել, որ չկա նման էլեմենտ
    public void deleteByIndex(int index) {

        boolean tool = false;
        int index2 = 0;
        for (int i = 0; i < size; i++) {
            if (i == index) {
                System.out.println();
                System.out.println(array[index]);
                --size;
                tool = true;
                index2 = i;
                for (int j = index2; j < size; j++) {
                    array[j] = array[j + 1];
                }
                System.out.println("մասիվի մեջի էլեմենտը ջնջձել եմ");
            }
        }
        if (tool == false) {
            System.out.println();
            System.out.print("չկա նման ինդեկս");
            System.out.println();
        }


    }


    //տրված value-ն դնելու ենք տրված index-ով էլեմենտի տեղը։
    // Հին արժեքը կկորի
    //եթե նման ինդեքսով էլեմենտ չկա, գրում ենք որ չկա։
    public void set(int index, int value) {
        boolean assistant = false;
        for (int i = 0; i < size; i++) {
            if (i == index) {
                System.out.println();
                System.out.print(array[index]);
                assistant = true;
                array[i] = value;
                System.out.println();
                System.out.println("մասիվի էլեմենտներից 1-հատը փոփոխվել է");
            }
        }
        if (assistant == false) {
            System.out.println("նման ինդեքսով էլեմենտ չկա");
        }

    }


    //ավելացնել տրված value-ն տրված ինդեքսում, իսկ էղած էլեմենտները մի հատ աջ տանել։
    //Եթե չկա նման ինդեքս, տպել որ չկա
    public void add(int index, int value) {
        boolean tool = false;
        int element = 0;
        for (int i = 0; i < size; i++) {
            if (i == index) {
                tool = true;
                array[i] = value;
            }
        }
        if (index < size-1){
            for (int i = 0; i < size; i++) {
                if (array[i] == value) {
                    element = array[i + 1];
                    array[i + 1] = value;
                    array[i] = element;
                    System.out.println();
                    System.out.println("մասիվի մասիվի քցել եմ էլեմենտ ու 1-հատով առաջ եմ տվել");
                    break;
                }
            }
        }
        if (tool == false) {
            System.out.println();
            System.out.println("այդպիսի ինդեկս գոյություն չունի");
            System.out.println();
        }
    }


    //Վերադարձնել true եթե տրված value-ն կա մեր մասիվի մեջ, եթե ոչ false
    public boolean exists(int value) {
        boolean tool = false;
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                tool = true;
                return tool;
            }
        }
        return tool;
    }


    //Վերադարձնել տրված value-ի ինդեքսը, եթե շատ կա տվյալ թվից, վերադարձնել առաջին ինդեքսը։
    //եթե չկա, -1
    public int getIndexByValue(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
