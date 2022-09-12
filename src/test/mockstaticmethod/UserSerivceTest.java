package mockstaticmethod;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import java.security.cert.CertificateException;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class UserSerivceTest {

    @Test
    public void canAccessTest() {
        try (MockedStatic<SecurityContextHolder> mockedStatic =
                     Mockito.mockStatic(SecurityContextHolder.class)) {
            mockedStatic.when(SecurityContextHolder::getUserId).thenReturn("admin");
            UserService userService = new UserService();
            boolean canAccess1 = userService.canAccess();
            assertEquals(true, canAccess1);

            mockedStatic.when(SecurityContextHolder::getUserId).thenReturn("user");
            boolean canAccess2 = userService.canAccess();
            assertEquals(false, canAccess2);
        }
    }

    @Test
    public void getExpirationCertTest() throws CertificateException {
        try (MockedStatic<SecurityContextHolder> mockedStatic =
                     Mockito.mockStatic(SecurityContextHolder.class)) {

            String cert = "tmpCert";
            Date afterOneDay = new Date(System.currentTimeMillis() + 1000 * 60 * 60);
            mockedStatic.when(() -> SecurityContextHolder.getExpirationCert(cert)).thenReturn(afterOneDay);
            UserService userService = new UserService();
            boolean isCertValid = userService.isCertValid(cert);
            assertEquals(true, isCertValid);
        }
    }

@Test
public void getExpirationCertAnyTest() throws CertificateException {
    try (MockedStatic<SecurityContextHolder> mockedStatic =
                 Mockito.mockStatic(SecurityContextHolder.class)) {

        Date afterOneDay = new Date(System.currentTimeMillis() + 1000 * 60 * 60);
        mockedStatic.when(() -> SecurityContextHolder.getExpirationCert(ArgumentMatchers.anyString()))
                .thenReturn(afterOneDay);
        UserService userService = new UserService();
        boolean isCertValid = userService.isCertValid("anyvalue");
        assertEquals(true, isCertValid);
    }
}
}
