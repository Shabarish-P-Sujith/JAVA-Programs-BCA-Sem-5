import java.awt.*;
import java.applet.*;
/*
 <applet code= "CAR.java" height="600" width="600">
 </applet>
*/

public class Car extends java.applet.Applet implements Runnable {
    int aflag,x;
    Thread t;
    public void init() {
        t=new Thread(this); aflag=0;x=0;
        t.start();
    }
    public void run(){
        try {
            x+=5;
            t.sleep(200);
            repaint(); 
            run();
        } catch(Exception e) {}
    }

    public void paint(Graphics g) {
        g.drawLine(0,150,600,150);
        if (aflag==0) { 
            g.fillRect(x,100,20,20);
            g.fillRect(x+10,125,20,20);
            g.drawRect(x,100,20,20);
            g.drawRect(x+10,125,20,20);
            aflag=1;
        } else {
            g.fillRect(x,100,20,20);
            g.fillRect(x,125,20,20);
            g.drawRect(x,100,20,20);
            g.drawRect(x,125,20,20);
            aflag=0;
        }
    }
}