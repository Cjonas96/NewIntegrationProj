import java.util.HashMap;
import java.util.Map;

public class hashMap {
	public static void database() {
		HashMap<Integer, String> people = new HashMap<Integer, String>();
		people.put(21, "Christian");
		people.put(20, "Mitch");
		people.put(19, "Jeremy");
		
		String name = people.get(21);
		System.out.println(name);
		
		for(Map.Entry<Integer, String> entry: people.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + ": " + value);
		}
	}
}
