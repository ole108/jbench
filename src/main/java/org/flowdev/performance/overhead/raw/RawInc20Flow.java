package org.flowdev.performance.overhead.raw;

import org.flowdev.base.Port;

public class RawInc20Flow {
    private RawIncOp inc1;
    private RawIncOp inc2;
    private RawIncOp inc3;
    private RawIncOp inc4;
    private RawIncOp inc5;
    private RawIncOp inc6;
    private RawIncOp inc7;
    private RawIncOp inc8;
    private RawIncOp inc9;
    private RawIncOp inc10;

    public RawInc20Flow() {
        inc1 = new RawIncOp();
        inc2 = new RawIncOp();
        inc3 = new RawIncOp();
        inc4 = new RawIncOp();
        inc5 = new RawIncOp();
        inc6 = new RawIncOp();
        inc7 = new RawIncOp();
        inc8 = new RawIncOp();
        inc9 = new RawIncOp();
        inc10 = new RawIncOp();

        createConnections();
    }

    private void createConnections() {
        inc1.setOutPort(inc2.getInPort());
        inc2.setOutPort(inc3.getInPort());
        inc3.setOutPort(inc4.getInPort());
        inc4.setOutPort(inc5.getInPort());
        inc5.setOutPort(inc6.getInPort());
        inc6.setOutPort(inc7.getInPort());
        inc7.setOutPort(inc8.getInPort());
        inc8.setOutPort(inc9.getInPort());
        inc9.setOutPort(inc10.getInPort());
    }

    public Port<RawFlowData> getInPort() {
        return inc1.getInPort();
    }

    public void setOutPort(Port<RawFlowData> outPort) {
        inc10.setOutPort(outPort);
    }
}
