import java.util.*;
class Leap{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);	
		int year=s.nextInt();
		boolean flag = false;
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))

        {
            flag = true;
        }
        else 
        {
            flag = false;
        }
        if(flag)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
	}
    }
	
