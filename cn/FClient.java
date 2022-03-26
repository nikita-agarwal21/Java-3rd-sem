package cn;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class FClient {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception  {
		Socket sock = new Socket("127.0.0.1", 3002); // creating Socket on server port and first parameter represent ip address of server
		Scanner scanner=new Scanner(System.in);

		PrintWriter pwrite = new PrintWriter(sock.getOutputStream(), true);  //opening channel to write sending message on socket
		//BufferedReader receiveRead = new BufferedReader(new InputStreamReader(sock.getInputStream()));   // opening channel to read from socket

		InputStream is = sock.getInputStream();
	    byte[] contents = new byte[10000];
		
		
		System.out.println("Which file do you need?");   
		String fileName; 
		fileName = scanner.nextLine();
		
		System.out.println("Where do you want to store the file?");   
		String fileNameToStore; 
		fileNameToStore = scanner.nextLine();
		
		pwrite.println(fileName); // sending to server 
		
		FileOutputStream fos = new FileOutputStream(fileNameToStore);
	    BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int bytesRead = 0; 
        
        while((bytesRead=is.read(contents))!=-1)
            bos.write(contents, 0, bytesRead); 
        
        bos.flush(); 
        sock.close(); 
        
        System.out.println("File saved successfully!");
        bos.close();
 	}
}
	


