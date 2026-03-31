import java.util.*;

public class Main {
    public static void main(String[] args) {

        // District 1 sorted list
        List<Student> district1 = Arrays.asList(
            new Student("Alice", "District1", 95),
            new Student("Bob", "District1", 88),
            new Student("Charlie", "District1", 85)
        );

        // District 2 sorted list
        List<Student> district2 = Arrays.asList(
            new Student("David", "District2", 92),
            new Student("Eva", "District2", 88),
            new Student("Frank", "District2", 80)
        );

        // District 3 sorted list
        List<Student> district3 = Arrays.asList(
            new Student("Grace", "District3", 90),
            new Student("Henry", "District3", 85),
            new Student("Ivy", "District3", 82)
        );

        List<List<Student>> districtLists = Arrays.asList(district1, district2, district3);

        // Merge all districts into state rank sheet
        List<Student> finalRankList = RankSheetGenerator.mergeDistrictLists(districtLists);

        // Print final state-wise rank list
        System.out.println("Final State-wise Rank List:");
        int rank = 1;
        for (Student s : finalRankList) {
            System.out.println(rank++ + ". " + s);
        }
    }
}
