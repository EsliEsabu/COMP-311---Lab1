//Esli Quest Esabu 
//24019733
//Question 6

import java.util.Scanner;

public class Question6 {
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three scores:");
        
        double score1 = sc.nextDouble();
        double score2 = sc.nextDouble();
        double score3 = sc.nextDouble();

        double average = (score1 + score2 + score3) / 3;

        System.out.println("Average: " + average);
        sc.close();
    }
}
