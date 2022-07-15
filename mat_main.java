/*squaring of matrix*/
class mat{

int [][] x=new int [2][2];

public int [][] getX(){

return x;

}

public void setX(int [][] new_x){
 for(int i=0;i<=x.length-1;i++)
{
 for (int j=0;j<=x[i].length-1;j++){

x[i][j]=new_x[i][j]*new_x[i][j];

}//for
}//for

}//setx

}//class mat


class mat_main{

public static void main(String [] args){
mat m=new mat();
int [][] m1={{2,4},{3,6}};
m.setX(m1);
System.out.println("printing original matrix");
for(int i=0;i<=m1.length-1;i++)
{
 for (int j=0;j<=m1[i].length-1;j++){
System.out.println(m1[i][j]);
}//for
}//for

int [][] m2=m.getX();
System.out.println("printing square matrix");

for(int [] row:m2){

   for(int col: row){

        System.out.println(col);

      }//for row
                }//for col
}//main
}//class mat_main