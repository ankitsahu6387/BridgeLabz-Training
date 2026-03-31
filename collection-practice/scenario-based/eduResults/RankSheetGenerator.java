import java.util.*;

public class RankSheetGenerator {

    // Merge sort for a list of students
    public static List<Student> mergeSort(List<Student> students) {
        if (students.size() <= 1) return students;

        int mid = students.size() / 2;
        List<Student> left = mergeSort(students.subList(0, mid));
        List<Student> right = mergeSort(students.subList(mid, students.size()));

        return merge(left, right);
    }

    // Merge two sorted lists
    private static List<Student> merge(List<Student> left, List<Student> right) {
        List<Student> merged = new ArrayList<>();
        int i = 0, j = 0;

        while (i < left.size() && j < right.size()) {
            // Stable sort: if scores equal, preserve original order
            if (left.get(i).score >= right.get(j).score) {
                merged.add(left.get(i++));
            } else {
                merged.add(right.get(j++));
            }
        }

        // Add remaining elements
        while (i < left.size()) merged.add(left.get(i++));
        while (j < right.size()) merged.add(right.get(j++));

        return merged;
    }

    // Merge multiple district lists
    public static List<Student> mergeDistrictLists(List<List<Student>> districtLists) {
        List<Student> result = new ArrayList<>();
        for (List<Student> list : districtLists) {
            result = merge(result, list);
        }
        return result;
    }
}
