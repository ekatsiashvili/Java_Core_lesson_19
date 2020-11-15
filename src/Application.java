
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) throws Exception {
		File file = new File("serialize.txt");
		Employee emp = new Employee("Ann", 1, 5000);
		Methods.serialize(file, emp);
		System.out.println(Methods.deserialize(file));

		System.out.println();
		Employee2 emp2 = new Employee2("Ann", 1, 5000);
		Methods.serialize(file, emp2);
		System.out.println(Methods.deserialize(file));
		
		System.out.println();
		File file2 = new File("serializeCollection.txt");
		List<Employee> people = new ArrayList<>();
		people.add(new Employee("Jonny", 2, 6000));
		people.add(new Employee("Ricky", 3, 7000));
		people.add(new Employee("Gary", 4, 9000));
		Methods.serialize(file2, (Serializable)people);
		
		List<Employee> peopleAfterSerialize = new ArrayList<>();
		peopleAfterSerialize = (List<Employee>) Methods.deserialize(file2);
		
		for (Employee employee : peopleAfterSerialize) {
			System.out.println(employee);
		}

	}


}
