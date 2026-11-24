// 1. Write a Java program to take three numbers as command line arguments and
// print the maximum number.

public class P2_1{

	public static void main(String args[]){
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		int z = Integer.parseInt(args[2]);
		if (x>y){
			System.out.println("Large is = "+x);
		}
		else if (y>z)
		{
			System.out.println("Large is = "+y);
			
		}
		else{
			System.out.println("Large is = "+z);
		} 

		
	}
}