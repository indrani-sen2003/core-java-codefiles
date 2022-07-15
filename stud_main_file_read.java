import java.io.*;
class student implements Serializable{

public String name="";
public int roll=0;

student(int r,String n){
roll=r;
name=n;

}

}

class stud_main_file_read{

public static void main(String [] args) throws Exception{

FileInputStream in=new FileInputStream("student.txt");
student obj;
int i=0;

while((i=in.read())!=-1){
try{
ObjectInputStream fin=new ObjectInputStream(in);
obj=(student)fin.readObject();

System.out.println("roll: "+obj.roll);
System.out.println("name: "+obj.name);
}catch(Exception e){};
}

}
}