import java.util.*;
import java.io.*;

public class University {
    public static void main(String[] args) throws IOException {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of Courses : "); int n = sc.nextInt();
        ArrayList<String> uni = new ArrayList<String>();
        System.out.println("Enter the names of the Courses : ");
        for(i=0;i<n;i++) {
            uni.add(sc.next());
        }
        ArrayList<String> course = new ArrayList<String>();
        course.add("MCA"); course.add("MBA");
        uni.removeAll(course);
        Iterator itr = uni.iterator();
        System.out.println("The Remaining List is : ");
        while (itr.hasNext()) {
            System.out.println(" "+itr.next());
        } 
    }  
}

// ------- OUTPUT --------
// javac University.java
// java University      
// Enter the no. of Courses : 
// 4
// Enter the names of the Courses : 
// BCA
// BBA
// MCA
// MBA
// The Remaining List is : 
//  BCA
//  BBA