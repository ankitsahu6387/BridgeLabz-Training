import java.util.*;
class Employee {
    String name;
    String department;

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }
}

public class GroupByDepartment {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
            new Employee("Alice", "HR"),
            new Employee("Bob", "IT"),
            new Employee("Carol", "HR")
        );

        Map<String, List<Employee>> map = new HashMap<>();

        for (Employee emp : employees) {

            map.putIfAbsent(emp.department, new ArrayList<>());
            map.get(emp.department).add(emp);
        }

        // Print result
        map.forEach((dept, list) -> {
            System.out.print(dept + ": ");
            list.forEach(e -> System.out.print(e.name + " "));
            System.out.println();
        });
    }
}
