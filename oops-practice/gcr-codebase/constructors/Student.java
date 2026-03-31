class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
        System.out.println();
    }
}

class PostgraduateStudent extends Student {
    String specialization;

    PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    void displayPostgraduateDetails() {
        System.out.println("Name (protected): " + name);  // accessing protected member
        System.out.println("Specialization: " + specialization);
        System.out.println("CGPA (private via getter): " + getCGPA());
        System.out.println();
    }

    public static void main(String[] args) {
        Student s1 = new Student(101, "Ankit", 9.2);
        s1.displayStudentDetails();

        PostgraduateStudent pg1 = new PostgraduateStudent(201, "Riya", 8.8, "Data Science");
        pg1.displayPostgraduateDetails();
    }
}
