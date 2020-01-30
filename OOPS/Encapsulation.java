//encapsulation
class Members {
	//data members (hidden)
	private int id;
	
	//methods
	public void setId(int id1) {
		id = id1;
	}
	
	public int getId() {
		return id;
	}
}

class Encapsulation{
public static void main(String[] args) {
	Members m= new Members();
	m.setId(13);
	System.out.println("ID of Member is "+m.getId());
	}
}
