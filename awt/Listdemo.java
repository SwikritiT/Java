import java.awt.*;
class Listdemo{
	public static void main(String[] args)
	{
	Frame f= new Frame();
		f.setVisible(true);
		f.setSize(700,700);
		f.setBackground(Color.cyan);
		f.setForeground(Color.red);
		f.setTitle("checkbox....");
		f.setLayout(new GridLayout(10,10));

		
		Label Nationality= new Label("Nationality");
		List nationality= new List(1,true);
		
		 f.add(Nationality );
		 f.add(nationality );
		 System.out.println(nationality.getSelectedIndex());
		 nationality.add("Nepali");
		 nationality.add("Indian");
		 nationality.add("Polish");
		 nationality.add("British");

		
  }
	}
