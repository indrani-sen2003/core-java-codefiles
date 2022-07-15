interface shape{
int area(int l,int b);
}
class interface_area implements shape{

public int area(int x,int y){
return x*y;
}
public static void main(String [] args){
int l=10;
int b=20;
shape s=new interface_area();
System.out.println("area of shape="+s.area(l,b));
}
}