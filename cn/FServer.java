package cn;
import java.io.*;
import java.net.*;


public class FServer {
	
public static void main(String[] args) throws Exception {
		
		while(true) {
			
			ServerSocket sersock = new ServerSocket(3002);    //this is server port number
			System.out.println("Server ready to serve files....");

			Socket sock = sersock.accept( );                           // waiting for client to connect
			
			BufferedReader receiveRead = new BufferedReader(new InputStreamReader(sock.getInputStream()));  // opening channel to read from socket
			
			String receiveMessage;  
			
			if((receiveMessage = receiveRead.readLine()) != null)  { //receive from client 
					System.out.println(receiveMessage);  
					
					 File file = new File(receiveMessage);
				     FileInputStream fis = new FileInputStream(file);
				     BufferedInputStream bis = new BufferedInputStream(fis); 
				          
				     //Get socket's output stream
				     OutputStream os = sock.getOutputStream();
				                
				     //Read File Contents into contents array 
				     byte[] contents;
				     long fileLength = file.length(); 
				     long current = 0;
				     
				     //long start = System.nanoTime();
				     while(current!=fileLength){ 
				            int size = 10000;
				            if(fileLength - current >= size)
				                current += size;    
				            else{ 
				                size = (int)(fileLength - current); 
				                current = fileLength;
				            } 
				            contents = new byte[size]; 
				            bis.read(contents, 0, size); 
				            os.write(contents);
				            System.out.print("Sending file ... "+(current*100)/fileLength+"% complete!");
				        }
				        os.flush(); 
				        //File transfer done. Close the socket connection!
				        
				        System.out.println("File sent succesfully!");
				        bis.close();
					
			}   
			sock.close();
	        sersock.close();			
			
		}               
	
		
	}		
}
