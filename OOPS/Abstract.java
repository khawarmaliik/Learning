//abstract class
abstract class Animal{
	abstract void legs();
	void eats() {
		System.out.println("Some animlas eat Meat and some don't");
	}
}

class Dog extends Animal{
	int numOfLegs = 4;
	void legs(){
		System.out.println("Dog has " + numOfLegs+ " Legs");
	}
}

class Kangaroo extends Animal{
	int numOfLegs = 2;
	void legs(){
		System.out.println("Kangaroo has " + numOfLegs + " Legs");
	}
}

//main
public class Abstract {
	public static void main(String[] args) {
		Dog d=new Dog();
		Kangaroo k=new Kangaroo();
		d.legs();
		k.legs();
		k.eats();
		
	}
}
