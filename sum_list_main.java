class sum_list{

int sum(int ... x){

int s=0;

for(int i: x){
  s=s+i;
}
return s;
}
}


class sum_list_main{

public static void main(String [] args){

sum_list sl=new sum_list();
System.out.println(sl.sum(10,20));
System.out.println(sl.sum(1,2,3));
int [] x={100,203,45,67};
System.out.println(sl.sum(x));

}


}