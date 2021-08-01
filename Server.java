package filetransferapp;

import java.io.*;
import java.net.*;

public class ServerSide{
    public static void main(String [] args) {
        try {
            //assigning the server socket to 9090, has to be a free port
            ServerSocket servSock = new ServerSocket(9090);
            boolean ended = false;
            while(!ended){

                System.out.println("Connecting Client");
                Socket clientSock = servSock.accept(); 
                System.out.println("Client Connected");
                //client thread creation and starting
                ClientThread clientThread = new ClientThread(clientSock;
                clientThread.start();
            }
            ss.close();
        } catch (Exception e) {
            System.out.println("Please make sure no other application is using port 9090");
        }
    }   
}