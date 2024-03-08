import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Worker_Tread {
    public static void main(String[] args){
        BlockingQueue<Runnable> task_Queue = new ArrayBlockingQueue<> (10);
        Worker_Tread worker_Tread = new Worker_Tread(task_Queue);
        worker_Tread.start();

        // Додаємо завдання в чергу
        for (int i = 0; i<10; i++){
            int task_Number = i + 1; 
            task_Queue.add(() -> {
                System.out.println("Виконується завдання: " + task_Number);
                try{
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
    }
}
class Worker_Tread extends Thread{
    private final BlockingQueue<Runnable> task_Queue;

    public Worker_Tread(BlockingQueue<Runnable> task_Queue){
        this.task_Queue = task_Queue;
    }
    @Override
    public void run(){
        while(!Thread.current_Thread().isInterrupted()){
            try{
                Runnable task = task_Number.take();
                task.run();
            } catch(Interrupted_Exception e) {
                Thread.current_Thread().interrupt();
            }
        }
    }
}