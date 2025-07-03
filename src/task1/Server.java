package task1;

import java.io.*;
import java.net.*;

public class Server {
    
    public static void main(String[] args) {
        

        try {
            ServerSocket serverSocket = new ServerSocket(1234);
            System.out.println("Server started...");

            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected...");

            DataInputStream in = new DataInputStream(clientSocket.getInputStream());
            DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream());

            String receivedString = in.readUTF();
            System.out.println("Received from client: " + receivedString);

            String upperCaseString = receivedString.toUpperCase();
            out.writeUTF(upperCaseString);

            clientSocket.close();
            serverSocket.close(); 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}