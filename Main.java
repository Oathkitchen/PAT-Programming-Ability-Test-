import java.util.*;

class Main 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		
		Student[] stu = new Student[number];
		for (int x = 0; x<number; x++)
		{
			stu[x] = new Student(in.next(), in.next(), in.nextInt());
		}
		Arrays.sort(stu);
		stu[number-1].getInfo();
		stu[0].getInfo();

	}
}
class Student implements Comparable<Student>
{
	private int grade;
	private String name;
	private String id;

	public Student(String name, String id, int grade)
	{
		this.name  = name;
		this.id    = id;
		this.grade = grade;
	}
	public void getInfo()
	{
		System.out.println(name + " " + id);
	}
	public int compareTo(Student other)
	{
		return Double.compare(grade, other.grade);
	}
}

