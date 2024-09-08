import java.util.*;

class Mythread2 implements Runnable {
    Thread t;
    public Mythread2(String title) {
        t=new Thread(this,title);
        t.start();
    }
    public void run(){
        for(int i=0;i<50;i++) {
            System.out.println("Thread "+(i+1)+" : "+Thread.currentThread().getName());
            try{
                Thread.sleep(100);
            } catch(Exception e){
            
            }
        }
    }
}

public class ThreadHello {
    public static void main(String a []) {
        System.out.println("ThreadName : "+Thread.currentThread().getName());
        Mythread2 mt = new Mythread2("Hello Java");
    }
}   
