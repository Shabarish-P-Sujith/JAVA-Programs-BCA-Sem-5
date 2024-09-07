import java.util.*;
import java.io.*;

class Emp {
    public int eid; public String ename;
    Scanner sc=new Scanner(System.in);    
    public void eaccept() throws IOException {
        System.out.print("Enter Employee Id : "); eid = sc.nextInt();
        System.out.print("Enter Employee Name : "); ename = sc.next();
        System.out.println();
     }                
}

public class VectorEmp {
    public static void main(String args[]) throws IOException {
        int i,n;
        Emp e[]=new Emp[10];
        Emp temp;
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the No. of Employees : "); n=sc.nextInt(); 
        System.out.println();  
        Vector<Emp> v = new Vector<Emp>();
        System.out.println("----- Accept Employee Details -----");
        System.out.println();
        for(i=0;i<n;i++) {
            e[i]=new Emp(); e[i].eaccept(); v.addElement(e[i]);
        }

        System.out.println("----- Display Employee Details -----");
        System.out.println();
        Enumeration<Emp> en = v.elements();
        while(en.hasMoreElements()) {
            temp=en.nextElement();
            System.out.println("Employee Id : " + temp.eid); 
            System.out.println("Employee Name : " + temp.ename); 
            System.out.println();
        }
        System.out.println("----- Search Employee Details -----");
        System.out.println();            
        System.out.print("Enter Employee ID to search :- "); int num = sc.nextInt();
        en=v.elements();
        System.out.println();
        while(en.hasMoreElements()) {
            temp=en.nextElement();
            if(temp.eid==num) {
                System.out.println("Employee Id : " + temp.eid); 
                System.out.println("Employee Name : " + temp.ename); 
                System.out.println();
            }     
        }
    }
}

// ----- OUTPUT -----
// javac VectorEmp.java

// F:\BCA - Semester 5 - Notes\Practical Lab\Java Practical\Q1\Sub_Q3>java VectorEmp
// Enter the No. of Employees : 3

// ----- Accept Employee Details -----

// Enter Employee ID : 101
// Enter Employee Name : ABC

// Enter Employee Id : 202
// Enter Employee Name : PQR

// Enter Employee Id : 303
// Enter Employee Name : XYZ

// ----- Display Employee Details -----

// Employee Id : 101
// Employee Name : ABC

// Employee Id : 202
// Employee Name : PQR

// Employee Id : 303
// Employee Name : XYZ

// ----- Search Employee Details -----

// Enter Employee ID to search :- 202

// Employee Id : 202
// Employee Name : PQR