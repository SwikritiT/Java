//using interface to remove high coupling

class BaseballCoach{
	Fortune fortune;
	BaseballCoach(Fortune fortune)
	{
		this.fortune=fortune;
	}
	public void getFortune()
	{
		fortune.getMyFortune();
	}
}


interface Fortune{
	public void getMyFortune();
}




class HappyFortune implements Fortune{
	
	public void getMyFortune()
	{
	System.out.println("very good");
	}
}




class SadFortune implements Fortune{
	public void getMyFortune()
	{
	System.out.println("very unhappy");
	}







	
}
class usingInterface{
	public static void main(String[] args)
	{
	  HappyFortune hf=new HappyFortune();	
      BaseballCoach bc= new BaseballCoach(hf);

      bc.getFortune();
	}
}