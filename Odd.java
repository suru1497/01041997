import java.util.*;
class Odd{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		for(int i=n;i<m;i++){
			if(i%2!=0)
			System.out.print(i);
			System.out.print(" ");
			
		}
	}
}
