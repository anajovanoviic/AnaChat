import java.util.Scanner;

class User1 extends Thread
{

    private final Scanner scanner = new Scanner(System.in);



    public void run () {
        for (int i=1; i<=4; i++) {

            if (i==1) {
                System.out.println("User1: Cao");
            } else if (i==2) {
                System.out.println("User1: Sta ima");
            }
            else if (i==3) {
                System.out.println("User1: Kako ide ");
            }
            else if (i==4) {
                System.out.println("User1: Drago mi je ");
            }


            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
        }
    }
}