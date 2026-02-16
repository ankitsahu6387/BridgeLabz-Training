package employeewage.employeewagecomputation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmpWageBuilderTest {

    @Test
    void testCompanyNameRegexValidation() {
        assertThrows(IllegalArgumentException.class, () -> {
            new CompanyEmpWage("TCS123", 20, 20, 100);
        });
    }

    @Test
    void testWageComputation() {
        IEmpWageBuilder builder = new EmpWageBuilder();
        builder.addCompany("TestCompany", 20, 5, 40);
        builder.computeWages();

        int wage = builder.getTotalWage("TestCompany");

        assertTrue(wage >= 0);
    }
}
