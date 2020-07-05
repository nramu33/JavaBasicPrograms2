
public class MaximumTwoValuesInAnArray {
	
	
	static public void getTwoMaximumValues(int arr[]){
		int temp=0;
		int n=arr.length;
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(arr[i]>arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
	
		}
		System.out.print("Print the elements in an Descending Order:");
		for(int i=0;i<n;i++){
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("Top Two maximum values in an Array are :"+ arr[0]+","+arr[1]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int[] arr={4,56,75,1,8,65};
	
	getTwoMaximumValues(arr);
	}

}
