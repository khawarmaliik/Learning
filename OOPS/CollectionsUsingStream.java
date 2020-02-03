import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class CollectionUsingStream {

	public static void main(String[] args) {
		List<Integer> myList=new ArrayList<>();  
		myList.add(4231);
		myList.add(32);
		myList.add(1);  
		myList.add(1023);
		myList.add(1102);

		myList.forEach(System.out::println);
		
		
		System.out.println("\nReverse Sorted using Collections");
		Collections.sort(myList);
		Collections.reverse(myList);
		myList.forEach(System.out::println);
		
		
		System.out.println();
		
		
		myList.remove(1);
		
		System.out.println("After Removing 1 index");
		
		System.out.println("\nSorted Elements");
		
		myList.stream().sorted().forEach( s -> System.out.println(s));

	}
