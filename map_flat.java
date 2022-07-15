import java.util.HashMap;
import java.util.Arrays;
class map_flat{

public static void main(String [] args){

//apartment = { 'living' : [400, 450], 'bedroom' : [650, 800], 'kitchen' : [300, 250], 'garage' : [250, 0]}

int [] a=new int[2];
HashMap<String,int[]> hm1=new HashMap<String,int[]>();
a=new int[]{400,500};
hm1.put("living",a);
a=new int[]{400,500};
hm1.put("bedroom",a);
a=new int[]{300,250};
hm1.put("kitchen",a);
a=new int[]{250,0};
hm1.put("garage",a);

System.out.println(hm1);

}
}