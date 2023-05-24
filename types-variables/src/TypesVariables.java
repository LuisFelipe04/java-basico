import java.util.Arrays;

public class TypesVariables {
    public static void main(String[] args) {
        // Primitive Types
        int age = 25; // An integer variable to store age
        double salary = 2500.50; // A floating-point variable to store salary
        boolean isStudent = true; // A boolean variable to store student status
        char grade = 'A'; // A character variable to store grade
        byte count = 100; // A byte variable to store count
        short population = 20000; // A short variable to store population
        long bigNumber = 1234567890L; // A long variable to store large numbers
        float pi = 3.14f; // A float variable to store decimal numbers
                    
        // Reference Types
        String name = "John Doe"; // A string variable to store name
        int[] numbers = {1, 2, 3, 4, 5}; // An array variable to store a collection of numbers

        // Outputting the values
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Is Student: " + isStudent);
        System.out.println("Grade: " + grade);
        System.out.println("Count: " + count);
        System.out.println("Population: " + population);
        System.out.println("Big Number: " + bigNumber);
        System.out.println("PI: " + pi);
        System.out.println("Name: " + name);
        System.out.println("Numbers: " + Arrays.toString(numbers));

        /*  Resume
         *  1) Primitive - the basic values of a variable, especified in the java api
         *  2) Reference - a way to making a reference to classes created in tme code       
        */
    }
}
