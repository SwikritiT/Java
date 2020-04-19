import java.awt.*;
import java.awt.event.*;

 
 public class eevent implements ActionListener
 {
	Frame f = new Frame();
	public static void main(String[] args){
		eevent a = new eevent();
	}

		
		public eevent(){
			f.setVisible(true);
		//f.setBackground(Color.green);
		f.setSize(300, 300);
		//f.setLayout(new GridLayout(300,300));
		f.setTitle("events and dialog");
		
		Button b1 = new Button("Click Me");
		f.add(b1);
		b1.addActionListener(this);
		
		}
	
	
		public void  actionPerformed(ActionEvent evt)
		{
		Dialog d1 = new Dialog(f, "Sucessfully Clicked", true);


		d1.setSize(200, 100);
		d1.add(new Label("Sucessfully Clicked"));
		
		d1.show();
		f.add(d1);
		
		}
		
		
		
 }
 
