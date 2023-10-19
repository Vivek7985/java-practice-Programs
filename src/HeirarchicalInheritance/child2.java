package HeirarchicalInheritance;


public class child2 extends child1{
   
	public void Train() {
		System.out.println("i am train from child2.");
	}
	
	public static void main(String[] args) {
           
		child2 call=new child2();
		call.Car();
		call.car2();
		call.Cycle();
		call.Train();
		
	}

}
