//Esli Quest Esabu 
//24019733
//Question 4

import java.util.Scanner;

public class Question4 {
    public static void main (String [] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter whole number:");
        int wholeNumber = sc.nextInt();

        System.out.println("Enter  a decimal number:");
        double decimalNumber = sc.nextDouble();

    System.out.println("Enter one word: ");
    String word = sc.next();

    System.out.println("You have entered " + wholeNumber + "," + decimalNumber + ", and the word \"" + word + "\".");

        sc.close();

    }
    
}
