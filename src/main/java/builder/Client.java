package builder;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Client extends User {
    public static void main(String[] args) {
        Client client = Client.builder().age(18).build();
    }
}
