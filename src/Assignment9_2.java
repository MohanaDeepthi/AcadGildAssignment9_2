import java.util.*;

public class Assignment9_2 {
	
	
	
	public static void main(String args[]){
		Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(10, 20, 30));
		Set<Integer> set2=new HashSet<Integer>(Arrays.asList(40,50));
	
		System.out.println("set1 before union "+set1);
		set1.addAll(set2);
		System.out.println("set1 after union "+set1);
		
	}

}
