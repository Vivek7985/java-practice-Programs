package METHOD;

public class signature {

	public void method(float v)//in this line method(float v)is method signature.
	{
		System.out.println(v);
	}
	
	public static void main(String[] args) {
     
		signature call=new signature();
		
		call.method('S');//Declare in single apostrophe.
	}

}
