package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class MaxElement {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        double [] numbers = new double[count];

         
        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextDouble();
        }
      double maxel=numbers[0];
       for ( int index=1 ; index<numbers.length ; index++){
         if (maxel<numbers[index]){
           maxel=numbers[index];
         }
       }
        
      


      
        System.out.println("Max number: " + maxel);
    }
}