package Variables;


public class InstanceVariable {
 
	//we create this variable outside main method inside class.
	int x=25;
	
	public void instance() {
		System.out.println();
	}
	
	public static void main(String[] args) {
        //to call instance variable.
		//1st we have to create object then call it.
		//Then we have to Syso that in main method as(object name.variable.)
		
		InstanceVariable call=new InstanceVariable();
		call.instance();
		
		System.out.println(call.x);//(object name.varible)
		
	}

}
