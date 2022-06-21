

public class SingletonUser implements Runnable {

    @Override
    public void run() {
        Singleton singleton  = Singleton.getInstance();

        System.out.println(Thread.currentThread().getName()+" "+singleton.hashCode() + " " + "Razgovor o nitima");
    }

}