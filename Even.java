import java.util.*;
class Even{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int j;
		if (n%2==0)
			j=n+1;
		else
			j=n;
	for(int i=j;i<m;i++){
		if(i%2==0)
		System.out.print(i);
		System.out.print(" ");
			}
			
		
	}
}
