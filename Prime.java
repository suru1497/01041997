import java.util.*;
class Prime{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int count=0;
		for(int i=2;i<n;i++){
			if(n%i==0)
				count+=1;
		}
		if (count>0)
			System.out.println("no");
		else
			System.out.println("yes");
	}
}
