import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class Paralel_Procesing{
    public static void main(String[] args){
        List<integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
        
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Обчислення мінімуму
        executor.submit(() -> {
            int min = numbers.stream().min(Integer::compareTo).orElse(0);
            System.out.println("Мінімум: " + min);
        });

        // Обчислення максимуму
        executor.submit (() -> {
            int max = numbers.stream().max(Integer::compareTo).orElse(0);
            System.out.println("Максимум: " + max);
        });
        }

        // Обчислення середнього значення
        executor.submit (() -> {
            double average = numbers.stream().mapToDouble(Integer::doubleValue).average().orElse(0);
        });

        // Очікуємо завершення виконання всіх завдань
        executor.shutdown();
        try{
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (Interrupted_Exception e){
            e.printStackTrace();
        }
    
    }
