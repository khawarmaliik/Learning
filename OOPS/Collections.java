import java.util.ArrayList;
import java.util.List;

class Person{
	String name;
	int age;
	
	Person(String name, int age){
		this.name =  name;
		this.age = age;
	}
}


public class Collections {
	public static void main(String[] args) 
	{
		Person p1 = new Person("Khawar", 12);
		Person p2 = new Person("Ali", 34);
		Person p3 = new Person("Usman", 54);
		//creating array list
		List<Person> myList=new ArrayList<Person>();  
		myList.add(p1);
		myList.add(p2);
		myList.add(p3);

		
		for (Person p : myList) {
			System.out.println("Person Name is: " + p.name);
			System.out.println("Person age is: " + p.age);
		}
		
		}
	}
