package Student;
import java.util.*;
public class Demo {
static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		Student s1 = new Student(100,"Rakesh",false);
		if(s1.isSecondChance())		//checking wheather the student has applied for second chance
			s1.identifyMarks(85,95);
		else
			s1.identifyMarks(70);
		
		show(s1);
		
		Student s2 = new Student(101,"Ramesh",true);
		if(s2.isSecondChance())
			s2.identifyMarks(85,95);
		else
			s2.identifyMarks(70);
		
		show(s2);
	}
	private static void show(Student s1) {
		System.out.println("Details of Student "+s1.getStudentName()+" : ");
		System.out.println("Student ID : "+s1.getStudentID());
		System.out.println("Student marks : "+s1.getMarks());
		System.out.println("Student second chance : "+s1.isSecondChance());
		
	}

}
