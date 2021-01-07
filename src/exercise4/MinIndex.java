package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class MinIndex {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        double [] numbers = new double[count];

         
        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextDouble();
        }
        int min=0;
      double minel=numbers[0];
       for ( int index=1 ; index<numbers.length ; index++){
         if (minel>numbers[index]){
           minel=numbers[index];
           min = index;
         }
        
  
       }

      
      


      
        System.out.println("Min index: " + min);
    }
}