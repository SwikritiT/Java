package graphics;
import java.awt.*;
import java.awt.event.*;
public class PaintDemo extends Frame
{
	private String ms;
	public PaintDemo()
	{
		super("Hello world program");
		ms="Hello world";
	}
	public void paint(Graphics g)
	{
		g.drawString(ms,50,50);
	}	
	 public static void main(String[] args) {
	 	PaintDemo hw=new PaintDemo();
	 	hw.setSize(200,150);
	 	hw.setVisible(true);
	 	hw.addWindowListener(new WindowAdapter()
	 	{
	 		public void windowClosing(WindowEvent e)
	 		{
	 			System.exit(0);//for closable frame
	 		}
	 	});
		
	}
}
