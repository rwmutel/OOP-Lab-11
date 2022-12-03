package strategy;

import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import com.mailjet.client.MailjetClient;
import com.mailjet.client.MailjetRequest;
import com.mailjet.client.MailjetResponse;
import com.mailjet.client.ClientOptions;
import com.mailjet.client.resource.Emailv31;
import org.json.JSONArray;
import org.json.JSONObject;

public class MailSender {
    public static void main(String[] args) throws MailjetException, MailjetSocketTimeoutException {
        Client user = new Client("Roman", 18,  "roman.mutel@ucu.edu.ua", "M");
        MailInfo mailInfo = new MailInfo(new Gift(), user);

        MailjetClient client;
        MailjetRequest request;
        MailjetResponse response;
        client = new MailjetClient("8697e01af9bd87be6383d0b1404263aa",
                "4fc1359c297c82bf3eae42e9270e4032",
                new ClientOptions("v3.1")
        );
        request = new MailjetRequest(Emailv31.resource)
                .property(Emailv31.MESSAGES, new JSONArray()
                        .put(new JSONObject()
                                .put(Emailv31.Message.FROM, new JSONObject()
                                        .put("Email", "roman.mutel@ucu.edu.ua")
                                        .put("Name", "Roman"))
                                .put(Emailv31.Message.TO, new JSONArray()
                                        .put(new JSONObject()
                                                .put("Email", user.getEmail())
                                                .put("Name", user.getName())))
                                .put(Emailv31.Message.SUBJECT, "Greetings from Mailjet.")
                                .put(Emailv31.Message.TEXTPART, "My first Mailjet email")
                                .put(Emailv31.Message.HTMLPART, mailInfo.generate())
                                .put(Emailv31.Message.CUSTOMID, "AppGettingStartedTest")));
        response = client.post(request);
        System.out.println(response.getStatus());
        System.out.println(response.getData());
    }
}
