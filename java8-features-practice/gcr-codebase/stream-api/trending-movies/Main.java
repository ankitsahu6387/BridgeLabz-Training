import java.util.*;
import java.util.stream.*;
public class Main {
    public static void main(String args[]){
        List<Movie> movies = Arrays.asList(
            new Movie("Movie A", 8.5, 2023),
            new Movie("Movie B", 9.0, 2024),
            new Movie("Movie C", 7.8, 2022),
            new Movie("Movie D", 8.9, 2024),
            new Movie("Movie E", 8.2, 2021),
            new Movie("Movie F", 9.1, 2023)
        );
        System.out.println("Top 5 trending movies: ");
        movies.stream()
              .filter(m -> m.rating >= 8.0) //filter movies with rating >= 8
              .sorted((m1, m2) -> { // sort logic
                  if (m1.year != m2.year)
                      return m2.year - m1.year; // latest year first
                  return Double.compare(m2.rating, m1.rating); // if year is same high rating first
              })
              .limit(5) // top 5 only
              .forEach(System.out::println);    
    }    
}
