package ExceptionHandeling2;

public class trycatch {

	public static void main(String[] args) {

		String v="VIVEK";
		
		try {
			System.out.println(v.charAt(5));//There is no 5 no. index word out there.
		}
		
		catch(Exception e) {
			System.out.println("This is 4 letter word.");
		}
	}

}
