package org.flowdev.performance.overhead.raw;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.math.BigInteger;
import java.util.concurrent.TimeUnit;

@State(Scope.Benchmark)
@Fork(value = 1, warmups = 0)
@Warmup(iterations = 1, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 1, time = 1, timeUnit = TimeUnit.SECONDS)
public class RawFlowOverheadBenchmark {
    private RawInc8000Flow flow = new RawInc8000Flow();
    private RawFlowData flowData = new RawFlowData();

    // No need for loops, JMH will handle this...
    @Benchmark
    public RawFlowData inc1000() {
        flowData.anInt = 0;

        flow.setOutPort(data -> flowData = data);
        flow.getInPort().send(flowData);

        return flowData;
    }

}
