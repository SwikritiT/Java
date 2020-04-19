class C{
   String name;
   int age;
   C(){
        name= "noname";
        age=0;
     }
C(String s,int a){
        name= s;
        age=a;
   C(C I1)
{
  I1.name="Muna";
  I1.age=20;
}

  void display()
{
System.out.println("Name:"+name);
System.out.println("age:"+age);
}
   public static void main(String[] args)
   {
   C I1=new C();
   I1.display();
   C I2=new C(I1);
   I1.display();
    }

}