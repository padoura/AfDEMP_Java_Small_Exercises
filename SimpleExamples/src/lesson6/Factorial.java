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
public class Factorial {
    
    
    public static long validLong() {
        System.out.println("Give a positive integer:");
        Scanner scanner = new Scanner(System.in);
        while(true){
            try{
                long num = scanner.nextLong();
                if (num > 20){
                    System.out.println("Result is bigger than " + Long.MAX_VALUE);
                    System.out.println("Give an integer smaller than 21:"); 
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

    public static long factorial(long num) {
        if (num < 2)
            return 1;
        else
            return factorial(num-1)*num;
    }
    
}
