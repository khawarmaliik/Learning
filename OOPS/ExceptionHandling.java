//exception handling
public class ExceptionHandling {
	public static void main(String[] args) {
		try {
			int a = 10;
			int b= 10/10;
			System.out.println("b = " + b);
		}
		catch(Exception e){
			System.out.println("Not a Valid Way");
		}
		finally{
			System.out.println("This is finally block it will always run");
		}
	}
}
