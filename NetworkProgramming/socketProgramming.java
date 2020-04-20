 import java.io.*;
import java.net.*;

public class socketProgramming {
	public static void main(String argv[]) throws Exception
	{
		String clientData;
		String processedData;
		System.out.println("enter data:");
		//create input stream
		BufferedReader inFromUser= new BufferedReader(new InputStreamReader(System.in));
		//create client socket
		Socket clientSocket=new Socket("127.0.0.1",2222);
		//create output stream attached to the stream
		DataOutputStream outToServer=new DataOutputStream(clientSocket.getOutputStream());
		//create input Stream attached to the socket
		BufferedReader inFromServer= new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		
		clientData =inFromUser.readLine();
		
		//send to server
		outToServer.writeBytes(clientData+'\n');
		
		//read the response from server
		processedData= inFromServer.readLine();
		
		//display server response
		System.out.println("SERVER:"+processedData);
		clientSocket.close();
		
		
	}
}
