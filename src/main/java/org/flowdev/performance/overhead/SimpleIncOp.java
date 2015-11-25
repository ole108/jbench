package org.flowdev.performance.overhead;

import org.flowdev.base.data.NoConfig;
import org.flowdev.base.op.FilterOp;

public class SimpleIncOp extends FilterOp<NormalFlowData, NoConfig> {
    @Override
    protected void filter(NormalFlowData data) {
        data.setAnInt(data.getAnInt() + 1);

        outPort.send(data);
    }
}
