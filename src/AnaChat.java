
public class AnaChat {


    public static void main (String[] args) {



        User1 obj1 = new User1();
        User2 obj2 = new User2();



        obj1.start();

        try {
            Thread.sleep(10); //ovde se sleep prosledjuje main thread-u
        } catch (Exception e) {

        }
        obj2.start();



    }


}
