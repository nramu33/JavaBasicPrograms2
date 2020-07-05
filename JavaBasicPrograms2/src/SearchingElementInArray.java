import java.util.Scanner;

public class SearchingElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number to be searched");
		Scanner sc=new Scanner(System.in);
		int d=sc.nextInt();
		 int ar[]={1,2,3,4,5,6,7};
		 int n=ar.length;
		 int flag=0;
		 for(int i=0;i<n;i++){
			 if(ar[i]==d){
				 flag=1;
				 System.out.println(d+" is found at Index : "+i);
				 break;
			 }
			
		 }
		 if(flag==0){
			
				 System.out.println(d + " is not found");
			
		 }

	}

}
