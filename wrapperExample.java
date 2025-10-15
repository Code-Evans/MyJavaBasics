public class WrapperExample {
    
    public static void main(String[] args) { 

        // Wrapper Classes in Java

        /**
         * Wrapper classes are objects that wrap primitive data types.
         * They allow primitives to be used in contexts that require objects
         * (e.g., Collections like ArrayList, or when using generics).
         * 
         * Each primitive type has a corresponding wrapper class:
         * byte -> Byte
         * short -> Short
         * int -> Integer
         * long -> Long
         * float -> Float
         * double -> Double
         * char -> Character
         * boolean -> Boolean
         * 
         * Wrapper classes can be null and provide useful methods for conversion and comparison.
         */

        // Primitive to Wrapper (Autoboxing)
        int numInt = 42;
        Integer wrappedInt = numInt; // Automatically converted to Integer object

        // Wrapper to Primitive (Unboxing)
        int unboxedInt = wrappedInt; // Automatically converted back to int

        // Wrapper class examples
        Byte numByte = 127;
        Short numShort = 32_767;
        Integer numInteger = 2_147_483_647;
        Long numLong = 9_223_372_036_854_775_807L;
        Float numFloat = 3.14F;
        Double numDouble = 3.141592653589793;
        Character letter = 'A';
        Boolean bool = Boolean.TRUE;

        // Useful Wrapper class methods
        System.out.println("Integer to String: " + numInteger.toString());
        System.out.println("String to Integer: " + Integer.parseInt("100"));
        System.out.println("Compare Integers: " + Integer.compare(10, 20));
        System.out.println("Character to Lowercase: " + Character.toLowerCase(letter));
        System.out.println("Boolean value: " + bool);

        // Nullability (Wrapper can be null, primitives cannot)
        Integer nullableInt = null;
        System.out.println("Nullable Integer: " + nullableInt);


    }
}
