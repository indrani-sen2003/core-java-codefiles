import java.util.HashMap;
import java.util.*;
class map_flat1{

public static void main(String [] args){

//apartment = { 'living' : [400, 450], 'bedroom' : [650, 800], 'kitchen' : [300, 250], 'garage' : [250, 0]}


HashMap<String,ArrayList<Integer>> hm1=new HashMap<String,ArrayList<Integer>>();
int [] a={400,500};

hm1.put("living",new ArrayList<Integer>());

ArrayList<Integer> list=hm1.get("living"); 
list.add(400); 
list.add(450); 
hm1.put("living",list); 

hm1.put("bedroom",new ArrayList<Integer>());
list=hm1.get("bedroom"); 
list.add(650); 
list.add(800); 
hm1.put("bedroom",list); 

hm1.put("kitchen",new ArrayList<Integer>());
list=hm1.get("kitchen"); 
list.add(300); 
list.add(250); 
hm1.put("kitchen",list); 

hm1.put("garage",new ArrayList<Integer>());
list=hm1.get("garage"); 
list.add(300); 
list.add(250); 
hm1.put("garage",list); 
System.out.println(hm1);
hm1.sort();
System.out.println(hm1);

}
}