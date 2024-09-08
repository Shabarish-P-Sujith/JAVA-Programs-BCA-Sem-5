import java.awt.*;     
import java.awt.event.WindowEvent;    
import java.awt.event.WindowListener;
import java.awt.event.*; 
import java.util.*;

class Country {
    public int isd;
    public String cname;              
}

class CountryAWT extends Frame implements ActionListener,WindowListener {  
    Button b1,b2,b3,b4;
    TextField t1,t2;
    TextArea ta; 
    Label l1,l2,l3;
    HashMap<Integer,String> hm = new HashMap<Integer,String>();
    static int i=0;
    Country c1[];

    CountryAWT() {  
        c1=new Country[100];
        this.setFont(new Font("Verdana", Font.PLAIN, 20));
        l1=new Label("Enter ISD code");  
        l2=new Label("Counry Name");  
        l3=new Label("");
        b1=new Button("Add");  
        b1.setBounds(30,100,80,30);// setting button position  
        b2=new Button("Show");
        b2.setBounds(120,100,80,30);
        b3=new Button("Remove");  
        b3.setBounds(30,150,80,30);// setting button position
        b4=new Button("Search");
        b4.setBounds(120,150,80,30);
        t1=new TextField();
        t1.setBounds(50,50,80,30);
        t2=new TextField();
        t2.setBounds(150,50,80,30);
        ta=new TextArea();
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);//adding button into frame  
        add(b2);
        add(b3);//adding button into frame  
        add(b4);
        add(ta);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        addWindowListener(this);
        setSize(300,300);//frame size 300 width and 300 height  
        setLayout(new GridLayout(5,2));
        setVisible(true);//now frame will be visible, by default not visible  
    }  


    public void actionPerformed(ActionEvent e) {
        String bname=e.getActionCommand();
        if(bname.equals("Add")) {
            c1[i]=new Country();
            c1[i].isd=Integer.parseInt(t1.getText());
            c1[i].cname=t2.getText();

            hm.put(c1[i].isd,c1[i].cname);

            t1.setText("");        
            t2.setText("");
            i++;
        } 
        else {
           if(bname.equals("Show")) {
            StringBuffer sb=new StringBuffer("ISD\tCountry Name");
            for(Map.Entry<Integer,String> en : hm.entrySet()) {
                sb.append("\n"+en.getKey()+"\t"+en.getValue());  
            }

            ta.setText(sb.toString());
            ta.append("\nTotal Record :"+i);

            } else { 
                if(bname.equals("Remove")) {
                   Integer id =Integer.parseInt(t1.getText());
                // String sd=t2.getText();
                    hm.remove(id);
                    ta.setText("Removed Contry "+id);    
                    i--; 
                } else {
                    if(bname.equals("Search")) {
                        Integer id =Integer.parseInt(t1.getText());
                //    String sd=t2.getText();
                        if(hm.containsKey(id)) {
                            ta.setText("Present Contry "+id+" is "+hm.get(id));   
                        } else {
                            ta.setText("No country "+id);
                        }
                        
                    //    if(hm.containsValue(sd))
                    //    {
                    //        ta.setText("Present Contry "+sd);   
                    //    } 
                    }
                }
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
    
    public static void main(String args[]) {  
        new CountryAWT();  
    }
}  