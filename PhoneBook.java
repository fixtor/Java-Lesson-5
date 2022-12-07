import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {

	Map<String, ArrayList<Integer>> phoneBook = new TreeMap();
	ArrayList<Integer> numbers = new ArrayList<>();
	String Name;
	public void setName(String name) {
		Name = name;
	}

	public void setNumbers(ArrayList<Integer> numbers1) {
			numbers = numbers1;
		}

	public String getName() {
		return Name;
	}

	public ArrayList<Integer> getNumbers() {
		return numbers;
	}

	public Map<String, ArrayList<Integer>> getMap(String Name, ArrayList numbers) {
		phoneBook.put(Name, numbers);
		return phoneBook;
	}
}



