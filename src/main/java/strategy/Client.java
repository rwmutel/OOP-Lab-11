package strategy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Client {
    private static int count = 0;
    private int id;
    private String name;
    private String email;
    private int age;
    private String sex;
    public Client() {
        id = ++count;
    }

    public Client(String name, int age, String email, String sex) {
        this.id = ++count;
        this.name = name;
        this.age = age;
        this.email = email;
        this.sex = sex;
    }
}
