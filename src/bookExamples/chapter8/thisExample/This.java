package bookExamples.chapter8.thisExample;

public class This {

    String ars = "ars";
    String arsen = "asen";

    public void arsen(){
        this.arsen = this.ars;
    }

    This(String ars, String arsen){
        this.ars = ars;
        String al = arsen;
        System.out.println(this.arsen + " " + al);
    }
}
