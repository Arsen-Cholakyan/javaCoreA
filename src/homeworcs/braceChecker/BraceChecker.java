package homeworcs.braceChecker;

public class BraceChecker {

    //սա մեր տեկստն է
    private String text;

    //կլասի կանստրուկտորն է, որը պետքե ընդունի String-տիպի տեքստ,վերագրի վերևի text-ին
    //Որ չկարողանանք BraceChecker-ի օբեկտը սարքենք առանց text-տալու կանստրուկտորի միջոցով
    public BraceChecker(String fullText) {
        text = fullText;


    }

    //սա հիմնական մեր մեթոդն է, որի մեջ գրելու ենք ամբողջ լեգիկան․ աշկատելու էնք թե stack-հետ թե text-ի
    public void check() {
        System.out.println(text);
        char[] textArray = text.toCharArray();
        Stack stack = new Stack();
        for (int i = 0; i < textArray.length; i++) {
            switch (textArray[i]) {
                case '(':
                    stack.push(textArray[i]);
                    break;
                case '{':
                    stack.push(textArray[i]);
                    break;
                case '[':
                    stack.push(textArray[i]);
                    break;
            }
        }

        for (int i = 0; i < textArray.length; i++) {
            switch (textArray[i]) {
                case '}':
                    char c = (char) stack.pop();
                    if (c != '{') {
                        System.err.println("բացվել է " + c + " փակվել է " + textArray[i] + " սխալը գտնվում է " + i + "-index-ի վրա");
                    }
                    break;

                case ')':
                    char c1 = (char) stack.pop();
                    if (c1 != '(') {
                        System.err.println("բացվել է " + c1 + " փակվել է " + textArray[i] + " սխալը գտնվում է " + i + "-index-ի վրա");
                    }

                case ']':
                    char c2 = (char) stack.pop();
                    if (c2 != '[') {
                        System.err.println("բացվել է " + c2 + " փակվել է " + textArray[i] + " սխալը գտնվում է " + i + "-index-ի վրա");
                    }
            }
        }
    }
}



