//inheritance another example
class Teacher{
	private String designation;
	private String collegeName;
	
	//setters
	protected void setDesignation(String designation) {
	this.designation = designation;
   }
	
	protected void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
		}
	
	//getters
	public String getDesignation() {
		return designation;
		}
	protected String getCollegeName() {
		return collegeName;
		}
	
	//simple function
	void experience(){
		System.out.println("4 Years Experience as a Teacher ");
		}
	}

//main
public class Inheritance1 extends Teacher {
	public static void main(String[] args) {
		Teacher t1=new Teacher();
		t1.setDesignation("Teacher");
		t1.setCollegeName("Punjab College");
		System.out.println("Ali is a "+t1.getDesignation());
		System.out.println("Ali Teaches in English "+t1.getCollegeName());
		t1.experience();
	}
}
