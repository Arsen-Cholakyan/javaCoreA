package bookExamples.chapter6.stake;

public class Stake {
    int[] stake = new int[10];
    int tos;
    int ars = 0;

    Stake() {
        tos = -1;
    }

    void Push(int itm) {
        if (tos != stake.length - 1) {
            stake[++tos] = itm;
            System.out.println("ավելացավ ելեմենտ " + ++ars);
        } else {
            System.err.println("մասիվի մեջ տեղ չկա");
        }
    }

    int pop() {
        if (tos < 0) {
            System.out.println("էլեմենտ չկա");
            return 0;
        } else {
            return stake[tos--];
        }

    }

    int theItemIWant(int element) {
        for (int i = 0; i <=tos; i++) {
            if (stake[i] == element) {
                return i;
            }
        }
        return 0;
    }
}


