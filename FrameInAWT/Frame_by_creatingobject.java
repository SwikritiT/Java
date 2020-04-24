//there are two ways of creating frames in awt
//1st one is by creating object of the frame class i.e. Frame f=new Frame();
//2nd one is by extending our class to the Frame class

import java.awt.*;
class Framedemo{
	public static void main(String[] args){
	Frame f= new Frame();
	f.setVisible(true);
	f.setSize(200,300);//width and height
	f.setBackground(Color.yellow);
	f.setForeground(Color.pink);
	f.setTitle("frames title that comes in titlebar");
	f.setLayout(new Flowlayout());

	}
}