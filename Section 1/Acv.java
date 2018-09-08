package ad;

class Student
{
int roll;
float marks;
String name;
void show()
{
System.out.println("Roll: "+roll);
System.out.println("Marks: "+marks);
System.out.println("Name: "+name);
}
}
public class Acv
{
public static void main(String [] args)
{
Student s1=new Student();
s1.show();
}
}
