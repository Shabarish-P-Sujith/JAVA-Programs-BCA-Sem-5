import java.awt.*;     
import java.awt.event.WindowEvent;    
import java.awt.event.WindowListener;
import java.awt.event.*; 
import java.util.*;

class Emp {
    public int eid;
    public String ename,edept,emob;
    public double esal;
}

public class EmpAWT extends Frame implements ActionListener,WindowListener {  
    Button b1,b2;
    TextField t1,t2,t3,t4,t5;
    TextArea ta;
    Label l1,l2,l3,l4,l5,l6;
    ArrayList<Emp> al=new ArrayList<Emp>();
    Emp emp[];
   
    static int i=0;
    EmpAWT() {  
        emp=new Emp[100];
        this.setFont(new Font("Verdana", Font.PLAIN, 20));
        l1=new Label("Emp Id");  
        l2=new Label("Emp Name");  
        l3=new Label("Department");
        l4=new Label("Salary");
        l5=new Label("Mobile no");
        l6=new Label("");
        b1=new Button("Ok");  
        b1.setBounds(30,100,80,30);// setting button position 
        b2=new Button("Show");
        b2.setBounds(30,300,80,30);
        t1=new TextField();
        t1.setBounds(50,100,80,30);
        t2=new TextField();
        t2.setBounds(50,100,80,30);
        t3=new TextField();
        t3.setBounds(50,100,80,30);
        t4=new TextField();
        t4.setBounds(50,100,80,30);
        t5=new TextField();
        t5.setBounds(50,100,80,30);
        ta=new TextArea();
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(l4);
        add(t4);
        add(l5);
        add(t5);
        add(b1);//adding button into frame  
        add(b2);
        add(ta);
        addWindowListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        setSize(300,300);//frame size 300 width and 300 height  
        setLayout(new GridLayout(7,2));
        setVisible(true);//now frame will be visible, by default not visible  
    }  


    public void actionPerformed(ActionEvent e) {
        String bname=e.getActionCommand();
        if(bname.equals("Ok")) {
            emp[i]=new Emp();      
            emp[i].eid=Integer.parseInt(t1.getText());
            emp[i].ename=t2.getText();
            emp[i].edept=t3.getText();
            emp[i].esal=Double.parseDouble(t4.getText());
            emp[i].emob=t5.getText();
            al.add(emp[i]);
            i++;   
        } else { 
            if(bname.equals("Show")) { 
                StringBuffer sb=new StringBuffer("ID\tName\tDepartment\tSalary\t\tMobile no");
                Iterator<Emp> itr=al.iterator();
             
                while(itr.hasNext()) {
                    Emp t=itr.next();
                    sb.append("\n"+t.eid+"\t"+t.ename+"\t"+t.edept+"\t\t"+t.esal+"\t\t"+t.emob);
                }
                ta.setText(sb.toString());
            }
        }
    }


    public void windowActivated(WindowEvent e) {}    
    public void windowClosed(WindowEvent e) {}    
    public void windowClosing(WindowEvent e) {    
        System.exit(0);    
    }    
    public void windowDeactivated(WindowEvent e) {}    
    public void windowDeiconified(WindowEvent e) {}    
    public void windowIconified(WindowEvent e) {}    
    public void windowOpened(WindowEvent arg0) {}

    public static void main(String args[]){  
        EmpAWT f = new EmpAWT();  
    }

}