//Esli Quest Esabu 
//24019733
//Question 3
import java.util.Scanner;

public class Question3 {
    public static void main (String [] args){

        try(Scanner sc = new Scanner(System.in)){

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.println("Enter age: ");
        int age = sc.nextInt();

        System.out.println("Hello " + name + "! In five years you will be " + (age + 5) + "years old." );

        sc.close();
        }

    }
    
}
