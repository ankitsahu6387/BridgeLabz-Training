import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Claim> claims = Arrays.asList(
            new Claim("Health", 50000),
            new Claim("Vehicle", 30000),
            new Claim("Health", 70000),
            new Claim("Life", 100000)
        );
        Map<String, Double> avgClaimAmount = 
            claims.stream()
                 .collect(Collectors.groupingBy(
                    c -> c.claimType, 
                    Collectors.averagingDouble(c -> c.claimAmount)
                 ));
        avgClaimAmount.forEach((type, avg) -> 
            System.out.println(type + ": average: " + avg)
        );
    }
}