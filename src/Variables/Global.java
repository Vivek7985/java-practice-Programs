package Variables;

public class Global {

	//we have to declared global variable by static keyword.
	static int x=25;
	
	public void Globalvariable() {
		System.out.println();
	}
	
	public static void main(String[] args) {
     
		Global call=new Global();
		call.Globalvariable();
		System.out.println(x);//here we have to gave only variable name.
	}

}
