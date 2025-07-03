package task2;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class SubtractServer {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099); 
            Subtract sub = new SubtractImpl();
            Naming.rebind("SubtractService", sub);
            System.out.println("Subtract Service is running...");
        } catch (Exception e) {
            System.out.println("Server Error: " + e);
        }
    }
}
