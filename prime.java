//Java print prime numbers
public class prime {  
public static void main(String[] args) {  
 
outer_loop:
for (int i=1;i<=Integer.parseInt(args[0]);i++){
int flag=0;
inner_loop:
for(int j=2;j<=i-1;j++){
if (i%j==0){
flag=1;
break inner_loop;

}//if


}//end for
if (flag==0){
 System.out.println("prime:"+i);

}//end if
}//end for


}//main
}  //class
