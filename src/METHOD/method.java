package METHOD;

public class method {

	/* Access modifier ReturnType MethodName
	 {SOP};*/
	public void add() {
		System.out.println(10+20);
	}
	
	public void sub() {
		System.out.println(30-20);
	}
	
	public void mul() {
		System.out.println(20*35);
	}
	
	public void div() {
		System.out.println(55/5);
	}
	
	public static void main(String[] args) {
        //creating object to call method.
	    //class name (new object name)=new class name;
         method call= new method();		
		
         //calling method by object.
         //new object name.Method name
         call.add();
         call.sub();
         call.mul();
         call.div();
	}

}
