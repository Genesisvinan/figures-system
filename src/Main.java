import figures.Line;
import figures.Square;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int option = 0;
        Scanner scanner = new Scanner(System.in);
        Square square= new Square();
        do {
            System.out.println("---- Figures System ----");
            System.out.println("1. Create Square");
            System.out.println("2. Print Square");
            System.out.println("3. Exit");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Please enter line length: ");
                    int Length = scanner.nextInt();
                    square.setLength(Length);
                    break;
                case 2:
                    square.drawSquare();
                    break;
                case 3:
                    System.out.println("--------- Exiting System ---------");
                    break;
                default:
                    System.out.println("Please enter a valid option");
                    break;
            }
        }while(option != 3);
    }
}