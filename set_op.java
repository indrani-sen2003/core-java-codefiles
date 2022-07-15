import java.util.Arrays;
import java.util.Set;
import java.util.*;
import java.io.*;
class set_op{
public static void main(String [] args){

Integer [] num1={1, 3, 2, 4, 8, 9, 0};
Integer [] num2={1, 3, 7, 5, 4, 0, 7, 5};

Set<Integer> s1=new HashSet<Integer>(Arrays.asList(num1));
Set<Integer> s2=new HashSet<Integer>(Arrays.asList(num2));
System.out.println("The s1 is"+s1);
System.out.println("The s2 is"+s2);

Set<Integer> set_union=new HashSet<Integer>();
set_union.addAll(s1);
set_union.addAll(s2);
System.out.println("The union of s1 and s2 is"+set_union);

Set<Integer> set_intersect=new HashSet<Integer>();
set_intersect.addAll(s1);
set_intersect.retainAll(s2);
System.out.println("The intersection of s1 and s2 is"+set_intersect);

Set<Integer> set_diff=new HashSet<Integer>();
set_diff.addAll(s1);
set_diff.removeAll(s2);
System.out.println("The difference is"+set_diff);
}
}