import java.io.*;
class switch_vowel{

 
public static void main(String [] args) throws Exception{
  DataInputStream in=new DataInputStream(System.in);
  System.out.println("Enter a sentence");
  String txt=in.readLine();
  int count=0;
  for(int i=0;i<=txt.length()-1;i++){
     switch(txt.charAt(i)){
      case 'a':
      case 'e':
      case 'i':
      case 'o':
      case 'u':
           count++;
}
 }

System.out.println("The number of vowels are:"+count);



}//end main


}//end class