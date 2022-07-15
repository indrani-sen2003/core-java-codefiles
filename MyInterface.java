interface MyInterface{  
 
    default void newMethod(){  
        System.out.println("Newly added default method");  
    }  
    
   
    static void anotherNewMethod(){
    	System.out.println("Newly added static method");
    }
   
    void existingMethod(String str);  
}  
public class Example implements MyInterface{ 
	// implementing abstract method
    public void existingMethod(String str){           
        System.out.println("String is: "+str);  
    }  
    public static void main(String[] args) {  
    	Example obj = new Example();
    	
    	
        obj.newMethod();     
        //calling the static method of interface
        MyInterface.anotherNewMethod();
        //calling the abstract method of interface
        obj.existingMethod("Java 8 is easy to learn"); 
        
  
    }  
}