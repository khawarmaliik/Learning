//main app class
public class HelloWorld {

	//main function
	public static void main(String[] args) {
		System.out.println("This table is being printed by Table Class");
		
		Table tableObject = new Table();
		tableObject.printTable();
		
		System.out.println("");
		System.out.println("This table is being printed by Main Function");
		int a = 4, i=1 ;
		System.out.println("Value of a is " + a);
		for(i=1; i<=10 ; i++) {
			System.out.println( a + " x " + i + " = " + a*i);
			}
		System.out.println("");
		
		//bike class work here
		Bike bikeObj = new Bike();
		bikeObj.start();
		
		System.out.println("");
		
		//car class work here
		Car carObj = new Car();
		carObj.start();
		}
	}


//class to print table function
class Table {
int x=3 , i = 0;
void printTable() {
	for(i=1; i<=10 ; i++) {
		System.out.println( x+ " x " + i + " = " + x*i);
		}
	}
}


class Vehicle{
	void start() {};
}

class Bike extends Vehicle{
	int numOfTyres = 2;
	void start(){
		System.out.println("Bike has " + numOfTyres + " tyres and Starts with Kick");
	}
}

class Car extends Vehicle{
	int numOfTyres = 4;
	void start(){
		System.out.println("Car has " + numOfTyres + " tyres and Starts with Key");
	}
}
