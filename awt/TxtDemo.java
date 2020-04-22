import java.awt.*;

 class TxtDemo
{
  public static void main(String[] args)
  { 

        Frame f= new Frame();
		f.setVisible(true);
		f.setSize(700,700);
		f.setBackground(Color.cyan);
		f.setForeground(Color.red);
		f.setTitle("Labels....");
		f.setLayout(new GridLayout(5,1));


		Label username=new Label("Username:  ");
		TextField uname= new TextField(30);
		Label college=new Label("College:   " );
		TextField coll=new TextField("GCES");
		Label password=new Label("Password:  ");
		TextField pass=new TextField(30);
		Button btn= new Button("LOGIN");

		
		

		


		 f.add(username);
		 f.add(uname);
		 f.add(password);
		 f.add(pass);
		 f.add(college);
		 f.add(coll);
		 f.add("center",btn);

		
  }
}