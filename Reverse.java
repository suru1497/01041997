import java.util.*;
class Reverse{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		String n=s.nextLine();
        String reverse = "";
     for(int i = n.length() - 1; i >= 0; i--)
        {
            reverse = reverse + n.charAt(i);
        }
		System.out.print(reverse);
	}
	}
