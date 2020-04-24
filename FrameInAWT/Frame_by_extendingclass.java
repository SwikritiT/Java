import java.awt.*;
class Frame_by_extendingclass extends Frame{
  Frame_by_extendingclass(){
  setVisible(true);
  setSize(200,300);
  setBackground(Color.red);
  //setLayout(new ());
  }
  public static void main(String[] args){
  Frame_by_extendingclass fc=new Frame_by_extendingclass();
  Label username= new Label("username"); //creating
  Label password= new Label("password");
  fc.add(username);
  fc.add(password);                       //displaying
  TextField uname=new TextField(30); 
  TextField pword=new TextField(20);
  fc.add(uname);
  fc.add(pword);
  Button btn=new Button("login");
  fc.add(btn);
  }
	
}