package Yorick.Laros;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;


public class MessageController {

    public void handler(int port){

        try{
            DatagramSocket socket = new DatagramSocket(port);

            while (true){
                byte[] buffer = new byte[50];
                DatagramPacket packet = new DatagramPacket(buffer,buffer.length);
                socket.receive(packet);
                String message = new String(buffer).toLowerCase();
                System.out.println("receive from client" + message);

            }

        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
