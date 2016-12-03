package MyHome;

public class House {

	public static void main(String[] args) {
		
		Kitchen kit=new Kitchen(9);
		kit.state();
	    System.out.print(kit.FloorNumber());
		Bathroom bat=new Bathroom(8);
		System.out.println(bat.FloorNumber());
		
		LivingRoom liv=new LivingRoom (7);
		System.out.println(liv.FloorNumber());
		}

	}


