import java.util.*;

class Mythread implements Runnable {
    Thread t;
    int i,no,sum;
    int a[]=new int[1000];
    Mythread(String s,int n) {
        Random rs = new Random();
        t=new Thread(this,s);
        no=n;
        int j=0;
        for(i=1;i<=1000;i++){
            a[j]=rs.nextInt()%100;
            j++;
        }
        t.start();
    }
    public void run() {
        for(i=0;i<100;i++) {
            sum=sum+a[no];
            no++;
        }
        System.out.println("Sum = "+sum);
        System.out.println("Avg = "+sum/100);
    }         
}
public class ThreadTen {
    public static void main(String[] arg) throws InterruptedException {
        Mythread t1 = new Mythread("g",1); t1.t.join();
        Mythread t2 = new Mythread("r",100); t2.t.join();
        Mythread t3 = new Mythread("s",200); t3.t.join();
        Mythread t4 = new Mythread("t",300); t4.t.join();
        Mythread t5 = new Mythread("p",400); t5.t.join();
        Mythread t6 = new Mythread("p",500); t5.t.join();
        Mythread t7 = new Mythread("p",600); t5.t.join();
        Mythread t8 = new Mythread("p",700); t5.t.join();
        Mythread t9 = new Mythread("p",800); t5.t.join();
        Mythread t10 = new Mythread("p",900); t5.t.join();
    }
}