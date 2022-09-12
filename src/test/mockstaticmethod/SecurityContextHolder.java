package mockstaticmethod;

import java.io.ByteArrayInputStream;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Date;

public class SecurityContextHolder {

    public static String getUserId() {
        return "deft";
    }

    public static Date getExpirationCert(String cert) throws CertificateException {
        CertificateFactory certFact = CertificateFactory.getInstance("X.509");
        X509Certificate res = (X509Certificate) certFact
                .generateCertificate(new ByteArrayInputStream(cert.getBytes()));

        return res.getNotAfter();
    }
}
