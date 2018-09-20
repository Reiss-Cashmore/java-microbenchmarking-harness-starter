package org.benchmarking;

import java.util.concurrent.TimeUnit;
import java.util.*;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Param;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;

@BenchmarkMode(Mode.AverageTime)
@Warmup(iterations = 2, time = 750, timeUnit = TimeUnit.MILLISECONDS)
@Measurement(iterations = 3, time = 700, timeUnit = TimeUnit.MILLISECONDS)
public class SimpleBenchmark {


    // To pass parameters into your test functions you must define a class decorated with @State
    @State(Scope.Benchmark)
    public static class BenchmarkState {

        @Param({ "1", "2", "3", "4", "5"})
        int iterations;

        public void setUp() {
            // You can use this function to prepare/preprocess any variables that need to be maniuplated before they are passed to your test function
        }
    }

    @Benchmark
    public static double functionToBeBenchmarked(BenchmarkState _benchmarkState){

        double value = 4;
        int iterations = _benchmarkState.iterations;
        for (int i = 0; i < iterations; i++) {
            value = Math.pow(value, i);
        }
        return value;
    }

}