import java.io.FileInputStream;

public class finput{

public static void main(String [] args) throws Exception{

FileInputStream fs=new FileInputStream("myfilewelcome.txt");
int i=0;

while((i=fs.read())!=-1){

System.out.print((char)i);
}
}//main

}