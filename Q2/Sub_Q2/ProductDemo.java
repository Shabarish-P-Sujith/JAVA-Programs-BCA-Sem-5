import java.util.*;

public class ProductDemo {
	public static void main(String[] args) {
		TreeSet<String> product=new TreeSet<String>();
		product.add("Laptop");
		product.add("Book");
		product.add("Mouse");
		product.add("Pencil");
		product.add("Keyboard");

		System.out.println("Product Names:-");
		Iterator<String> itr=product.iterator();
		while(itr.hasNext()){
			System.out.println(""+itr.next());
		}System.out.println();

		product.remove("Book");
		System.out.println("Product Removed.");
        System.out.println();

        System.out.println("Product Names:-");
        itr=product.iterator();
		while(itr.hasNext()){
			System.out.println(""+itr.next());
		}System.out.println();
        
        System.out.println("Head Set:"+product.headSet("Mouse",true));
		System.out.println("Tail Set:"+product.tailSet("Mouse",true));
		System.out.println("Sub Set:"+product.subSet("Book",true,"Pencil",true));
	}
}


