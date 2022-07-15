/*To initialise an array with 10 elements and print only even elements*/
class even_array{

static int [] num={10,2,3,5,7,11,12,56,80,45};
public static void main(String [] args){
for (int i:num){
if (i%2==0)
  System.out.println(i);
}

}
}