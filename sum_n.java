/*to find the sum of first n natural numbers*/
class sum_n{
public int sum(int n){

int i=1;
int sum=0;
while (i<=n){
sum=sum+i;
i++;
}//end while
return sum;

}//end function

public static void main(String [] args){
sum_n s=new sum_n();
System.out.println("The sum of n numbers="+s.sum(10));
}

}