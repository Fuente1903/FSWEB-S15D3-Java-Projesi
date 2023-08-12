import java.util.*;
import java.util.Map;
class Employee {
    private int id;
    private String firstname;
    private String lastname;

    public Employee(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }



    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList<Employee> employeeList = new LinkedList<>();


        employeeList.add(new Employee(1, "John", "Doe"));
        employeeList.add(new Employee(2, "Jane", "Smith"));
        employeeList.add(new Employee(3, "Alice", "Johnson"));
        employeeList.add(new Employee(1, "Bob", "Brown")); // Duplicate ID

        LinkedList<Employee> duplicateList = new LinkedList<>();
        Map<Integer, Employee> uniqueMap = new HashMap<>();

        Iterator<Employee> iterator = employeeList.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (uniqueMap.containsKey(employee.getId())) {
                duplicateList.add(employee);
                iterator.remove();
            } else {
                uniqueMap.put(employee.getId(), employee);
            }
        }

        System.out.println("Duplicate Employees:");
        for (Employee employee : duplicateList) {
            System.out.println(employee);
        }

        System.out.println("\nUnique Employees Map:");
        for (Employee employee : uniqueMap.values()) {
            System.out.println(employee);
        }

    }
}

public class Main {
    public static void main(String[] args) {
        String text = "When the offensive resumed, the Turks received their first victory when the Greeks encountered stiff resistance in the battles of First and Second İnönü," +
                " due to İsmet Pasha's organization of an irregular militia into a regular army. " +
                " The two victories led to Allied proposals to amend the Treaty of Sèvres where both Ankara and Istanbul were represented, but Greece refused." +
                " With the conclusion of the Southern and Eastern fronts, Ankara was able to concentrate more forces on the West against the Greeks." +
                " They also began to receive support from Soviet Union, as well as France and Italy, who sought to check British influence in the Near East.\n" +
                " June–July 1921 saw heavy fighting in the Battle of Kütahya-Eskişehir. While it was an eventual Greek victory, the Turkish army withdrew in good order to the Sakarya river, their last line of defence." +
                " Mustafa Kemal Pasha replaced İsmet Pasha after the defeat as commander in chief as well as his political duties." +
                " The decision was made in the Greek military command to march on the nationalist capital of Ankara to force Mustafa Kemal to the negotiating table." +
                " For 21 days, the Turks and Greeks fought a pitched battle at the Sakarya river, which ended in Greek withdrawal." +
                " Almost of year of stalemate without much fighting followed, during which Greek moral and discipline faltered while Turkish strength increased." +
                " French and Italian forces evacuated from Anatolia. The Allies offered an armistice to the Turks, which Mustafa Kemal refused.";

        String[] words = text.split("\\s+");

        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {
            
            String cleanedWord = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

            if (!cleanedWord.isEmpty()) {
                wordCountMap.put(cleanedWord, wordCountMap.getOrDefault(cleanedWord, 0) + 1);
            }
        }

        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}