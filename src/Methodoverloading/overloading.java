package Methodoverloading;

public class overloading {

	public void add() {
		System.out.println("This is no argument Method");
	}
	
	public void add(int x) //All this is Argument method bcoz we have put data in parenthesis like parameterized method. 
	{
		System.out.println(x);
	}
	
    public void add(int x,int y) //Argument method
    {
		System.out.println(x+y);
	}
    
    public void add(double x) //Argument method
    {
		System.out.println(x);
	}
	public void add(String v) //Argument method
	{
		System.out.println(v);
	}
	
	public static void main(String[] args) {
          
		overloading call=new overloading();
		call.add();
		call.add(20);
		call.add(30,20);
		call.add(30.40);
		call.add("VIVEK");
		call.add('V','s');//here automation promotion takes place bcoz integer is converted in string.
	    call.add(25L);//convert int into long. 
	    call.add(35F);//convert int into Float
	}

}
