import java.util.*;
import java.util.Set;
import java.util.Comparator;

class set_hashcode{
public static void main(String [] args){
Set<Integer>s1=new HashSet<Integer>();
Integer [] n1={1, 3, 2, 4, 8, 9, 0};
s1.addAll(Arrays.asList(n1));
System.out.println("hashcode value of s1"+s1.hashCode());

Integer [] n2={1,1,1,1, 3, 3,2,2, 4,4,4, 8, 9, 0};
Set<Integer>s2=new HashSet<Integer>();
s2.addAll(Arrays.asList(n2));
System.out.println("hashcode value of s2"+s1.hashCode());

if(s1.hashCode()==s2.hashCode())
   System.out.println("The two sets are equal");
else
   System.out.println("The two sets are not equal");
}
}