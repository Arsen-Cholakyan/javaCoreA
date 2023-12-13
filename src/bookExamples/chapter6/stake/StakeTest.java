package bookExamples.chapter6.stake;

public class StakeTest {
    static Stake stake = new Stake();
    public static void main(String[] args) {
        stake.Push(34);
        stake.Push(4);
        stake.Push(3);
        stake.Push(111);
        System.out.println(stake.theItemIWant(4));
        System.out.println(stake.theItemIWant(3));
        System.out.println(stake.theItemIWant(111));
    }
}
