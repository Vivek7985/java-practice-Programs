package Wrapperclass;

public class conversion {

	public static void main(String[] args) {
		

		//conversion string into integer.
		//ParseInt convert string into primitive.
		
		String date="30";
		
		int i=Integer.parseInt(date);
		System.out.println(i);
		
         //conversion string to double.
		double d=Double.parseDouble(date);
		System.out.println(d);
		
		String s="100";
		int il=Integer.parseInt(s);
		System.out.println(s);
		
		//conversion string to byte.
		byte b=Byte.parseByte(s);
		System.out.println(b);
	}
}
