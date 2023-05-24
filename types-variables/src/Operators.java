public class Operators {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10;
        int b = 5;
        int sum = a + b; // Addition
        int difference = a - b; // Subtraction
        int product = a * b; // Multiplication
        int quotient = a / b; // Division
        int remainder = a % b; // Modulo
        a++; // Increment
        b--; // Decrement

        System.out.println("Arithmetic Operators:");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
        System.out.println("Incremented a: " + a);
        System.out.println("Decremented b: " + b);

        // Assignment Operators
        int x = 20;
        x += 5; // Addition assignment
        x -= 3; // Subtraction assignment
        x *= 2; // Multiplication assignment
        x /= 4; // Division assignment
        x %= 7; // Modulo assignment

        System.out.println("\nAssignment Operators:");
        System.out.println("x after addition assignment: " + x);
        
        // Comparison Operators
        int num1 = 10;
        int num2 = 20;
        boolean isEqual = num1 == num2; // Equal to
        boolean isNotEqual = num1 != num2; // Not equal to
        boolean isGreater = num1 > num2; // Greater than
        boolean isLess = num1 < num2; // Less than
        boolean isGreaterOrEqual = num1 >= num2; // Greater than or equal to
        boolean isLessOrEqual = num1 <= num2; // Less than or equal to

        System.out.println("\nComparison Operators:");
        System.out.println("isEqual: " + isEqual);
        System.out.println("isNotEqual: " + isNotEqual);
        System.out.println("isGreater: " + isGreater);
        System.out.println("isLess: " + isLess);
        System.out.println("isGreaterOrEqual: " + isGreaterOrEqual);
        System.out.println("isLessOrEqual: " + isLessOrEqual);

        // Logical Operators
        boolean condition1 = true;
        boolean condition2 = false;
        boolean logicalAnd = condition1 && condition2; // Logical AND
        boolean logicalOr = condition1 || condition2; // Logical OR
        boolean logicalNot = !condition1; // Logical NOT

        System.out.println("\nLogical Operators:");
        System.out.println("logicalAnd: " + logicalAnd);
        System.out.println("logicalOr: " + logicalOr);
        System.out.println("logicalNot: " + logicalNot);

        // Bitwise Operators
        int num3 = 5;
        int num4 = 3;
        int bitwiseAnd = num3 & num4; // Bitwise AND
        int bitwiseOr = num3 | num4; // Bitwise OR
        int bitwiseXor = num3 ^ num4; // Bitwise XOR
        int bitwiseComplement = ~num3; // Bitwise complement
        int leftShift = num3 << 2; // Left shift
        int rightShift = num3 >> 1; // Right shift
        int unsignedRightShift = num3 >>> 1; // Unsigned right shift


        /* Resumed
        * there are 5 types of operators in java
        * 1) Arithmetic - used for basic math
        * 2) Assignment - for using the variable itself to do the math
        * 3) Comparison - to compare 
        * 4) Logical - can be used in "if" expressions
        * 5) Bitwise - do a comparison in bit by bit


        */
    }
}
