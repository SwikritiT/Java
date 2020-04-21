import java.awt.*;
import java.applet.*;
public class AppletSample extends Applet{
	String msg;
	public void init(){
    setBackground(Color.cyan);
    setForeground(Color.red);
	msg+="Inside init() method...";
	}
	public void start()
	{
	msg+="Inside start() method...";
	}
	public void paint(Graphics g){
	msg+="inside paint() method...";
	g.drawString(msg,10,30);
	}

}