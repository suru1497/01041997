import java.util.*; 
import java.util.Comparator;
import java.io.*;

class Student { 
	public String name; 
	public double cgpa;
	public int token;
	public Student(String name, double cgpa,int token) {
		this.name = name; 
		this.cgpa = cgpa; 
		this.token =token;
	} 
	
	public String getName() { 
		return name; 
	}
	public double getCgpa()
    {
        return cgpa;
    }

    public int getToken() {
        return token;
    }
} 

class StudentComparator implements Comparator<Student>{ 
			public int compare(Student s1, Student s2) { 
				if (s1.cgpa < s2.cgpa) 
					return 1; 
				else if (s1.cgpa > s2.cgpa) 
					return -1; 
			    else{
                if(!(s1.getName().compareTo(s2.getName())==0)) {
                    return s1.getName().compareTo(s2.getName());
                }
                else
                {
                    if(s1.getToken()<s2.getToken())
                        return 1;
                    else if(s1.getToken()>s2.getToken())
                        return -1;
                    else
                        return 0;
        } 
				} 
			}
		} 



public class InternShala { 
	public static void main(String[] args) throws IOException { 
		//Scanner in = new Scanner(System.in);
		PriorityQueue<Student> pq = new PriorityQueue<Student>(new StudentComparator());
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int t = Integer.parseInt(br.readLine());
            while(t>0){
				String str=br.readLine();
				if(str.charAt(0)=='E')
            {
                String[] values = str.split(" ");
                pq.add(new Student(values[1],Double.parseDouble(values[2]),Integer.parseInt(values[3])));
            }
            else if(pq.peek()!=null)
                pq.poll();
			
				t--;
						}
        if(pq.peek()!=null) {
            while (!pq.isEmpty()) 
				System.out.println(pq.poll().getName()); 
        }
        else
            System.out.println("EMPTY");
	}
}
