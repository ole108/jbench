package org.flowdev.performance.overhead;

import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

@State(Scope.Benchmark)
//@BenchmarkMode(value = Mode.AverageTime)
@Fork(value = 1, warmups = 0)
@Warmup(iterations = 1, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 1, time = 1, timeUnit = TimeUnit.SECONDS)
public class FlowOverheadBenchmark {
    // Don't just add both numbers in the method
    // or the benchmark is prone to constant folding
    private int inc = 1;
    private int sum = 0;

    @Benchmark
    public int inc8000() {
        sum = 0;

        inc400();
        inc400();
        inc400();
        inc400();
        inc400();
        inc400();
        inc400();
        inc400();
        inc400();
        inc400();

        return sum;
    }

    private void inc400() {
        inc20();
        inc20();
        inc20();
        inc20();
        inc20();
        inc20();
        inc20();
        inc20();
        inc20();
        inc20();
    }

    private void inc20() {
        inc1();
        inc1();
        inc1();
        inc1();
        inc1();
        inc1();
        inc1();
        inc1();
        inc1();
        inc1();
    }

    private void inc1() {
        sum += inc;
    }
}
