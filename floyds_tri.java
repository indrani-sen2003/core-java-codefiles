/*print flloyds triangle*/

class floyds_tri{
public static void main(String [] args){
int x=1;
for(int i=1;i<=Integer.parseInt(args[0]);i++)
{
for(int j=1;j<=i;j++)
{
System.out.print(x+" ");
x++;
}
System.out.println();

}

}
}
