package string;

public class str {

	public static void main(String[] args) {
     
		String s="Vivek sale";
		String s1="VIVEK SALE";
		
		System.out.println(s.length());//to measure total words in word.
	    System.out.println(s.charAt(7));//to print word at index 7 (here it include space also)
	    System.out.println(s.substring(4));//it will print after and at the letters from given index.
	    System.out.println(s.substring(1, 6));//here it will print from , to given index
	    
	    System.out.println(s.equals(s1));//boolean check for both methods and give result true , false.
	    System.out.println(s.equalsIgnoreCase(s1));//here it check only length of both string and ignore small/capital letters.
	    System.out.println(s.concat(" "+s1));//both print at a time.
	    System.out.println(s.indexOf("a"));//index value of a.
	   // System.out.println(s.);
	
	
	}

}
