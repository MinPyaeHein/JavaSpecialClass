package org.example.Day12;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestingForCommit {

    public static void main(String[] args) {
        ExecutorService executorService1= Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        for (int i = 0; i < 10; i++) {
            int taskId = i;
            executorService1.submit(() -> {
                System.out.println("Executing task 1::" + taskId + " on thread " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000); // Simulating task work
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }

        executorService1.shutdown();

        ExecutorService executorService2= Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        for (int i = 0; i < 10; i++) {
            int taskId = i;
            executorService2.submit(() -> {
                System.out.println("Executing task 2::" + taskId + " on thread " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000); // Simulating task work
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }

        executorService2.shutdown();
    }
}
