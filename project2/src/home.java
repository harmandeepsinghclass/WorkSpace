
public class home {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		house h1 = new house("black");
		System.out.println(h1.houseName);
		h1.adderess();
		h1.sit();
		boolean total = h1.added(56545,5);
		System.out.println(total);
		
	}

}
