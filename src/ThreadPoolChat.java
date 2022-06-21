import java.util.concurrent.*;
//import org.apache.commons.lang3.concurrent.BasicThreadFactory;

// 10 tasks allocating to 5 threads

public class ThreadPoolChat
{
    public static void main(String[] args)
    {
        ExecutorService executor = Executors.newFixedThreadPool(5);//creating a pool of 5 threads

        String poruka = "";

        for (int i = 0; i < 10; i++) //10 tasks
        {
            if (i==0) {
                poruka = "Marija: Cao";
                //Runnable worker = new ThreadPoolUser(poruka);

            } else if (i==1) {
                //System.out.println("User1: Sta ima");
                poruka = "Ana: Sta ima";
                //Runnable worker = new ThreadPoolUser(poruka);
            }
            else if (i==2) {
                //System.out.println("User1: Kako ide ");
                poruka = "Jovan: Kako ide";
                //Runnable worker = new ThreadPoolUser(poruka);
            }
            else if (i==3) {
                //System.out.println("User1: Drago mi je ");
                poruka = "Lazar: Danas radim niti";
                ///Runnable worker = new ThreadPoolUser(poruka);
            }
            else if (i==4) {
                //System.out.println("User1: Drago mi je ");
                poruka = "Milica: Da li neko zna razliku izmedju procesa i niti";
                ///Runnable worker = new ThreadPoolUser(poruka);
            }
            else if (i==5) {
                //System.out.println("User1: Drago mi je ");
                poruka = "Stefan: znam ja";
                ///Runnable worker = new ThreadPoolUser(poruka);
            }
            else if (i==6) {
                //System.out.println("User1: Drago mi je ");
                poruka = "Uros: koja je razlika";
                ///Runnable worker = new ThreadPoolUser(poruka);
            }
            else if (i==7) {
                //System.out.println("User1: Drago mi je ");
                poruka = "Dusan: proces je program u izvrsavanju";
                ///Runnable worker = new ThreadPoolUser(poruka);
            }
            else if (i==8) {
                //System.out.println("User1: Drago mi je ");
                poruka = "Milos: nit je jedinica izvrsavanja procesa";
                ///Runnable worker = new ThreadPoolUser(poruka);
            }
            else if (i==9) {
                //System.out.println("User1: Drago mi je ");
                poruka = "Marija: proces moze da ima vise niti ";
                ///Runnable worker = new ThreadPoolUser(poruka);
            }

            Runnable worker = new ThreadPoolUser(poruka);
            SingletonUser singletonUser = new SingletonUser();

           /* ThreadFactory namedThreadFactory =
                    new ThreadFactoryBuilder().setNameFormat("my-sad-thread-%d").build()*/

            //Runnable worker = new ThreadPoolUser(i);
            executor.execute(worker);//calling execute method of ExecutorService - allocating task to thread pool with execute method




        }

        //shutdown will stop the program until all the threads have completed their task - nece doci do toga da se program(proces)
        //-Process finished with exit code 0- zavrsi pre nego sto svaka nit zavrsi svoj zadatak

        executor.shutdown();//shutdown() will not allow allocating new tasks to threads but will wait till the completion of all allocated tasks

        while (!executor.isTerminated()) { }

        System.out.println("Finished all threads");
    }
}