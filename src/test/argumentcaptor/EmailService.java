package argumentcaptor;

import org.mockito.MockedStatic;
import org.mockito.Mockito;

public class EmailService {

    private DeliveryPlatform platform;

    public EmailService() {}
    public EmailService(DeliveryPlatform platform) {
        this.platform = platform;
    }

    public void send(String to, String subject, String body, boolean html) {
        Format format = Format.TEXT_ONLY;
        if (html) {
            format = Format.HTML;
        }
        Email email = new Email(to, subject, body, format);
        platform.send(email);
    }

    public void requestToDeft() {
        String url = "https://shareprogramming.net/";
        DeliveryPlatform.requestTo(url);
    }

}