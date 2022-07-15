interface basic_info
{
int roll=1;
String name="soumya";
int age=10;
void disp();
}
interface physical_fit
{
float height=10.5;
float weight=50;
void disp();
	}
class  academic_info implements
basic_info,physical_fit
{
String course="science";
String sem=2;
int rank=10;
void disp(){

}
}

class academic_main_interface{

public static void main(String [] args){

basic_info b1=new academic_info();


}

}
