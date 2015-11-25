package org.flowdev.performance.overhead.raw;

import org.flowdev.base.Port;

public class RawInc8000Flow {
    private RawInc400Flow inc1;
    private RawInc400Flow inc2;
    private RawInc400Flow inc3;
    private RawInc400Flow inc4;
    private RawInc400Flow inc5;
    private RawInc400Flow inc6;
    private RawInc400Flow inc7;
    private RawInc400Flow inc8;
    private RawInc400Flow inc9;
    private RawInc400Flow inc10;

    public RawInc8000Flow() {
        inc1 = new RawInc400Flow();
        inc2 = new RawInc400Flow();
        inc3 = new RawInc400Flow();
        inc4 = new RawInc400Flow();
        inc5 = new RawInc400Flow();
        inc6 = new RawInc400Flow();
        inc7 = new RawInc400Flow();
        inc8 = new RawInc400Flow();
        inc9 = new RawInc400Flow();
        inc10 = new RawInc400Flow();

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
