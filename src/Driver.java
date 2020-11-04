import java.util.ArrayList;
import java.util.HashSet;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

	}

}
