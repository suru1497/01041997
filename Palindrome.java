import java.util.*;
class Palindrome{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int temp,r;
        int sum=0;		
		int n=s.nextInt();		
		temp=n;
		if (n>1000){
			System.out.println("Out of the Range");
		}
		else{
			while(n>0){    
                r=n%10;  //getting remainder  
				sum=(sum*10)+r;    
				n=n/10;    
					  }
		
		
			
    if(temp==sum)  
		System.out.println("yes");
	else
		System.out.println("no");
		    }
		}
	}
