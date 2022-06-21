

// 10 tasks allocating to 5 threads


class ThreadPoolUser implements Runnable
{
    private String num;
    public ThreadPoolUser(String j)
    {
        this.num=j;
    }


    public void run() //in this method is a task allocated to the thread
    {

        System.out.println(Thread.currentThread().getName()+" (Start) " + " " + num);

        //delay
        try {Thread.sleep(2000);} catch(Exception e) { }


        System.out.println(Thread.currentThread().getName()+" (End)");

    }


}