package Wrapperclass;

public class DataTypeIntoWrapperClasses {

	public static void main(String[] args) {

        int i=20;
        
        //To convert primitive into object.
        Integer I=Integer.valueOf(i);
		
        //2nd Approach.
        Integer I1=Integer.valueOf(20);
        
        System.out.println(I);
        System.out.println(I1);
        
        char c='a';
        Character v=Character.valueOf(c);
        System.out.println(v);
        
        double d=55.5;
        Double s=Double.valueOf(d);
        System.out.println(s);
        
        boolean b=true;
        Boolean B=Boolean.valueOf(b);
        System.out.println(B);
        
        float f=5.5f;
        Float F=Float.valueOf(f);
        System.out.println(F);
	}

}
