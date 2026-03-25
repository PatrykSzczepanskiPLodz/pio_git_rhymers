package edu.kis.vh.nursery;

public class HanoiRhymer extends defaultCountingOutRhymer {

    private static final int TOTAL_REJECTED_INITIAL_VALUE = 0;
    private int totalRejected = TOTAL_REJECTED_INITIAL_VALUE;

    public int reportRejected() {
        return totalRejected;
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo()) totalRejected++;
        else super.countIn(in);
    }
}
