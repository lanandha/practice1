package ad;
import java.util.TreeSet.*;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.Scanner;
public class SumTwo {
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
      String str=sc.next();
      String[] s=str.split(",");
      int a=Integer.parseInt(s[0]);
      int b=Integer.parseInt(s[1]);
      // creating a TreeSet 
      TreeSet <Integer>treeadd = new TreeSet<Integer>();
      TreeSet <Integer>treesubset = new TreeSet<Integer>();

      // adding in the tree set
      treeadd.add(1);
      treeadd.add(2);
      treeadd.add(3);
      treeadd.add(4);
      treeadd.add(5);
      treeadd.add(6);
      treeadd.add(7);
      treeadd.add(8);

      // creating subset
      treesubset = (TreeSet)treeadd.subSet(3,7); 

      // create iterator
      Iterator iterator;
      iterator = treesubset.iterator(); 
      int count=0;
      while (iterator.hasNext()) {
         count++;
      }
 
		System.out.println(count);	
			
		
	}

}
