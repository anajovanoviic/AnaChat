

class User2 extends Thread
{



    public void run () {
        for (int i=1; i<=4; i++) {

            if (i==1) {
                System.out.println("User2: Cao");
            } else if (i==2) {
                System.out.println("User2: Nista");
            }
            else if (i==3) {
                System.out.println("User2: Dobro");
            }
            else if (i==4) {
                System.out.println("User2: Cao");
            }


            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }

        }
    }
}

