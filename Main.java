import java.util.*;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		//	Задание 2. Пусть дан список сотрудников: Иван, Пётр, Антон и так далее. Написать программу, которая найдет и выведет
		//	повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.

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

		//		Задание 1.
		//		Реализуйте структуру телефонной книги с помощью HashMap, учитывая,
		//		что один человек может иметь несколько телефонов.


		Scanner scannerName = new Scanner(System.in);
		PhoneBook Ivanov = new PhoneBook();
		PhoneBook Petrov = new PhoneBook();
		PhoneBook Sidorov = new PhoneBook();

		System.out.println("Введите имя: ");
		String name1 = scannerName.next();
		ArrayList<Integer> numbers1 = new ArrayList<>();
		numbers1.add(11234);
		numbers1.add(33221);
		numbers1.add(444888);
		Ivanov.setName(name1);
		Ivanov.setNumbers(numbers1);


		System.out.println("Введите имя: ");
		String name2 = scannerName.next();
		ArrayList<Integer> numbers2 = new ArrayList<>();
		numbers2.add(11234111);
		numbers2.add(33221222);
		numbers2.add(444888333);
		Petrov.setName(name2);
		Petrov.setNumbers(numbers2);

		System.out.println("Введите имя: ");
		String name3 = scannerName.next();
		ArrayList<Integer> numbers3 = new ArrayList<>();
		numbers3.add(1123444444);
		numbers3.add(332215555);
		numbers3.add(444888666);
		Sidorov.setName(name3);
		Sidorov.setNumbers(numbers3);

		System.out.println(Ivanov.getMap(Ivanov.getName(), Ivanov.getNumbers()));
		System.out.println(Petrov.getMap(Petrov.getName(), Petrov.getNumbers()));
		System.out.println(Sidorov.getMap(Sidorov.getName(), Sidorov.getNumbers()));
	}
}


