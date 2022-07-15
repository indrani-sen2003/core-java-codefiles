import java.io.FileOutputStream;  
public class fs_class {  
    public static void main(String args[]){    
           try{    
             byte [] byte_arr=new byte[100];
             String str="Welcome to the class";
             byte_arr=str.getBytes();
             FileOutputStream fout=new FileOutputStream("myfilewelcome.txt");    
             fout.write(byte_arr);   
             
             fout.close();    
             System.out.println("success...");    
            }catch(Exception e){System.out.println(e);}    
      }    
}  