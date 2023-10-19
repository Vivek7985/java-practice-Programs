package Interface;

public class child implements parent //here we connect child to parent by implement keyword.
{

	public void v1 ()//in interface we have input data in child class rather than parent.
	{
		System.out.println("i am interface 1 from parent 1.");
	}
	
	public void v2 ()
	{
		System.out.println("i am interface 2 from parent.");
	}
	
	public static void main(String[] args) {

		child call=new child();
		
		call.v1();
		call.v2();
	
	
	}

}
