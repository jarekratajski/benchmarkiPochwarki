package jmh;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.infra.Blackhole;
import test.*;

public class RootTest {

    @Benchmark
    public void tryCostSimpleSum(Blackhole blackhole) {
        blackhole.consume(TryCost.INSTANCE.trivialSum(-10000,10000));
    }

    @Benchmark
    public void tryCostWithUnlikelyException(Blackhole blackhole) {
        blackhole.consume(TryCost.INSTANCE.tryCatchSum(-10000,10000));
    }

    @Benchmark
    public void trivial(Blackhole blackhole) {
        long a = System.nanoTime();
        blackhole.consume(a+1);
    }

    @Benchmark
    public void root1(Blackhole blackhole) {
        blackhole.consume(Roots.INSTANCE.hasPositiveRoot(1.0, -2.0, 1.0));
        blackhole.consume(Roots.INSTANCE.hasPositiveRoot(2.0, -2.0, -10.0));
        blackhole.consume(Roots.INSTANCE.hasPositiveRoot(-2.0, -2.0, +10.0));
        blackhole.consume(Roots.INSTANCE.hasPositiveRoot(2.0, +16.0, 10.0));

    }

    @Benchmark
    public void root2(Blackhole blackhole) {
        blackhole.consume(Roots2.INSTANCE.hasPositiveRoot(1.0, -2.0, 1.0));
        blackhole.consume(Roots2.INSTANCE.hasPositiveRoot(2.0, -2.0, -10.0));
        blackhole.consume(Roots2.INSTANCE.hasPositiveRoot(-2.0, -2.0, +10.0));
        blackhole.consume(Roots2.INSTANCE.hasPositiveRoot(2.0, +16.0, 10.0));
    }

    @Benchmark
    public void root3(Blackhole blackhole) {
        blackhole.consume(Roots3.INSTANCE.hasPositiveRoot(1.0, -2.0, 1.0));
        blackhole.consume(Roots3.INSTANCE.hasPositiveRoot(2.0, -2.0, -10.0));
        blackhole.consume(Roots3.INSTANCE.hasPositiveRoot(-2.0, -2.0, +10.0));
        blackhole.consume(Roots3.INSTANCE.hasPositiveRoot(2.0, +16.0, 10.0));
    }

    @Benchmark
    public void root4(Blackhole blackhole) {
        blackhole.consume(Roots4.INSTANCE.hasPositiveRoot(1.0, -2.0, 1.0));
        blackhole.consume(Roots4.INSTANCE.hasPositiveRoot(2.0, -2.0, -10.0));
        blackhole.consume(Roots4.INSTANCE.hasPositiveRoot(-2.0,-2.0, +10.0));
        blackhole.consume(Roots4.INSTANCE.hasPositiveRoot(2.0,+16.0, 10.0));
    }

    @Benchmark
    public void root4v(Blackhole blackhole) {
        blackhole.consume(Roots4v.INSTANCE.hasPositiveRoot(1.0, -2.0, 1.0));
        blackhole.consume(Roots4v.INSTANCE.hasPositiveRoot(2.0, -2.0, -10.0));
        blackhole.consume(Roots4v.INSTANCE.hasPositiveRoot(-2.0,-2.0, +10.0));
        blackhole.consume(Roots4v.INSTANCE.hasPositiveRoot(2.0,+16.0, 10.0));
    }

}
