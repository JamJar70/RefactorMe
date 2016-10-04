package Refactor;
import java.util.Scanner;

public class Refactor {

    public static void main(String[] args) {
        getName();
        calculateSalary(2500, 400);
        calculateSides("circle");
        countLetters();
    }

    public static void getName(){
        String name = "Jayden";
        System.out.println("Your name is: " + name);
    }

    public static void calculateSalary(int income, int tax) {
        // Salary = income - tax
        int salary = income - tax;
        System.out.println("Your Salary is: " + salary);
    }

    public static void calculateSides(String shape) {
        // this method should detect for
        // 1 square
        // 2 circle
        // 3 hexagon
        // 4 dodecagon

        if (shape.contains("square")) {
            System.out.println("Your shape has 4 sides");
            if (shape.contains("Circle")) {
                System.out.println("Your shape has 0 sides");
                if (shape.contains("Hexagon")) {
                    System.out.println("Your shape has 6 sides");
                    if (shape.contains("Dodecagon")) {
                        System.out.println("Your shape has 12 sides");
                    }
                }
            }
        }
    }

    public static void countLetters() {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a word");
        String wor = sc.nextLine();


        //String word = 
        System.out.println("You entered: " + wor );

        System.out.println("You word is: " + wor.length() + "letters long.");
    }

}