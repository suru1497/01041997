import java.util.*;
class Holiday{
	public static void main(String[] args){
		String a="Saturday";
		String b="Sunday";
		Scanner s=new Scanner(System.in);
		String str=s.next();
		//int a = Integer.parseInt(str);
		if((str.equals(a)) || (str.equals(b)))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
