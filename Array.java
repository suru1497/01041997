import java.util.*;
class Array{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);	
		int n=s.nextInt();
		int k=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		int sum=0;
		for(int j=0;j<k;j++)
		{
			sum+=a[j];
		}
			System.out.println(sum);
	}
}
			
