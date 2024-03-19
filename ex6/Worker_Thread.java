package ex6;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Worker_Thread {

    public static void main(String[] args) {
        // Створюємо чергу завдань
        Queue<Runnable> taskQueue = new ConcurrentLinkedQueue<>();

        // Додаємо завдання до черги
        for (int i = 0; i < 10; i++) {
            taskQueue.add(new Task("Task " + (i + 1)));
        }

        // Створюємо та запускаємо потоки-виконавців
        for (int i = 0; i < 3; i++) { // 3 потоки-виконавці
            Thread workerThread = new Thread(new Worker(taskQueue));
            workerThread.start();
        }
    }

    static class Task implements Runnable {
        private final String name;

        Task(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            // Симулюємо виконання завдання
            System.out.println("Виконання  " + name + " в Потоці: " + Thread.currentThread().getName());
            try {
                Thread.sleep(2000); // Симулюємо тривалість виконання завдання
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class Worker implements Runnable {
        private final Queue<Runnable> taskQueue;

        Worker(Queue<Runnable> taskQueue) {
            this.taskQueue = taskQueue;
        }

        @Override
        public void run() {
            while (true) {
                Runnable task = taskQueue.poll(); // Отримуємо завдання з черги
                if (task == null) {
                    break; // Якщо черга порожня, завершуємо виконання
                }
                task.run(); // Виконуємо завдання
            }
        }
    }
}
