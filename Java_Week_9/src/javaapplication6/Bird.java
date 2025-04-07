/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication6;

/**
 *
 * @author mertguney
 */


public class Bird {
    int age;
    String BirdBreed;
    
    public Bird(int _age, String _birdBreed){
        age = _age;
        BirdBreed = _birdBreed;
    }
    
    public static void main(String[] args){
        Bird myBird = new Bird(10, "Weero");
        
        System.out.println(myBird.age + " " + myBird.BirdBreed);
       
    }
    
}
