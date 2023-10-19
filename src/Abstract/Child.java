package Abstract;

public class Child extends parent {

	public void M1() {
		System.out.println("I am M1 method from Parent.");
	}
	
	public void M2() {
		System.out.println("I am M2 method from Parent.");
	}
	
	public static void main(String[] args) {
         Child call=new Child();
         call.M1();
         call.M2();
         call.M3();
	}

}
