import java.util.Scanner;

public class ReversalAlgorithmForArrayElements {
	
	static void leftRotate(int ar[],int d){
		int n=ar.length;
		reverseArray(ar,0,d-1);
		reverseArray(ar,d,n-1);
		reverseArray(ar, 0, n-1);
	}
	static void reverseArray(int ar[],int start, int end){
		int temp;
		while(start<end){
			temp=ar[start];
			ar[start]=ar[end];
			ar[end]=temp;
			start++;
			end--;
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto generated method stub
		System.out.println("Enter the number of elements to be rotate");
		Scanner sc=new Scanner(System.in);
		int d=sc.nextInt();
		 int ar[]={1,2,3,4,5,6,7};
		 int n=ar.length;
		 leftRotate(ar, d);
	
		for(int i=0;i<n;i++){
			System.out.println(ar[i]);
		}
	}

}
