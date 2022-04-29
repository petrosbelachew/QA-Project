
public class OutputTest {

	public static void main(String[] Args)
	{
		int X=5,Y=10;
		System.out.printf("X= %d\n", X);
		System.out.println("Y= "+Y);
		X+=--X - ++Y;
		Y+=Y++ - X--;
	   System.out.printf("X= %d\n", X);
	   System.out.println("Y= "+Y);
	   
	   if((X<0)&&(Y<0))
	   {
		   System.out.print("Both are Negative numbers");
	   }
	   else if((X>0)&& (Y>0))
	   {
		   System.out.print("Both are positive numbers");
	   }
	   else 
	   {
		   System.out.print("Either of them is  positive number");
	   }
	}
}
