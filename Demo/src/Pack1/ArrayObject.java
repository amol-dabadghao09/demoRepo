package Pack1;

class student 
{
	int rollno;
	String name;
	int marks;
}

public class ArrayObject {
	
	public static void main(String[] args) {
		
	student s1 = new student();
	s1.rollno = 1;
	s1.name = "Amol";
	s1.marks = 81;
	
	student s2 = new student();
	s2.rollno = 2;
	s2.name = "Sapana";
	s2.marks = 91;
	
	student s3 = new student();
	s3.rollno = 3;
	s3.name = "Anvi";
	s3.marks = 99;
	
	student stud[] = new student[3];
	stud[0] = s1;
	stud[1] = s2;
	stud[2] = s3;
	
	for(student std : stud)
	{
		System.out.println(std.name + " : " + std.marks);
	}
	
		
//		for (int i=0; i<studs.length; i++)
//		{
//			System.out.println(studs[i].name + " : " + studs[i].marks);
//		}
		
		
		
	}

}
