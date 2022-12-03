package strategy;

public class Gift implements MailCode {
    private static String TEMPLATE = "Cyber Monday! Hi %NAME,\nGet your gift right now!";
    @Override
    public String generate(Client client) {
        return TEMPLATE.replace("%NAME", client.getName());
    }
}
