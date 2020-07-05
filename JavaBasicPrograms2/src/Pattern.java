import java.util.Scanner;

public class Pattern {
	/*
	 Print as below for range 4
	 	*
		**
		***
		****
		*****
	 */
	
	public static void main(String[] args) 
	{
		int i,j,k=1;
		System.out.println("Enter the range: ");
		Scanner s= new Scanner(System.in);
		int r=s.nextInt();

		for(i=0; i<=r; i++)
		{
			for(j=0; j<k; j++)
			{
				System.out.print("*");
			}
			k=k+1;
			System.out.println();
		}
	}
	
}
