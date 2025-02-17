import java.util.Scanner;

public class Labwork {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();
        input.nextLine();

        System.out.print("Enter your gender: ");
        String gender = input.nextLine();

        System.out.print("Enter your surname: ");
        String surname = input.nextLine();


        System.out.println("\nUser Information:");
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}
