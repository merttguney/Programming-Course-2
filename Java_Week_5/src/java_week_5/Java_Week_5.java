/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java_week_5;

import java.util.Scanner;

/**
 *
 * @author mertguney
 */
public class Java_Week_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Example 1 : Enter two numbers from the user.
           Select from user " +, -, / 
           Make calculations with switch-case according to the entered transaction
           If division (/) is selected, division by zero is checked. Write Java code that will give a warning 
           message if an invalid operation is entered.
        */
        

        /* Scanner scanner = new Scanner(System.in);

        
        System.out.print("Birinci sayıyı girin: ");
        double num1 = scanner.nextDouble();

        System.out.print("İkinci sayıyı girin: ");
        double num2 = scanner.nextDouble();

        
        System.out.print("İşlem seçin (+, -, /): ");
        char operator = scanner.next().charAt(0);

        double result;

        
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Sonuç: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Sonuç: " + result);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Hata: Sıfıra bölme yapılamaz!"); 
                } else {
                    result = num1 / num2;
                    System.out.println("Sonuç: " + result);
                }
                break;
            default:
                System.out.println("Geçersiz işlem girdiniz!");
        }

        scanner.close();
        */

        
        
        // Example 3 : Write a Java program that calculates the sum of the numbers from 1 to 10 using a while loop.
        
        int i = 1;
        
        int result = 0;
        
        while(i <= 10)
        {
            result += i;
            i++;
        }
        System.out.println(result);
        
        /* Example 4 : Write a Java program that demonstrares the use of various mathematicaş functions from the Math Class
           including absolute value, square root, exponentiation, maximum, minimum values, rounding and generating a random number.
        */
        
        System.out.println("Absolute value of -25.5: " + Math.abs(-25.5));
        System.out.println("Square root of 10: " + Math.sqrt(10));
        System.out.println("Power of 2^3: " + Math.pow(2, 3));
        System.out.println("Max of -25.5 and 8.7" + Math.max(-25.5, 8.7));
        System.out.println("Min of -25.5 and 8.7" + Math.min(-25.5, 8.7));
        System.out.println("Rounded value of 8.7" + Math.round(8.7));
        System.out.println("Random number (0-1) " + Math.random());
        
        
    }
 
}
