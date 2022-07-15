import java.io.*;

class student{
static String name;
static String grade;
static Double marks;
static int counter=0;

public static void input() throws Exception{

DataInputStream in =new DataInputStream(System.in);
System.out.println("Enter your name?");
name=in.readLine();
System.out.println("Enter your grade?");
grade=in.readLine();
System.out.println("Enter your marks?");
marks=Double.parseDouble(in.readLine());

}
public student(){
counter++;
}

public void display(){
System.out.println("Name of student:"+name);
System.out.println("grade:"+grade);
System.out.println("Marks percentage:"+marks);

}
public static void main(String [] args) throws Exception{

student s=new student();
student.input();
s.display();
student s1=new student();
student.input();
s1.display();
student s2=new student();
student.input();
s2.display();
System.out.println("The number of students:"+student.counter);

}

}