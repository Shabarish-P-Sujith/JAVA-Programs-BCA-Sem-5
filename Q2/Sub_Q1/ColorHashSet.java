import java.util.*;

public class ColorHashSet {
	public static void main(String[] args) {
		HashSet<String> color=new HashSet<>();
		color.add("Pink");
		color.add("Red");
		color.add("Blue");
		color.add("Yellow");
		color.add("Green");

		System.out.println(color.add("Red"));
		
		Iterator<String> itr=color.iterator();
		while(itr.hasNext()){
			System.out.println(""+itr.next());
		}
	}
}
