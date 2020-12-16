package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int SIZE = 12;
    private static final int ERROR = -1;
    private final int[] numbers = new int[getSIZE()];

    private int total = getERROR();

    private static int getSIZE() {
        return SIZE;
    }

    private static int getERROR() {
        return ERROR;
    }

    public void countIn(int in) {
        if (!isFull())
            getNumbers()[++total] = in;
    }

    public boolean callCheck() {
        return total == getERROR();
    }

    public boolean isFull() {
        return total == getSIZE() -1;
    }

    public int getTotal() {
        return total;
    }

    protected int peekaboo() {
        if (callCheck())
            return getERROR();
        return getNumbers()[total];
    }

    public int countOut() {
        if (callCheck())
            return getERROR();
        return getNumbers()[total--];
    }

    private int[] getNumbers() {
        return numbers;
    }
}
