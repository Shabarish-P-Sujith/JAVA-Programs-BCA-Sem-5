import java.util.HashMap;
import java.util.Map;

public class HashMapDemo2 {

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<>();
		System.out.println("Before replacing Red with Maroon :- ");
		hm.put(105, "Red");
		hm.put(102, "Blue");
		hm.put(104, "Yellow");
		hm.put(101, "Green");
		
		for(Map.Entry<Integer,String> en : hm.entrySet()) {
			System.out.println("Key : "+en.getKey()+", Value : "+en.getValue());
		}System.out.println();
		
		hm.replace(105, "Maroon");
		System.out.println("After replacing Red with Maroon :- ");
		for(Map.Entry<Integer,String> en : hm.entrySet()) {
			System.out.println("Key : "+en.getKey()+", Value : "+en.getValue());
		}
	}
}
