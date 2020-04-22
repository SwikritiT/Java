import java.awt.*;
class Dialogdemo{
	public static void main(String[] args)
	{
	Frame f= new Frame();
		f.setVisible(true);
		f.setSize(700,700);
		f.setBackground(Color.cyan);
		f.setForeground(Color.red);
		f.setTitle("checkbox....");
		f.setLayout(new GridLayout(10,10));

		Label dialogbox=new Label(" dialogbox");
		Dialog dg=new Dialog(f,"Spoiler alert",true);
		dg.show();
		 
  }
	}