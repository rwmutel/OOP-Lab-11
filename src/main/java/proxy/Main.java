package proxy;

import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import com.mailjet.client.MailjetClient;
import com.mailjet.client.MailjetRequest;
import com.mailjet.client.MailjetResponse;
import com.mailjet.client.ClientOptions;
import com.mailjet.client.resource.Emailv31;
import org.json.JSONArray;
import org.json.JSONObject;

public class Main {
    public static void main(String[] args) throws MailjetException, MailjetSocketTimeoutException {
        MyImage img = new ProxyImage("src/main/java/proxy/cat.jfif");
        img.display();
    }
}