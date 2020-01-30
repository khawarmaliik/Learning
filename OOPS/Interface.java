//interface
interface Shape {
  public void drawShape();
}

//inherited classes
class Triangle implements Shape {
	public void drawShape() {
		System.out.println("Triangle has 3 sides");
	}
}

class Square implements Shape {
	public void drawShape() {
		System.out.println("Square has 4 sides");
	}
}

class Circle implements Shape {
	public void drawShape() {
		System.out.println("Circle is round");
	}
}

//main
public class Interface {
	public static void main(String[] args) {
		Triangle t= new Triangle();
		Square s= new Square();
		Circle c= new Circle();
		t.drawShape();
		s.drawShape();
		c.drawShape();
	}
}
