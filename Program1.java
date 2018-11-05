import java.util.*;

public class Program1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<String> vec = new Vector<String>();
		vec.add("First");
		vec.add("Second");
		vec.add("Third");
		vec.add("Random");
		
		List<String> temp = new ArrayList<String>();			
		temp.add("First");
		temp.add("Random");
		
		List<String> temp1 = new ArrayList<String>();
		temp1.add("One");
		temp1.add("Random");
		
		System.out.println("Whether vector contains First and Random elements : " + vec.containsAll(temp)); 		//checks whether vector contains list of elements and return boolean value 
		System.out.println("Whether vector contains One and Random elements : " + vec.containsAll(temp1));
	}

}
