// Modify the above to create MyThread class by implementing Runnable interface and observe the behavior of threads.

public class prg2 {
    public static void main(String[] args) {
     // TODO Auto-generated method stub
     System.out.println("Thread name="+Thread.currentThread().getName());
     Thread t1=new Thread(new MyRThread());
     t1.setName("Thread 1");
     t1.start();
     Thread t2=new Thread(new MyRThread()); 
     t2.setName("Thread 2");
     t2.start();
     }
    }
    class MyRThread implements Runnable
    {
    public void run() {
     System.out.println("Thread name="+Thread.currentThread().getName());
     }
    } 