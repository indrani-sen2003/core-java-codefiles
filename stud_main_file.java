import java.io.Serializable;
import java.io.*;
class student implements Serializable{

public String name="";
public int roll=0;
student(){

}

student(int r,String n){
roll=r;
name=n;

}

}

class stud_main_file{

public static void main(String [] args) throws Exception{

student s=new student(102,"Reema");
student s1=new student(103,"Jayant");
student s2=new student(104,"Ritwik");
FileOutputStream fs=new FileOutputStream("student.txt",true);
ObjectOutputStream f_obj=new ObjectOutputStream(fs);

f_obj.writeObject(s);
f_obj.writeObject(s1);
f_obj.writeObject(s2);

f_obj.close();
fs.close();

}


}


