import java.net.*;
import java.io.*;
public class Ipaddressdemo{
	public static void main(String[] msg) throws IOException
	{
		String host=msg[0];
		try{
		InetAddress ipaddress=InetAddress.getByName(host);
		System.out.println("IP Address:"+ipaddress.getHostAddress());
		}
		catch(UnknownHostException e)
		{
		 System.out.println("ip address not found for the given host");
		}
	}
} 