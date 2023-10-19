package switchcase;

public class CAR {

	public static void main(String[] args) {
         
		int PRICE=1000000;
		
		switch (PRICE) {
		case 500000:
			System.out.println("Regular Car");
			break;//we have to gave break for each case.
			
		case 1000000:
			System.out.println("Mini SUV");
			break;//we have to gave break for each case.
			
		case 1500000:
			System.out.println("Micro SUV");
			break;//we have to gave break for each case.
			
		case 2000000:
			System.out.println("SUV");
			break;//we have to gave break for each case.

		default:
			System.out.println("CONGRATS FOR YOUR CAR MAN");
			break;
		}
	}

}
