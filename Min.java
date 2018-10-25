import java.util.*;
class Min{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		int min=arr[0];
		for(int j=1;j<n;j++)
		{
			if(arr[j]<min)
				min=arr[j];
		}
		System.out.println(min);
	}
}
