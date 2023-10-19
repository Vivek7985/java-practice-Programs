package Variables;

public class allvariables {
        
	     int y=22;//Instance variable.
static   int z=23;//global variable.

       public void All() {
	    System.out.println();
     }
				
	public static void main(String[] args) {

		int x=21;
		System.out.println(x);//calling local variable.
		
	allvariables call=new allvariables();
	call.All();
	
	System.out.println(call.y);//calling instance variable.
	System.out.println(z); //calling global variable.
	}

}
