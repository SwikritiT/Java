import java.net.*;
import java.io.*;
public class Ipaddressdemo1{
	public static void main(String[] msg) throws IOException
	{
		String host=msg[0];
		try{
		InetAddress inetaddress=InetAddress.getByName(host);
		System.out.println("host name:"+inetaddress.getHostName());
		}
		catch(UnknownHostException e)
		{
		 System.out.println("host not found");
		}
	}
} 