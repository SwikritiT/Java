import java.net.*;
import java.io.*;
public class URLConectionReader{
	public static void main(String[] args) throws IOException
	{
		try{
			URL url=new URL("https://pu.edu.np/");
		URLConnection uc= url.openConnection();
		BufferedReader br=new BufferedReader(new InputStreamReader(uc.getInputStream()));
		String line;
		while((line=br.readLine())!=null)
		{
			System.out.println(line);
		}
		br.close();

		}
		catch(Exception e)
		{
			System.out.println("Error");
		}
	}
}