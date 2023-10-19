package HeirarchicalInheritance;


public class child1 extends Parent {

	public void Cycle() {
		System.out.println("i am Leader cycle from child1");
	}
	public static void main(String[] args) {
            child1 call=new child1();
            call.Car();
            call.car2();
            call.Cycle();
		
	}

}
