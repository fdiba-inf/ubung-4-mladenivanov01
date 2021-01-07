package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOutput {


   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        int[] numbers = new int[count];
        char a=' '; 

        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        
            
        
        }
        for(int i=0;i<numbers.length;i++){
          for (int k=0; k<i;k++){
            System.out.print(a);
          }
          System.out.println(numbers[i]);
     }



   }
}