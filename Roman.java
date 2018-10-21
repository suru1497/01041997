import java.util.*; 
  
class Solution 
{ 
     static int value(char r) 
    { 
        if (r == 'I') 
            return 1; 
        if (r == 'V') 
            return 5; 
        if (r == 'X') 
            return 10; 
        if (r == 'L') 
            return 50; 
        if (r == 'C') 
            return 100; 
        if (r == 'D') 
            return 500; 
        if (r == 'M') 
            return 1000; 
        return -1; 
    } 
     static int romanToDecimal(String str) 
    {  
        int re = 0; 
  
        for (int i=0; i<str.length(); i++) 
        { 
            
            int s1 = value(str.charAt(i)); 
  
            
            if (i+1 <str.length()) 
            { 
                int s2 = value(str.charAt(i+1)); 
                if (s1 >= s2) 
                { 
                    
                    re = re + s1; 
                } 
                else
                { 
                    re = re + s2 - s1; 
                    i++; 
				}
            } 
            else
            { 
                re = re + s1; 
                i++; 
            } 
        } 
  
        return re; 
    } 
  
    
    public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		System.out.println(romanToDecimal(str));
	}
}
  
