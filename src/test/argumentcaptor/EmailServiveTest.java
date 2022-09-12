package argumentcaptor;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class EmailServiveTest {

    @Mock
    private DeliveryPlatform platform;

    @InjectMocks
    private EmailService emailService = new EmailService();

    @Captor
    private ArgumentCaptor<Email> emailCaptor;

    @Captor
    private ArgumentCaptor<String> urlCaptor;

    @Test
    public void whenDoesSupportHtml_expectHTMLEmailFormat() {
        String to = "info@deft.com";
        String subject = "Using ArgumentCaptor";
        String body = "Hey, let'use ArgumentCaptor";

        emailService.send(to, subject, body, true);

        Mockito.verify(platform).send(emailCaptor.capture());
        Email value = emailCaptor.getValue();

        assertEquals(Format.HTML, value.getFormat());
        assertEquals(body, value.getBody());
        assertEquals(subject, value.getSubject());
        assertEquals(to, value.getAddress());
    }

    @Test
    public void mockStaticMethodWithArgumentCaptor() {
        try (MockedStatic<DeliveryPlatform> mockedStatic = Mockito.mockStatic(DeliveryPlatform.class)) {
            emailService.requestToDeft();
            mockedStatic.verify(() -> {
                DeliveryPlatform.requestTo(urlCaptor.capture());
                assertEquals("https://shareprogramming.net/", urlCaptor.getValue());
            });
        }
    }

}
