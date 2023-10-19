package METHOD;

public class Method2 {

	public void add() {
		System.out.println(20+56);
	}
	
	public void div() {
		System.out.println(88/2);
	}
	
	public void sub() {
		System.out.println(70-2);
	}
	
	public void mul() {
		System.out.println(45*3);
	}
	
	public static void main(String[] args) {
     
		Method2 call=new Method2();
		
		call.add();
		call.div();
		call.sub();
		call.mul();
	
	}

}
