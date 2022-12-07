import java.util.*;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		GetNamesCount inputList = new GetNamesCount();
		LinkedList<String> lastName = new LinkedList<>();
		LinkedList<String> lastName1 = new LinkedList<>();
		lastName.add("Иванов");
		lastName.add("Иванов");
		lastName.add("Петров");
		lastName.add("Иванов");
		lastName.add("Сидоров");
		lastName.add("Иванов");
		lastName.add("Петров");
		Scanner scanner = new Scanner(System.in);

//		while (true) {
//			System.out.println("Введите фамилии:");
//			String strIn = scanner.nextLine();
//			if (strIn.equals("quit")) break;
//			lastName.add(strIn);
//		}

		inputList.setLinkedList(lastName);
		lastName1 = inputList.getLinkedList();
		System.out.println();

		System.out.println(inputList.countNamesMatches(lastName1));

	}
}


