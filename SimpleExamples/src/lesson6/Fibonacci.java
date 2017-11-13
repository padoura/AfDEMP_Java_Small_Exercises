/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson6;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author padou
 */
public class Fibonacci {
    
    
    public static long validLong() {
        System.out.println("Give a positive integer:");
        Scanner scanner = new Scanner(System.in);
        while(true){
            try{
                long num = scanner.nextLong();
                if (num > 49){
                    System.out.println("Calculating Fibonacci with a simple recursive algorithm is too slow for this value.");
                    System.out.println("Give an integer smaller than 50:"); 
                }
                else if (num >= 0)
                    return num;
                else
                   System.out.println("Give a positive integer:"); 
            }
            catch (InputMismatchException ime){
                System.out.println("Give a positive integer:");
                String newlineC = scanner.nextLine();
            }
        }
    }

    public static long fibonacci(long num) {
        if (num == 0)
            return 0;
        else if (num < 3)
            return 1;
        else
            return fibonacci(num-1)+fibonacci(num-2);
    }
    
}
