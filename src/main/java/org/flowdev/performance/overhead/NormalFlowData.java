package org.flowdev.performance.overhead;

public class NormalFlowData {
    private int anInt;

    public int getAnInt() {
        return anInt;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }

    public NormalFlowData withAnInt(final int anInt) {
        this.anInt = anInt;
        return this;
    }

}
