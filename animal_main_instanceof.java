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

class animal_main_instanceof{

public static void main(String [] args){

animal a=new animal();
a.eat();

a=new dog();
a.eat();
a=new cat();
a.eat();

System.out.println("is **a** an instance of dog?");
System.out.println(a instanceof dog);
System.out.println("is **a** an instance of cat?");
System.out.println(a instanceof cat);
System.out.println("is **a** an instance of animal?");
System.out.println(a instanceof animal);
}
}

