
public class Singleton {

    private static Singleton INSTANCE = null;


    private Singleton() {

    }


    public static Singleton getInstance() {

        //with this approach singleton is disturbed

       /* if (INSTANCE == null) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            INSTANCE = new Singleton();
        }

        return INSTANCE;*/


        if (INSTANCE == null) {


            synchronized (Singleton.class) {  //synchronized block instead of synchronize method
                if (INSTANCE == null) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new Singleton();
                }

            }
        }
        return INSTANCE;





    }



}
