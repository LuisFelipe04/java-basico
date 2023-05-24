public class Conditional {
    
        public static void main(String[] args) {
            int number = 10;
    
            if (number > 0) {
                System.out.println("Number is positive"); // if its true this line is executed, if not ir passes to the second line
            } else if (number < 0) {
                System.out.println("Number is negative");
            } else {
                System.out.println("Number is zero");
            }
        }
    
    
}
