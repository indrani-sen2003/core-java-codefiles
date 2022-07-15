//to find out whether a number accepted in the command line is a +ve, -ve or zero

class pos_neg{


public static void main(String [] args) throws Exception{

if (args.length==0){

System.out.println("Arguments missing:");

}else{

if (Integer.parseInt(args[0])>0)
  System.out.println(args[0] + " is positive");
else if (Integer.parseInt(args[0])<0)
  System.out.println(args[0] + " is negative");
else if (Integer.parseInt(args[0])==0)
  System.out.println(args[0] + " is zero");


}
}



}
