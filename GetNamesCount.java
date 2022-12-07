import java.util.*;

public class GetNamesCount {
	LinkedList<String> linkedList = new LinkedList();
	Map<Integer, String> treeMap = new TreeMap<>();

	GetNamesCount() {}

	public void setLinkedList(LinkedList<String> linkedList) {
		this.linkedList = linkedList;
	}

	public LinkedList<String> getLinkedList() {
		return this.linkedList;
	}

	public static Map<Integer, String> countNamesMatches(LinkedList<String> linkedList) {
		Map<Integer, String> mapNames = new TreeMap<>(Collections.reverseOrder());
		int countTemp = 0;
		String a;
		for (int i = 0; i < linkedList.size(); i++) {
			for (int j = 0; j < linkedList.size(); j++) {
				if (linkedList.get(i).equals(linkedList.get(j))) {
					countTemp++;
				}
			}
			mapNames.put(countTemp, linkedList.get(i));
			countTemp = 0;
		}
		return mapNames;
	}
}




