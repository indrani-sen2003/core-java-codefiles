class hi{
public void show() throws Exception{
for(int i=1;i<=5;i++){
System.out.println("Hi");

Thread.sleep(500);
}

}//show
}//hi

class hello{
public void show() throws Exception{
for(int i=1;i<=5;i++){
System.out.println("Hello");
Thread.sleep(500);
}

}//show
}//hi


class tdemo{

public static void main(String [] args) throws Exception{

hi obj1=new hi();
obj1.show();
hello obj2=new hello();
obj2.show();

}



}