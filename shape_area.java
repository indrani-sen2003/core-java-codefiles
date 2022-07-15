import java.lang.Math;
class shape_area{

public Double area(Double l, Double b){

return (l*b);
}

public Double area(Double r)
{

return(3.124*r*r);

}

public Double area(Double a,Double b, Double c){

Double s=(a+b+c)/2;
return Math.sqrt(s*(s-a)*(s-b)*(s-c));

}

public static void main(String [] args){

shape_vol s=new shape_vol();
System.out.println("The area of rectangle="+s.area(10.0,5.0));
System.out.println("The area of circle="+s.area(2.5));
System.out.println("The area of scalene triangle="+s.area(2.2,3.4,5.2));



}



}