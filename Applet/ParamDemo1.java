import java.applet.*;
import java.awt.*;
public class Test extends Applet 
{
	String firstName,lastName;

	public void start()
	{
		String param;

		param = getParameter("firstName");

		if(param!=null){
			firstName = param;
		}
		else {
			firstName = "nothing";
		}

		param = getParameter("lastName");

		if(param!=null){
			lastName = param;
		}
		else {
			lastName = "nothing";
		}
	}

	public void paint(Graphics g)
	{
		g.drawString("firstName "+firstName,0,30);
		g.drawString("lastName "+lastName,0,60);
	}
}