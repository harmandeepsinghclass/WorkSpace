package MyHome;

public class LivingRoom extends Statement implements Floor{

	
	
	private final int LRFLOOR ; 
	
	public LivingRoom (int x)
	{
	 LRFLOOR= x;
		
	}
	public int FloorNumber(){
		return LRFLOOR;
	}
	
	
	
}
