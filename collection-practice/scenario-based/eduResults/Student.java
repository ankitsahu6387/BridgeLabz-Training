public class Student implements Comparable<Student> {
    String name;
    String district;
    int score;

    public Student(String name, String district, int score) {
        this.name = name;
        this.district = district;
        this.score = score;
    }

    @Override
    public int compareTo(Student other) {
        // Descending order of score
        return other.score - this.score;
    }

    @Override
    public String toString() {
        return name + " (" + district + ") - " + score;
    }
}
