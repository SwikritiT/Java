class Outer
{
	int outer_x=100;
	int outer_y=200;
	void test()
	{
		Inner inner=new Inner();//outer class can make object of inner class
		inner.display();
	}
	class Inner{
			void display()
			{
				System.out.println("display:outer="+outer_x);//inner class can access the member of outer class 
			}
	}	
}
class InnerclassDemo
{
	public static void main(String[] args)
	{
		Outer outer=new Outer();
		outer.test();

	}
}