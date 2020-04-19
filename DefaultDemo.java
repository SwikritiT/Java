 interface MyIF{
	int getNumber();
	default String  getString(){
	return "Default String";
	}
}
class MyIFImp implements MyIF{
	public int getNumber(){
	return 100;
	}
}
 class DefaultDemo{
 public static void main(String[] args){
  MyIFImp obj=new MyIFImp();
  System.out.println(obj.getNumber());
  System.out.println(obj.getString());

    }
 }

class MyIfImp implements MyIf{
	public int getNumber(){
	return 100;
	}
	public String getString (){
	return "this is different string";
	}
}