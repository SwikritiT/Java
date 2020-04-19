import java.awt.*;
import java.net.*;
import java.awt.event.*;
class AddMulDemo implements ActionListener
{
	Frame f=new Frame();
	Label firstn,secondn,result;
	TextField fn,sn,rs;
	Button addition,mul,cancel;

	
    public AddMulDemo()
	{
		f.setVisible(true);//to make frame visible as it is invisible by default
		f.setSize(200,300);
		f.setBackground(Color.gray); 
		f.setTitle("Login");
		f.setLayout(new GridLayout(5,5));
		
		
		 firstn= new Label("First Num:");
		 secondn= new Label("Second Num:");
		 result= new Label("Result:");
		 fn=new TextField(30);
	     sn=new TextField(30);
		 rs=new TextField(30);
		 addition= new Button("ADD");
		 mul= new Button("MUL");
		 cancel= new Button("CANCEL");
		
		f.add(firstn);
		
		f.add(fn);
	
		f.add(secondn);
		
		f.add(sn);
		
		f.add(result);
		
		f.add(rs);
		
		f.add(addition);
	
		f.add(mul);
	
		f.add(cancel);
        addition.addActionListener(this);
        cancel.addActionListener(this);


	    addWindowListener( new WindowAdapter()
        {
           public void windowClosing(WindowEvent we)
            {
               System.exit(0);
            }
       });
	

	}

       public void actionPerformed(ActionEvent ae)
        {
           float a,b,c;
          if(ae.getSource()==addition)
            {
               a=Float.parseFloat(fn.getText().trim());
               b=Float.parseFloat(sn.getText().trim());
               c=a+b;
               rs.setText(Float.toString(c));
            }
         else
          {
            fn.setText(null);
            sn.setText(null);
            rs.setText(null);
          }
       }
       public static void main(String[] args)
	   {
	 	    AddMulDemo am=new AddMulDemo();
		

	   }
    

    
}
 

 



		


		/*addition.addActionListener(new ActionListener(){
               public void actionPerformed(ActionEvent e) 
               { 
                    int a = Integer.parseInt(fristn.getText());
                    int b = Integer.parseInt(secondn.getText()); 
                    int c = a + b; 
                    l1.setText("Their sum is = " + String.valueOf(c)); 
                  }
                } );*/
             

		
		

		
		
	
		
		

	
