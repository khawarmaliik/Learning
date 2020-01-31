//package
package mypack;

class CheckGrade{
	char grade;
	
	void setGrade(char grade) {
		this.grade=grade;
	}
	
	char getGrade() {
		return grade;
	}
}

class Marks extends CheckGrade{
	void checkMarks() {
		if(grade=='A') {
			System.out.println("Your marks are between 80 to 100");
		}
		if(grade=='B') {
			System.out.println("Your marks are between 60 to 79");
		}
		if(grade=='C') {
			System.out.println("Your marks are between 59 to 40");
		}
		if(grade=='D') {
			System.out.println("Your marks are between 33 to 39");
		}
		if(grade=='F') {
			System.out.println("Your marks are less then 33 you're failed");
		}
	}
}

public class Package {

	public static void main(String[] args) {
		Marks g= new Marks();
		g.setGrade('F');
		System.out.println("Your grade is " + g.getGrade());
		g.checkMarks();

	}

}
