import java.util.*;
class Hours{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int h,m;
		if(n>60){
			
			h=n/60;
			m=n%60;
		}
		else{
			h=0;
			m=n;
	    }
		System.out.print(h);
		System.out.print(" ");
		System.out.println(m);
	}
}
