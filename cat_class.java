interface cat{  
    void say(String msg);  
}  
public class cat_class implements sayable{  
    public void say(String msg){  
        System.out.println(msg);  
    }  
    public static void main(String[] args) {  
        cat_class c = new cat_class();  
        c.say("meow");  
    }  
}  