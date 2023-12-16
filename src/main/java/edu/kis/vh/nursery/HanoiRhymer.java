package edu.kis.vh.nursery;

public class HanoiRhymer extends CountingOutRhymer {

    int totalRejected = 0;

    public int getTotalRejected() {
        return totalRejected;
    }

    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
