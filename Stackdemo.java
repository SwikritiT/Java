class Stack{
   private int top;
   private int item[];
   int x;
 public Stack(){
  top=-1;
  item=new int[10];
 }
 public void Push(int x)
{
 if (top==9){ 
		System.out.println("stack is full");
		} else {
		item[++top]=x;
		}
 }
public int Pop() {
 if (top<0) 
{
 System.out.println("stack is empty");
return 0;
 }
else{return item [top--];}
}
 }
class Stackdemo{
 public static void main( String[] args)
 {
  Stack stk= new Stack();
  for (int i=1; i<13; i++) {
	stk.Push(i);
	}
  for (int x=1; x<15; x++){
	 System.out.println(stk.Pop());
	}
  
   }
}
