import java.util.ArrayList;
import java.util.List;

public class StreamDistinctDemo
{
	public static void main(String[] args)
	{
		List<Person> personList = new ArrayList<>();

		personList.add(new Person("Alice", "alice@gmail.com", Gender.FEMALE, 15));
		personList.add(new Person("Bob", "bob@gmail.com", Gender.MALE, 16));
		personList.add(new Person("Carol", "carol@gmail.com", Gender.FEMALE, 23));
		personList.add(new Person("David", "david@gmail.com", Gender.MALE, 19));
		personList.add(new Person("Eric", "eric@gmail.com", Gender.MALE, 17));

		/*
		 * The limit() operation returns a stream containing only a specified
		 * number of elements. Combining with the sorted() operation, the
		 * following example shows top 3 youngest persons:
		 * 
		 */
		personList.stream().sorted().limit(3).forEach(System.out::println);
	}

}