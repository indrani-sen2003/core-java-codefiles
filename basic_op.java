//program to illustrate the arithmetic operations 

class basic_op{

public static void main(String [] args) throws Exception{

int sum=Integer.parseInt(args[0])+Integer.parseInt(args[1]);
System.out.println("The sum="+sum);
int sub=Integer.parseInt(args[0])-Integer.parseInt(args[1]);
System.out.println("The sub="+sub);
int mult=Integer.parseInt(args[0])*Integer.parseInt(args[1]);
System.out.println("The mult="+mult);
int div=Integer.parseInt(args[0])/Integer.parseInt(args[1]);
System.out.println("The quotient="+div);
int neg=-(sum);
System.out.println("The negative sum="+neg);
double divs=Double.parseDouble(args[0])/Double.parseDouble(args[1]);
System.out.println("The double quotient="+divs);
}

}