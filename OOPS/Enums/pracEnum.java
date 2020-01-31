
public class PracEnum {

	public static void main(String[] args) {
		for (cricketteam myVar : cricketteam.values()) {
			  System.out.println(myVar + " comes at  " +myVar.getDescp() + " and Order No is " + myVar.getOrderNo());
			}
	}

}
