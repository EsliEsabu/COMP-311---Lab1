//Esli Quest Esabu 
//24019733
//Question 5

import java.util.Scanner;

public class Question5 {
    public static void main (String [] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter first number: ");
        double firstNumber = sc.nextDouble();

        System.out.println("Enter second number:");
        double secondNumber = sc.nextDouble();

        Double sum = firstNumber + secondNumber;
        Double difference = firstNumber - secondNumber;
        double product = firstNumber * secondNumber;
        double quotient = firstNumber / secondNumber;
         double remainder = firstNumber % secondNumber;


         System.out.println("Sum:" + sum);
         System.out.println("Differnce:" + difference);
         System.out.println("Product" + product);
         System.out.println("Quotient:" + quotient);
         System.out.println("Remainder:" + remainder);

         sc.close();

    }
}