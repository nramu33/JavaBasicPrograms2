import java.util.Scanner;

public class RotationOfArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated methostub
		System.out.println("Enter the number of elements to be rotate");
		Scanner sc=new Scanner(System.in);
		int d=sc.nextInt();
		 int ar[]={1,2,3,4,5,6,7};
		 int n=ar.length;
		 
		for(int i=0;i<d;i++){
			int temp=ar[0];
			int j;
				for( j=0;j<n-1;j++){
				
			ar[j]=ar[j+1];
			
		}
				ar[j]=temp;
		}
		for(int k=0;k<n;k++){
			System.out.println(ar[k]);
		}
	}
	
	
	

}
