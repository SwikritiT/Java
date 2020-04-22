import java.applet.*;
import java.awt.*;
public class Grid extends Applet{
	Button b[];
	public void init(){
	 setLayout(new GridLayout(3,4));
	 for(int i=1;i<=12;i++)
	 {
	 b[i]=new Button("i");
	 add(b[i]);
	 }
	}
}