package employeewage.employeewagecomputation;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");

        IEmpWageBuilder builder = new EmpWageBuilder();

        builder.addCompany("TCS", 20, 20, 100);
        builder.addCompany("Infosys", 25, 22, 120);

        builder.computeWages();

        System.out.println("TCS Wage: " + builder.getTotalWage("TCS"));
        System.out.println("Infosys Wage: " + builder.getTotalWage("Infosys"));
    }
}
