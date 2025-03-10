/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java_week_6;

/**
 *
 * @author mertguney
 */
public class Java_Week_6 {
    public static void main(String[] args) {
        String name = "Java Programming";
        System.out.println("Length of the text: " + name.length());
        System.out.println("Convert to lowercase: " + name.toLowerCase());
        System.out.println("Convert to uppercase: " + name.toUpperCase());
        System.out.println("Contains 'Java'?: " + name.contains("Java"));
        System.out.println("Starts with 'J'?: " + name.startsWith("J"));
        System.out.println("Ends with 'a'?: " + name.endsWith("a"));
        
        // Example 5
        /* Write Java code that uses the new String(char[]) structure to convert a char array to a 
           String and then prints the resulting String value to the screen.(The Letter is Java)
        */
        
        char[] charArray = {'A', 'B', 'C'}; 
        String charToString = new String(charArray);
        System.out.println(String.valueOf(charToString));
        
        
    }
    
}
