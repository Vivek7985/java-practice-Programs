package AutoboxingUnboxing;

public class unbox {

	public static void main(String[] args) {

		 // Autoboxing: Converting primitives to objects
        Integer intObj = 42;  // Autoboxing int to Integer
        Double doubleObj = 3.14;  // Autoboxing double to Double
        Character charObj = 'A';  // Autoboxing char to Character

        // Unboxing: Converting objects to primitives
        int intValue = intObj;  // Unboxing Integer to int
        double doubleValue = doubleObj;  // Unboxing Double to double
        char charValue = charObj;  // Unboxing Character to char

        System.out.println("Autoboxing and Unboxing Example:");
        System.out.println("Integer Object: " + intObj);
        System.out.println("Double Object: " + doubleObj);
        System.out.println("Character Object: " + charObj);

        System.out.println("Unboxing to primitives:");
        System.out.println("int: " + intValue);
        System.out.println("double: " + doubleValue);
        System.out.println("char: " + charValue);
	}

}
