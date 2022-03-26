package cn;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPServer {
	   public static void main(String args[]) throws Exception
		      {
		         
			   			  DatagramSocket serverSocket = new DatagramSocket(3003);
		        	 	  byte[] receiveData = new byte[1024];
		        	 	  byte[] sendData = new byte[1024];	
		        	 	  Scanner scanner=new Scanner(System.in);
		        	 	  
		        	 	  System.out.println("Server Ready....");
		        	 	  
		        	 	  DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
		                  serverSocket.receive(receivePacket);
		                
		                  String sentence = new String( receivePacket.getData());
		                  System.out.println("RECEIVED: " + sentence);
		                  
		                  InetAddress IPAddress = receivePacket.getAddress();
		                  int port = receivePacket.getPort();
		                  
		                  //String capitalizedSentence = sentence.toUpperCase();
		                  String outToClient = scanner.nextLine();
		                  
		                  sendData = outToClient.getBytes();
		                  DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, port);
		                  
		                  serverSocket.send(sendPacket);
		                  serverSocket.close();
		                  scanner.close();
		          
		      }
		}

