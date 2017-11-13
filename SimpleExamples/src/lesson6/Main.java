/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson6;

/**
 *
 * @author padou
 */
public class Main {
    
        public static void main(String[] args) {
            
            StringBuilder buffer = new StringBuilder("hel10lo10");
            char searchChar = 'l';
            System.out.println("\"" + buffer + "\" has its last \'" + searchChar + "\' in position " + FindLastChar.findLastChar(buffer, searchChar));
            
            System.out.println("Welcome to Factorial Calculator!");
            long num = Factorial.validLong();
            long result = Factorial.factorial(num);
            System.out.println(String.format("%d! = " + result, num));
            
            System.out.println("Welcome to Fibonacci Sequence Calculator!");
            num = Fibonacci.validLong();
            result = Fibonacci.fibonacci(num);
            System.out.println(String.format("F(%d) = " + result, num));
        }
}
