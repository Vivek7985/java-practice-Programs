package ExceptionHandeling2;

		class TestFinallyBlock {    
			  
			public static void main(String args[]){    
			  
		    //Case 1: When an exception does not occur
				
				
			try{    
			
			//below code do not throw any exception  
			   int data=25/5;    
			   System.out.println(data);    
			  }    
			
		    //catch won't be executed  
			catch(NullPointerException e){  
			System.out.println(e);  
			}    
			
				//executed regardless of exception occurred or not  
		   finally {  
			System.out.println("finally block is always executed");  
			}    
			    
			System.out.println("rest of phe code...");    
	}    
			  
}


