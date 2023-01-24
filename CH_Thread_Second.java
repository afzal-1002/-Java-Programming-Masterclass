public class CH_Thread_Second extends Thread {
    @Override
    public void run(){
        System.out.println("Hello from " + currentThread().getName() + " Thread. ");
    }


}

