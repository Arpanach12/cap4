package output;

class StudentNew
{
private int rollNumber;
private String name;
StudentNew()
{
System.out.println("Default Constructor");
rollNumber=0;
name="";

}
StudentNew(int rollNumber,String name)
{
System.out.println("OverLoaded Constructor");
this.rollNumber=rollNumber;	//this operator is used to refer to the calling object
this.name=name;
}
void disp()
{
System.out.println("rollNumber ="+rollNumber);
System.out.println("name ="+name);
}
public static void main(String arg[])
{
StudentNew s2=new StudentNew();
StudentNew s1=new StudentNew(101,"Jack");
s1.disp();
s2.disp();
}
}