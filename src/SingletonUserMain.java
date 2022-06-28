
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingletonUserMain{

    public static void main(String[] args) {

        ExecutorService executorService = null;
        SingletonUser singletonUser = new SingletonUser();
        try {
            executorService = Executors.newFixedThreadPool(5);
            //executorService = Executors.newFixedThreadPool(5);
            executorService.execute(singletonUser);
            executorService.execute(singletonUser);
            executorService.execute(singletonUser);
            executorService.execute(singletonUser);
            executorService.execute(singletonUser);
            executorService.execute(singletonUser);

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(executorService != null)
                executorService.shutdown();
        }

    }

}