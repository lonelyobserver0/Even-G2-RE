package org.bouncycastle.crypto.constraints;

import com.stub.StubApp;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bouncycastle.crypto.CryptoServiceProperties;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class LoggingConstraint extends ServicesConstraint {
    public LoggingConstraint(Set<String> set) {
        super(set);
    }

    @Override // org.bouncycastle.crypto.CryptoServicesConstraints
    public void check(CryptoServiceProperties cryptoServiceProperties) {
        if (isException(cryptoServiceProperties.getServiceName())) {
            return;
        }
        Logger logger = ServicesConstraint.LOG;
        if (logger.isLoggable(Level.INFO)) {
            StringBuilder sb2 = new StringBuilder(StubApp.getString2(28454));
            sb2.append(cryptoServiceProperties.getServiceName());
            sb2.append(StubApp.getString2(28455));
            sb2.append(cryptoServiceProperties.getServiceName());
            String string2 = StubApp.getString2(81);
            sb2.append(string2);
            sb2.append(cryptoServiceProperties.bitsOfSecurity());
            sb2.append(string2);
            sb2.append(cryptoServiceProperties.getPurpose());
            logger.info(sb2.toString());
        }
    }
}
