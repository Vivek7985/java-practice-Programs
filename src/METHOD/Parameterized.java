package METHOD;

public class Parameterized {

	public void add(int x,int y) {
		System.out.println(x+y);
	}
	
	public void add(double x,double y) {
		System.out.println(x*y);
	}
	
	public void add(String x) {
		System.out.println("hello world");
	}
	
	public void add() {
		System.out.println("i am normal method.");
	}
	
	public static void main(String[] args) {
             
		Parameterized call=new Parameterized();
		
		call.add(56,75);
		call.add(23.75,97.50);
		call.add("x");
		call.add();
	}

}
