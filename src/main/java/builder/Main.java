package builder;

import builder.User;

public class Main {
    public static void main(String[] args) {
        User usr = User.builder()
                .age(31)
                .name("Oles")
                .build();
        System.out.println(usr);
    }
}
