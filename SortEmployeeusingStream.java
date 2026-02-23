import java.util.*;

public class SortEmployeeusingStream {
    public static void main(String [] args){
        Map<String, Integer> employeeMap = new HashMap<>();
        employeeMap.put("Ankit", 50000);
        employeeMap.put("bbbb", 25000);
        employeeMap.put("ccc", 35000);
        employeeMap.put("ddd", 45000);

        System.out.println("Sorted by salary:");
        employeeMap.entrySet().stream()
        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
        
        System.out.println("2nd and 3rd highest salary:");
        employeeMap.entrySet().stream()
        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).skip(1).limit(2).forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));        
    }
}
