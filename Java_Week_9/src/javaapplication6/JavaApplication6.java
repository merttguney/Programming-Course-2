/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication6;

/**
 *
 * @author mertguney
 */
class Dog_2{
    String breed = "German Shepher";
    int age = 2;
    String color = "Black";
}
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dog_2 obj = new Dog_2();
        
        System.out.println("Before modfying: ");
        System.out.println(obj.breed);
        System.out.println(obj.age);
        System.out.println(obj.color);
        
        obj.breed = "Golden Retriever";
        obj.age = 10;
        obj.color = "Blue";
        
        System.out.println("After modyfing: " + "\n" + obj.breed + "\n" + obj.age + "\n" + obj.color);
        
              

    }
    
}
