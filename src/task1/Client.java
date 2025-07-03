package task1;


import java.io.*;
import java.net.*;
import java.util.Scanner;
public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("192.168.1.88", 1234);

            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a string to send to the server: ");
            String message = scanner.nextLine();
            out.writeUTF(message);

            
            String response = in.readUTF();
            System.out.println("Server response: " + response);

            scanner.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
