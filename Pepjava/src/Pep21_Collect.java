import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
	class Student
	{
		private String name;
		private String dept;
		private int roll;
		private int sid;
		public Student(int sid,String name,String dept,int roll)
		{
			super();
			this.sid=sid;
			this.name=name;
			this.dept=dept;
			this.roll=roll;
		}
		
		public String getName() {
			return name;
		}

		public String getDept() {
			return dept;
		}

		public int getRoll() {
			return roll;
		}

		public int getSid() {
			return sid;
		}

		public String toString()
		{
			return sid+"\t"+name+"\t"+dept+"\t"+roll;
		}
		
	}
public class Pep21_Collect {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter id:");
		int id=sc.nextInt();
		List<Student> li=new ArrayList<Student>();
		li.add(new Student(101,"A","MCA",12));
		li.add(new Student(102,"B","BCA",16));
		li.add(new Student(103,"C","PGDCA",18));
		li.add(new Student(104,"D","DCA",11));
		li.add(new Student(101,"A","MCA",12));
		li.add(new Student(102,"B","BCA",16));
		li.add(new Student(103,"C","PGDCA",18));
		li.add(new Student(104,"D","DCA",11));
		
		for(Student l:li)
		{
			if(l.getSid()==id)
			System.out.println(l);
		}
	}
}