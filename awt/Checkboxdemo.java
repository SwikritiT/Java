import java.awt.*;
class Checkboxdemo{
	public static void main(String[] args)
	{
	Frame f= new Frame();
		f.setVisible(true);
		f.setSize(700,700);
		f.setBackground(Color.cyan);
		f.setForeground(Color.red);
		f.setTitle("checkbox....");
		f.setLayout(new GridLayout(10,10));

		
		Label hobbies= new Label("hobbies");
		Checkbox dancing= new Checkbox(" dancing");
		Checkbox studying = new Checkbox (" studying ",true);
		Checkbox singing = new Checkbox(" singing ");

		 f.add(hobbies );
		 f.add(dancing);
		 f.add(studying);
		 f.add(singing );
  }
	}

