import java.awt.*;
class Checkboxgroupdemo{
	public static void main(String[] args)
	{
	Frame f= new Frame();
		f.setVisible(true);
		f.setSize(700,700);
		f.setBackground(Color.cyan);
		f.setForeground(Color.red);
		f.setTitle("checkbox....");
		f.setLayout(new GridLayout(10,10));

		
		CheckboxGroup cb=new CheckboxGroup();
		Label gender= new Label("gender");
		Checkbox male= new Checkbox("male",cb,false);
		Checkbox female = new Checkbox (" female",cb,false);
		Checkbox other = new Checkbox(" other ",cb,true);

		 f.add(gender );
		 f.add(male);
		 f.add(female);
		 f.add(other );
  }
	}

