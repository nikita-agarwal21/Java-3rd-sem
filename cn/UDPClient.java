package cn;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {
	
		   public static void main(String args[]) throws Exception
		   {
		      DatagramSocket clientSocket = new DatagramSocket();
		      InetAddress IPAddress = InetAddress.getByName("localhost");
		      
		      byte[] sendData = new byte[1024];
		      byte[] receiveData = new byte[1024];
		      
		      String sentence = "hi from client";
		      
		      sendData = sentence.getBytes();
		       
		      DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, 3003);
		      clientSocket.send(sendPacket);
		      
		      DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
		      clientSocket.receive(receivePacket);
		      
		      String fromUDPServer = new String(receivePacket.getData());
		      System.out.println("FROM SERVER:" + fromUDPServer);
		      
		      clientSocket.close();
		   }
}
