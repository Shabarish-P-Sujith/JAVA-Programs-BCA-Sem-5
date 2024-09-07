// import java.util.HashMap;
// import java.util.Map;
// import java.util.Scanner;
import java.util.*;

public class HashMapDemo3 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		HashMap<Integer,String> hm = new HashMap<>();
		hm.put(105, "India");
		hm.put(102, "America");
		hm.put(104, "Africa");
		hm.put(101, "Russia");
		
		for(Map.Entry<Integer,String> en : hm.entrySet()) {
			System.out.println("Key : "+en.getKey()+", Value : "+en.getValue());
		}System.out.println();
		
		System.out.print("Enter the Key to check the availability : ");
		int nKey = sc.nextInt();
        if(hm.containsKey(nKey)) {
			System.out.println("It is present");
        } else {
			System.out.println("It is not present");
        }
	}
}