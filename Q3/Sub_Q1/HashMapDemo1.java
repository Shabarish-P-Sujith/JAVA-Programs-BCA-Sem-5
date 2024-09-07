import java.util.*;

public class HashMapDemo1 {
	
	public static HashMap<Integer,String> sortByValue(HashMap<Integer,String> hm) {
		// Create a list from elements of HashMap
		List<Map.Entry<Integer,String>>list = 
			new LinkedList<Map.Entry<Integer, String>>(hm.entrySet());
		
		// Sort the list
		Collections.sort(list,new Comparator<Map.Entry<Integer,String>>() {
            @Override
			public int compare(Map.Entry<Integer,String>o1,Map.Entry<Integer,String>o2) {
				return(o1.getValue().compareTo(o2.getValue()));
			}
		}
	);

	// Put data from sorted list to
	HashMap<Integer,String>temp = new HashMap<>();
	for(Map.Entry<Integer,String>aa : list) {
		temp.put(aa.getKey(),aa.getValue());
	}
	return temp;
	}
	
	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<>();
		hm.put(105, "Red");
		hm.put(102, "Blue");
		hm.put(104, "Yellow");
		hm.put(101, "Green");
		
		System.out.println("Before sorting values are :-");
		
		for(Map.Entry<Integer,String> en : hm.entrySet()) {
			System.out.println("Key : "+en.getKey()+", Value : "+en.getValue());
		}System.out.println();
		
		System.out.println("After sorting values are:-");
		Map<Integer,String> hm1 = sortByValue(hm);
		for(Map.Entry<Integer,String> en : hm1.entrySet()) {
			System.out.println("Key : "+en.getKey()+", Value : "+en.getValue());
		}
	}
}