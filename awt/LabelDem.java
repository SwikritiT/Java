import java.awt.*;

 class LabelDem
{
  public static void main(String[] args)
  { 

        Frame f= new Frame();
		f.setVisible(true);
		f.setSize(700,700);
		f.setBackground(Color.cyan);
		f.setForeground(Color.red);
		f.setTitle("Labels....");
		f.setLayout(new GridLayout(10,10));

		
		Label leftlabel= new Label("This is Left Label", Label.LEFT);
		Label centerlabel= new Label(" This is center label",Label.CENTER);
		
		Label rightlabel= new Label("This is  right label", Label.RIGHT);

		 f.add("left", leftlabel );
		 f.add("center", centerlabel);
		
		 f.add("right", rightlabel );
  }
}