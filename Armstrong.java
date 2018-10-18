import java.util.*;
class Armstrong{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int num,total=0;
		int temp,digit=0;
		num = n;
		
        while (num != 0)
        {
            temp = num % 10;
            total = total + temp*temp*temp;
            num /= 10;
        }

        if(total == n)
			System.out.print("yes");
		else
			System.out.print("no");
	}
}
