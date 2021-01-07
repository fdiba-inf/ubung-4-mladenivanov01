package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReversal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        char[] numbers = new char[count];

        System.out.println("Enter letter: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.next().charAt(0);
        }
        char[] numbers2= new char[count];
        for (int i=0; i < numbers2.length;i++){
          numbers2[i]= numbers[numbers.length -1 - i];
        }
        String numbers2AsString = Arrays.toString(numbers2);
        System.out.println("Reversed symbols: " + numbers2AsString);
        
    

    }

}