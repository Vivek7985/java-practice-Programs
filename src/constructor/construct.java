package constructor;

public class construct {

	public void A()//This is no argument/parameterized constructor.
	{
		System.out.println("This is normal Method.");
	}
	
	public void A(int x,int y) //All this are argument/parameterized constructor.
	{
		System.out.println(x+y);
	}
	
	public void A(int x,int y,int z) 
	{
		System.out.println(x+y+z);
	}
	
	public void A(double x) 
	{
		System.out.println(x);
	}
	public static void main(String[] args) {

		construct call=new construct();
		
		call.A();
		call.A(20,30);
		call.A(30,40,95);
		call.A('m','n');//here automation promotion takes place and string converted to int and got addition takes place.
		call.A(30);//here also automation promotion takes place bcoz int converted to double.
	}

}
