interface len{

int strlen(String x);
}

class strlen_main{

static int strlen_new(String x){

int count=0;
int i=0;
while(x.charAt(i)!='\n'){
i++;
count++;
}
return count;

}

public static void main(String [] args){
len l;
l=strlen_main::strlen_new;
String x="Mumbai is a beautiful city\n";
int length=l.strlen(x);
System.out.println(" The length of the string ," +x + " is:"+length);
}
}