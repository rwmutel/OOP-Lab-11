package builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Singular;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

@AllArgsConstructor
@SuperBuilder
@ToString
public class User {
    private int id;
    private String name;
    private String email;
    private int age;
    private double weight;
    private double height;
    @Singular
    private List<String> occupations;
}
