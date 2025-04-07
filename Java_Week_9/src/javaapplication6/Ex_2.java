/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication6;

import java.util.Scanner;

/**
 *
 * @author mertguney
 */
class Dog {
String breed = "German Shepherd";
int age = 2;
String color = "Black";
}

class Bird {
String breed = "Weero";
int age = 4;
String color = "Grey";
}
public class Ex_2 {
     public static void main(String[] args){
Dog obj = new Dog();
Bird obj2 = new Bird();

Scanner myObj = new Scanner(System.in);
System.out.println("Choose Dog or Bird with a valid syntax");
String animal = myObj.nextLine();

if("Dog".equals(animal)){
System.out.println(obj.breed);
System.out.println(obj.age);
System.out.println(obj.color);
System.out.println("Sleeping");
}

if("Bird".equals(animal)){
System.out.println(obj2.breed);
System.out.println(obj2.age);
System.out.println(obj2.color);
System.out.println("Flying");
}

}
}

