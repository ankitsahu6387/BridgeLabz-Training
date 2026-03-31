import java.util.*;

public class UnionIntersection {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        // Union
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);  // merges both sets
        System.out.println("Union: " + union);

        // Intersection
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2); // retainAll keeps only common elements
        System.out.println("Intersection: " + intersection);
    }
}
