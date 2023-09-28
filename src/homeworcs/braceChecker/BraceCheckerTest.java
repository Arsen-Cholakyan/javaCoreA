package homeworcs.braceChecker;

public class BraceCheckerTest {
    public static void main(String[] args) {
    String fullText = "({[(Arsen]}Cholakyan}]";
    BraceChecker braceChecker = new BraceChecker(fullText);
    braceChecker.check();

    }
}
