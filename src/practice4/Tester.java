package practice4;

public class Tester {
    public static void main(String[] args) {
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
