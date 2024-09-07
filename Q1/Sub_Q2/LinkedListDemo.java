import java.util.*;
import java.io.*;

public class LinkedListDemo {
    public static void main(String[] args) throws IOException{
        LinkedList<String> cust = new LinkedList<String>();    
        int i,n; String s1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of Courses : "); n = sc.nextInt();
        System.out.println("Enter the Names of the Courses : ");
        for(i=0;i<n;i++) {
            cust.add(sc.next());
        }
        System.out.println("Enter the Element at First Position : "); 
        s1 = sc.next(); cust.add(0,s1);
        System.out.println("Updated Courses : " + cust); 
        n = cust.size();
        System.out.println("Size of Courses : "+ n);
        System.out.println("Delete the Last Element from the List :- "); 
        cust.remove(n-1); 
        System.out.println("Updated Courses : " + cust);
        n = cust.size();
        System.out.println("Size of the Course is "+ n);
    }    
}

// ----- OUTPUT -----
// javac LinkedListDemo.java
// java LinkedListDemo
// Enter the no. of Courses : 3
// Enter the Names of the Courses :
// BCA
// BBA
// MBA
// Enter the Element at First Position :
// MCA
// Updated Courses : [MCA, BCA, BBA, MBA]
// Size of Courses : 4
// Delete the Last Element from the List :-
// Updated Courses : [MCA, BCA, BBA]
// Size of the Course is 3