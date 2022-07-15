/*write a program to inter change two numbers without using temporary variable*/

class swap_without_temp{

public static void main(String [] args){

int x=20;
int y=56;
System.out.println("Before swapping x="+x+" and y="+y);
x=x+y;
y=x-y;
x=x-y;
System.out.println("After swapping x="+x+" and y="+y);
}

}