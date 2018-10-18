import java.util.*;
class Fact{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int f=1;
		for(int i=n;i>0;i--){
			f=f*i;
		}
		System.out.print(f);
	}
	}
