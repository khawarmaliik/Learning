//for inheritance
class Birds{
	void fly() {
		System.out.println("Birds Fly");
	}
}

class Eagle extends Birds{
	void eats() {
		System.out.println("Eagle eats meat");
	}
}

public class Inheritance {
	public static void main(String[] args) {
	Eagle e= new Eagle();
	e.fly();
	e.eats();
	}
}
