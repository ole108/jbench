package org.flowdev.performance.overhead.raw;

import org.flowdev.base.Port;

public class RawInc400Flow {
    private RawInc20Flow inc1;
    private RawInc20Flow inc2;
    private RawInc20Flow inc3;
    private RawInc20Flow inc4;
    private RawInc20Flow inc5;
    private RawInc20Flow inc6;
    private RawInc20Flow inc7;
    private RawInc20Flow inc8;
    private RawInc20Flow inc9;
    private RawInc20Flow inc10;

    public RawInc400Flow() {
        inc1 = new RawInc20Flow();
        inc2 = new RawInc20Flow();
        inc3 = new RawInc20Flow();
        inc4 = new RawInc20Flow();
        inc5 = new RawInc20Flow();
        inc6 = new RawInc20Flow();
        inc7 = new RawInc20Flow();
        inc8 = new RawInc20Flow();
        inc9 = new RawInc20Flow();
        inc10 = new RawInc20Flow();

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
