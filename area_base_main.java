 class Shape
{
int id=1;
String name="Shape";
}
class Circle  extends Shape
{

int radius=4;
void areacirc(){
System.out.println("area circle:"+3.142*radius*radius);
}
}
class Rectangle  extends Shape
{
int l=10,b=20;
void arearec(){
System.out.println("area rectangle:"+(l*b));
}
void perirec(){
System.out.println("perimeter recatngle:"+2*(l+b));

}
}
class Square extends Rectangle
{
    int side;
void areasqr(){
System.out.println("area square:"+(side*side));

}
}

class area_base_main{

public static void main(String [] args){

Rectangle r=new Rectangle();
r.arearec();
r.perirec();
Circle c=new Circle();
c.areacirc();
}


}
