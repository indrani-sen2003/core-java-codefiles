class animal{
animal(){
System.out.println("Every animal has its own language");
}
void eat(){
System.out.println("animal is eating");
}
}

class dog extends animal{
dog(){
System.out.println("Dog barks WOW WOW");
}
void eat(){
System.out.println("dog is eating");
}
}


class cat extends animal
{
cat(){
System.out.println("cat meows");
}
void eat(){
System.out.println("cat is eating");
}
}
//static binding
class animal_main_static{

public static void main(String [] args){

animal a=new animal();
a.eat();
dog d=new dog();
d.eat();
cat c=new cat();
c.eat();
}
}

