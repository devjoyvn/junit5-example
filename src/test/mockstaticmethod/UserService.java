package mockstaticmethod;

import java.security.cert.CertificateException;
import java.util.Date;

public class UserService {

    public boolean canAccess() {
        String userId = SecurityContextHolder.getUserId();
        if (userId.equals("admin")) {
            return true;
        }
        return false;
    }

    public boolean isCertValid(String cert) throws CertificateException {
        Date expire = SecurityContextHolder.getExpirationCert(cert);
        if (expire.before(new Date())) {
            return false;
        }
        return true;
    }
}
