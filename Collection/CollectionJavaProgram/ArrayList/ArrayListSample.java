package ArrayListConcept;
import java.util.*;
public class Example2 {
  public static void main(String args[])
  {
	  ArrayList<Integer> ar1=new ArrayList<>();
	  ar1.add(12);
      ar1.addAll(Arrays.asList(12,23,34,45,25));
      //System.out.println(ar1.contains(12));
     ArrayList<Integer> arr=(ArrayList)ar1.clone();
     //System.out.println(ar1.indexOf(23));;
    // System.out.println(ar1.lastIndexOf(45));
     ArrayList<String> chararr=new ArrayList<>();
     
     chararr.addAll(Arrays.asList("arun","a"));
    // System.out.println(chararr);
    //System.out.println( chararr.contains('a'));
   ArrayList<Integer> ar= new ArrayList<>(); 
   ar.addAll(Arrays.asList(1,2,3,4,5,6,2,2,7,8,9,10));
   ar.removeIf(num ->num%2==0);
   System.out.println(ar);
//System.out.println(ar.retainAll(Collections.singleton(2))
//); 
//System.out.println(ar);
   
   
   
   ArrayList<String> newlist=new ArrayList<>(Arrays.asList("arun","varun","vimal"));
  // Object[] str=
   for(Object a:newlist.toArray()) {
	   System.out.println(a);
   }
}
}
