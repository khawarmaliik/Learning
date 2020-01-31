
public enum cricketteam {
	Azhar("Opener",1),
	Babr("Opener",2),
	Haris("One Down",3),
	Misbah("Two Down",4),
	Asif("Three Down",5),
	Rizwan("Four Down",6),
	Amir("Five Down",7),
	HarisR("Six Down",8),
	Shadab("Seven Down",9),
	Shaheen("Eight Down",10),
	Musa("Nine Down",11);
	
	
	String descp;
	int orderNo;
	
	cricketteam(String descp, int orderNo){
		this.descp = descp;
		this.orderNo= orderNo;
	}
	
	public String getDescp() {
		return descp;
	}
	public int getOrderNo() {
		return orderNo;
	}
}
