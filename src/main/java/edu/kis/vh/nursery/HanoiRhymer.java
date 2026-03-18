package edu.kis.vh.nursery;

public class HanoiRhymer extends defaultCountingOutRhymer {

    public static final int TOTAL_REJECTED_INITIAL_VALUE = 0;
    int totalRejected = TOTAL_REJECTED_INITIAL_VALUE;

    public int reportRejected() {
        return totalRejected;
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo()) totalRejected++;
        else super.countIn(in);
    }
}
