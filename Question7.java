//Esli Quest Esabu 
//24019733
//Question 7
import java.util.Scanner;

public class Question7{
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter temperature in Celsius: ");
        double celcius = sc.nextDouble();

        double fahrenheit = (celcius * 9/5) +32;

System.out.println( "celsius + degrees Celcius is "+ fahrenheit + " degrees Fahrenheit.");

        sc.close();
    }
}