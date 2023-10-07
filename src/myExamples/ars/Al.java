package myExamples.ars;

public class Al {

    public static void main(String[] args) {
        Ars ars = new Ars();
        ars.setName("Arsen");

        String ars1 = "arsen" ;
        if (ars.getName().contains(ars1)){
            ars.setName(null);
        }
    }
}
