package org.bouncycastle.crypto.constraints;

import com.stub.StubApp;
import java.util.Collections;
import java.util.Set;
import org.bouncycastle.crypto.CryptoServiceConstraintsException;
import org.bouncycastle.crypto.CryptoServiceProperties;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BitsOfSecurityConstraint extends ServicesConstraint {
    private final int requiredBitsOfSecurity;

    public BitsOfSecurityConstraint(int i3) {
        super(Collections.EMPTY_SET);
        this.requiredBitsOfSecurity = i3;
    }

    @Override // org.bouncycastle.crypto.CryptoServicesConstraints
    public void check(CryptoServiceProperties cryptoServiceProperties) {
        if (!isException(cryptoServiceProperties.getServiceName()) && cryptoServiceProperties.bitsOfSecurity() < this.requiredBitsOfSecurity) {
            throw new CryptoServiceConstraintsException(StubApp.getString2(28450) + this.requiredBitsOfSecurity + StubApp.getString2(28451) + cryptoServiceProperties.bitsOfSecurity());
        }
    }

    public BitsOfSecurityConstraint(int i3, Set<String> set) {
        super(set);
        this.requiredBitsOfSecurity = i3;
    }
}
