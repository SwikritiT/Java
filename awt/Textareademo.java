import java.awt.*;
class Textareademo{
	public static void main(String[] args)
	{
	Frame f= new Frame();
		f.setVisible(true);
		f.setSize(700,700);
		f.setBackground(Color.cyan);
		f.setForeground(Color.red);
		f.setTitle("checkbox....");
		f.setLayout(new GridLayout(10,10));

		
		Label Description = new Label("Description");
		TextArea description= new TextArea(10,30);
		 f.add(Description);
		 f.add(description);
		 description.setText("hello, I am Yamuna Adhikari");
		
  }
	}

