package org.flowdev.performance.overhead.raw;

import org.flowdev.base.Port;

public class RawIncOp {
    private Port<RawFlowData> outPort;
    private Port<RawFlowData> inPort = data -> {
        data.anInt++;
        outPort.send(data);
    };

    public Port<RawFlowData> getInPort() {
        return inPort;
    }

    public void setOutPort(Port<RawFlowData> outPort) {
        this.outPort = outPort;
    }
}
