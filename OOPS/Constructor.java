//default constructor by compiler
class Test{
	int a;
}

//user derived constructor no argue
class Test1{
	int a=1;
	public Test1() {
		System.out.println("This is user defined constructor with no parametrs");
	}
}


class Test2{
	int a;
	public Test2(int b) {
		this.a = b;
		System.out.println("Value of a is "+ b);
	}
}



//main 
public class Constructor {
	public static void main(String[] args) {
		Test t= new Test();
		System.out.println("Default constructor value created by Compiler " + t.a);
		System.out.println("");
		Test1 t1= new Test1();
		System.out.println("Value of a is initialized by user by no arguements constructor is " + t1.a);
		System.out.println("");
		Test2 t2= new Test2(10);
		System.out.println("Value of a is initialized by user by parametrized constructor is " + t2.a);
	}
}
