package MethodOverriding;

public class child extends overriding {

	public void Parent()//creating same method.
	{
		System.out.println("i am Otis from child class.");
	}
	
	public static void main(String[] args) {
        child call=new child();
        call.Parent();//here SOP was print from child means from 2nd method.
		              //called as method overriding.
	}

}
