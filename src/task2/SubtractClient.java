package task2;

import java.rmi.Naming;
import java.util.Scanner;

public class SubtractClient {
    public static void main(String[] args) {
        try {
            Subtract sub = (Subtract) Naming.lookup("rmi://192.168.1.67/SubtractService");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter first number: ");
            int a = scanner.nextInt();
            System.out.print("Enter second number: ");
            int b = scanner.nextInt();

            int result = sub.subtract(a, b);
            System.out.println("Result: " + result);
            scanner.close();
        } catch (Exception e) {
            System.out.println("Client Error: " + e);
        }
    }
}

