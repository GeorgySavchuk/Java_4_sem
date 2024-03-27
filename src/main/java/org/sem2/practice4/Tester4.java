package org.sem2.practice4;

public class Tester4 {
    public static void test() {
        CustomExecutorService executorService = new CustomExecutorService(3);

        for (int i = 0; i < 10; i++) {
            final int taskNumber = i;
            executorService.execute(() -> {
                System.out.println("Task " + taskNumber + " is being executed by thread: " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Task " + taskNumber + " has been executed");
            });
        }
    }
}
