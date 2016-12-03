
public class house {
	public int chair = 12;
	public String houseAdderess = "11445 STREET";
	public String houseName;
	
	public void sit(){
		System.out.println(chair);
	}

	
	public house(String houseName){
		this.houseName = houseName;
	}
	
	public void adderess()
	{
	System.out.println(houseAdderess);
	}
	
	public boolean added(int add1, int add2){
		int total = add1 / add2;	 
		if (total> 7)
		return true;
		else
		return false;
	}
	
}