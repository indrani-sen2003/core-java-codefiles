interface op{

double math_op(Double x, Double y);

}
class op_main{
public static void main(String [] args){

op o1=(x,y)->(x+y);
System.out.println("The sum of x and y is"+o1.math_op(Double.parseDouble(args[0]),Double.parseDouble(args[1])));
op o2=(x,y)->(x-y);
System.out.println("The difference of x and y is"+o2.math_op(Double.parseDouble(args[0]),Double.parseDouble(args[1])));
op o3=(x,y)->(x*y);
System.out.println("The product of x and y is"+o3.math_op(Double.parseDouble(args[0]),Double.parseDouble(args[1])));
}
}