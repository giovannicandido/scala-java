package com.example.java;

import java.util.function.Supplier;
import java.util.stream.IntStream;
public class ParallelTest {
    private static <T> T measure(Supplier<T> func) {
        long start = System.nanoTime();
        T result = func.get();
        long elapsed = System.nanoTime() - start;
        System.out.printf("A execução do método demorou %dns\n", elapsed);
        return result;
    }
    private static void measure(Runnable runnable) {
        measure(() -> { runnable.run(); return ""; });
    }
    private static int sum = 0; // Warning: data race
    private static void heavyComputation() {
        Permutations.guava("abcdefghijk").forEach(i -> ++sum);
    }
    public static void main(String... args) {
        measure(ParallelTest::heavyComputation);
        System.out.printf("Soma: %s\n", sum);
        measure(() -> IntStream.range(0, 5).forEach(i -> heavyComputation()));
        measure(() -> IntStream.range(0, 5).parallel().forEach(i -> heavyComputation()));
        System.out.printf("Soma: %s\n", sum);
    }
}
