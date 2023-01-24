import lombok.Synchronized;

public class CH_Thread_First {

    public static void main(String[] args) {
        System.out.println("Hello From Main thread. ");

        CH_Thread_Second secondThread = new CH_Thread_Second();
        secondThread.setName(" Second_Thread Name Change ");
        secondThread.start();

        Thread myRunnableThread = new Thread(new MyRunnable(){
            @Override
            public void run() {

                System.out.println( ThreadColor.ANSI_RED + "Hello from My Anonymous  Class. ");
                try{
                    secondThread.join();
                    System.out.println(ThreadColor.ANSI_CYAN  + " myRunnableThread terminated  ");
                }catch (InterruptedException e){
                    System.out.println(ThreadColor.ANSI_GREEN + " I could not run, I was interrupted ");
                }

                System.out.println( ThreadColor.ANSI_RED + " After running secondThread Hello from My Anonymous  Class. ");
            }
        });
        myRunnableThread.start();

        Thread runnableThread = new Thread(new MyRunnable());
        runnableThread.start();
        runnableThread.interrupt();
    }
}


class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println( ThreadColor.ANSI_PURPLE + "Hello from My Runnable Class. ");

        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            System.out.println(" Thread get InterruptedException ");
        }

        System.out.println( ThreadColor.ANSI_PURPLE + " After 3 second  ");
    }

}


 class ThreadColor {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
     public static final String ANSI_YELLOW = "\u001B[165m";
}