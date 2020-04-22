import java.awt.*;
class Menudemo{
	public static void main(String[] args)
	{
	Frame f= new Frame();
		f.setVisible(true);
		f.setSize(700,700);
		f.setBackground(Color.cyan);
		f.setForeground(Color.red);
		f.setTitle("checkbox....");
		f.setLayout(new GridLayout(10,10));

		
		Label Item= new Label("Item");
		MenuBar mb=new MenuBar();
		f.setMenuBar(mb);
		Menu mn=new Menu("food item");
		MenuItem m1=new MenuItem("momo");
		MenuItem m2=new MenuItem("chowmein");
 		
		mb.add(mn);
		mn.add(m1);
		mn.add(m2);
		//f.add(");
		//f.add();
		
  }
	}