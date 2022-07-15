class stud_count{

String name;
double percent;
static int counter=0;
stud_count(){

counter++;
}

void getd(){
DataInputStream in=new DataInputStream(System.in);
name=in.readLine();
perc=Integer.parseInt(in.readLine());
}

void dispd(){
System.out.println("name:"+name);
System.out.println("percentage="+perc);

}

void count_stud(){

System.out.println("the total number of students:"+counter);
}
public static void main(String [] args)
{
stud_count s=new stud_count();
s.getd();
s.dispd();
stud_count s1=new stud_count();
s1.getd();
s1.dispd();
stud_count s2=new stud_count();
s2.getd();
s2.dispd();
s2.count_stud();

}

}