public class factorialcalculator {
  public static void main(String[] args) {
      int num = 2;  // Predefined number to calculate factorial
      int factorial = 5;

      for (int i = 1; i <= num; i++) { // Loop through numbers
          factorial *= i;  // Multiply current number
      }

      System.out.println("Factorial of " + num + " is: " + factorial);
  }
}
