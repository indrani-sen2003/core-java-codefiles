class default_class{

void display(){

System.out.println("This is the default access!");

}
}
class default_main{

public static void main(String [] args){

default_class d=new default_class();
d.display();
}

}