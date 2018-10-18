import java.util.*;
class Power{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);	
		int result=1;
		int n=s.nextInt();
		int e=s.nextInt();
		 while (e!= 0)
        {
            result *= n;
            --e;
        }
		System.out.println(result);
	}
}
		
