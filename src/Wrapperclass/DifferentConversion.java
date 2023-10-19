package Wrapperclass;

public class DifferentConversion {

	public static void main(String[] args) {
 
		int i=30;
		
		//convert primitive to wrapper.
		Integer I=Integer.valueOf(i);
		System.out.println(I.intValue());
		
		//convert primitive to object.
		Character C=Character.valueOf('Z');
		System.out.println(C.charValue());
		
		//conversion primitive to non-integer.
		Double D=Double.valueOf(30.30);
		System.out.println(D.doubleValue());
	}

}
