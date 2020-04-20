import java.net.*;
import java.io.*;
public class Urldemo{
	public static void main(String[] args) throws IOException
	{
		URL url=new URL("https://gces.edu.np:80/tutorial/inyro.html?status=#DOWNLOADING");

		System.out.println("protocol is"+url.getProtocol());
		System.out.println("hostname is"+url.getHost());
		System.out.println("port number is"+url.getPort());
		System.out.println("file name is"+url.getFile());
		System.out.println("path is"+url.getPath());
		System.out.println(url.getQuery());
		System.out.println(url.getAuthority());
		System.out.println(url.getRef());
		System.out.println(url.getPort());


} 
}