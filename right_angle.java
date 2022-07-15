package mypackage;
import java.util.Scanner;

class right_angle{

public static void main(String [] args){

Scanner sin=new Scanner(System.in);
System.out.println("Enter the base of a rt angled triangle:");
Double b=Double.parseDouble(sin.nextLine());
System.out.println("Enter the height of a rt angled triangle:");
Double ht=Double.parseDouble(sin.nextLine());
Double hyp=(b*b)+(ht*ht);
System.out.println("Hypotenuse:"+hyp);
}
}