import java.util.Scanner;

public class Semiconductor_Challenge {

	public static void main(String[] args) {
		Scanner Semi=new Scanner(System.in);
		int counter=0;
		
		for(int i=0; i<2; i++) {
		String product_name;
		float length,width,area,peremeter,peri_area;
		
		System.out.println("Enter the name of the semiconductor product");
		product_name=Semi.next();
		
		System.out.println("Enter the Length of the "+product_name+" in mm");
	    length=Semi.nextInt();
	    System.out.println("Enter the width of the "+product_name+" in mm");
	    width=Semi.nextInt();
	    
	    area=length*width;
	    peremeter=2*(length*width);
	    peri_area=area/peremeter;
	    
		if((area>100) && (peremeter>40) )	
		{   
			System.out.println(product_name +" Dosen't meet the initial requirments");
			//Products[counter]=product_name ;
			counter++;
		}
		else
		{
	    
			System.out.println(product_name +"  is according to the standard");
		}
		
		
		// TODO Auto-generated method stub

	}
		System.out.println(counter+" products are rejected");
		

 }
}
