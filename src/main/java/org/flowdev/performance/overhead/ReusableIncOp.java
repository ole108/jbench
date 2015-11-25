package org.flowdev.performance.overhead;

import org.flowdev.base.Getter;
import org.flowdev.base.Setter;
import org.flowdev.base.data.NoConfig;
import org.flowdev.base.op.FilterOp;

public class ReusableIncOp<T> extends FilterOp<T, NoConfig> {
    public static class Params<T> {
        public Getter<T, Integer> getInt;
        public Setter<Integer, T, T> setInt;
    }

    private final Params<T> params;

    public ReusableIncOp(Params<T> params) {
        this.params = params;
    }

    @Override
    protected void filter(T data) {
        outPort.send(params.setInt.set(data, params.getInt.get(data) + 1));
    }
}
