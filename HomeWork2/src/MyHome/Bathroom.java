package MyHome;

public class Bathroom extends Statement implements Floor {

	
	private final int BRFLOOR ; 
	
	public Bathroom (int x)
	{
	 BRFLOOR= x;
		
	}
	public int FloorNumber(){
		return BRFLOOR;
	}
	
	
	
	
	
}
