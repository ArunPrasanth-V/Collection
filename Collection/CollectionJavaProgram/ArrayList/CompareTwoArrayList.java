package ArrayListConcept;
import java.util.*;
public class CompareToArrayList {
   public static void main(String[] args)
   {
	   ArrayList<String> l1=new ArrayList<>(Arrays.asList("a","b","c","d","e","f","g","h","i"));
	   ArrayList<String> l2=new ArrayList<>(Arrays.asList("a","b","c","d","e","f","g","h"));
//       Collections.sort(l1);
//       Collections.sort(l2);
//       System.out.println(l1.equals(l2));
       l1.removeAll(l2);
       System.out.println(l1);
   }
}
