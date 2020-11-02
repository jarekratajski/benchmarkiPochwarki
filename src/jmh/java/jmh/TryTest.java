package jmh;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.infra.Blackhole;
import test.TryCost;

public class TryTest {
    @Benchmark
    public void tryCostSimpleSum(Blackhole blackhole) {
        blackhole.consume(TryCost.INSTANCE.trivialSum(-10000,10000));
    }

    @Benchmark
    public void tryCostWithUnlikelyException(Blackhole blackhole) {
        blackhole.consume(TryCost.INSTANCE.tryCatchSum(-10000,10000));
    }
}
