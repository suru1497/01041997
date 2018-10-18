import java.util.*;
class Facto{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
    if(n>0){
		int f=1;
		for(int i=n;i>0;i--){
			f=f*i;
		}
		System.out.print(f);
   }
   else
   System.out.print(1);
	}
	}
