import java.awt.*;
import java.awt.event.*;

 class MyButton  implements ActionListener
{
	       	 Frame f= new Frame();
  public static void main(String[] args)
  { 
        
        	
        MyButton mb =new MyButton();
  
  }
        

        
       public MyButton()

       {


		f.setVisible(true);
		f.setSize(700,700);
		f.setBackground(Color.cyan);
		f.setForeground(Color.red);
		f.setTitle("Labels....");
		f.setLayout(new GridLayout(10,10));

		
		
		Button btn = new Button( "Click me!" );
		f.add(btn);
		btn.addActionListener(this);



       } 
     
		public void actionPerformed( ActionEvent evt)
		{
			Dialog dg= new Dialog(f,"Spoiler Alert!",true);
			dg.setSize(200, 100);
		   dg.add(new Label("Everyone dies"));
		

		   dg.show();
		   f.add(dg);
		 
        }
    

    


}