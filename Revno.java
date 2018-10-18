import java.util.*;
class Revno{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int rev=0,x;
		while(n!=0)
		{
			x=n%10;
	        rev=rev*10+x;
			n/=10;
	}
        
		System.out.print(rev);
		
	}
}
		
		
