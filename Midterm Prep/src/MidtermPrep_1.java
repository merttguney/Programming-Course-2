
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mertguney
 */
public class MidtermPrep_1 {
    public static void main(String[] args){
        /*Scanner scanner = new Scanner(System.in);
        
        System.out.print("Lütfen adınızı giriniz: ");
        String name = scanner.nextLine();
        
        System.out.println("Adınız : " + name);
        
        scanner.close(); */
        
        
        //-------------------------------------------------
        
//        Scanner scanner = new Scanner(System.in);
//        
//        System.out.print("Lütfen bir sayı giriniz: ");
//        int number = scanner.nextInt();
//       
//        
//        if(number > 10){
//            System.out.print("Sayımız 10'dan büyük");
//        }
//        
//        else
//        {
//           System.out.print("Sayımız 10'dan küçük");
//        }
//        
//        scanner.close();



         //--------------------------------------------------
        Recursion obj = new Recursion();
        System.out.print(obj.func(5));

    }
}

class Recursion
{
    int func(int n) {
        if (n == 1) {
          return 1;
        }
        return n + func(n - 1);
        } 
    
}

