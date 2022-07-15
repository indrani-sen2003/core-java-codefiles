interface shape{

int area(int l,int b);


}

class lambda_area{
public static void main(String [] args){
int l=10;
int b=20;

shape s;
s=(int x,int y)->(x*y);

System.out.println("area of shape="+s.area(l,b));
}
}