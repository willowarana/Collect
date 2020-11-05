import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

public class Driver {

	public static void main(String[] args) {
		// Show how you would use Set to find the unique elements in a List.
		ArrayList<String> cats = new ArrayList<>();
		cats.add("calico");
		cats.add("persian");
		cats.add("british shorthair");
		cats.add("calico");
		HashSet<String> uniqueCats = new HashSet<>();
		for(int i = 0; i < cats.size(); ++i) {
			uniqueCats.add(cats.get(i));
		}
		System.out.println(cats);
		System.out.println(uniqueCats);
		
		
		//Show an example of HashMap and a TreeMap, and explain the difference. 
		HashMap <Character, String> fruits = new HashMap<>();
		fruits.put('d', "durian");
		fruits.put('p',"pineapple");
		fruits.put('a', "apple");
		fruits.put('c', "coconut");
		//the fruits will be printed out in unsorted order, because HashMaps are not sorted.
		System.out.println(fruits);
		TreeMap<Character, String> sortedFruits = new TreeMap<>();
		sortedFruits.put('d', "durian");
		sortedFruits.put('p',"pineapple");
		sortedFruits.put('a', "apple");
		sortedFruits.put('c', "coconut");
		//the fruits will be printed out in sorted order, because TreeMaps are sorted according to the natural ordering of their keys.
		System.out.println(sortedFruits);
		
		//Which should you use (HashMap or TreeMap), if you have to guarantee the order of key, value pairs?
		
		//You should use TreeMap because it implements comparable and automatically sorts the pairs according to the natural ordering 
		//of their keys. 
		
		

	}

}
