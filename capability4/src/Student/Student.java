package Student;

public class Student {
	int studentID;
	String studentName;
	float marks;
	boolean secondChance;
	public int getStudentID() {
		return studentID;
	}
	Student() {
		
	}
	
	Student(int studentID,String studentName,boolean secondChance) {
		this.studentID = studentID;
		this.studentName=studentName;
		this.secondChance = secondChance;
	}
	
	void identifyMarks(float marks) {
		this.marks=marks;
	}
	
	void identifyMarks(float marks1,float marks2) {
		if(marks1>marks2)
			this.marks=marks1;
		else
			this.marks=marks2;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	public boolean isSecondChance() {
		return secondChance;
	}
	public void setSecondChance(boolean secondChance) {
		this.secondChance = secondChance;
	}
} 
