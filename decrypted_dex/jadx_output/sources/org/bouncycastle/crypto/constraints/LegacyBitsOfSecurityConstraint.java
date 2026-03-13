package org.bouncycastle.crypto.constraints;

import com.stub.StubApp;
import java.util.Collections;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bouncycastle.crypto.CryptoServiceConstraintsException;
import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class LegacyBitsOfSecurityConstraint extends ServicesConstraint {
    private final int legacyRequiredBitsOfSecurity;
    private final int requiredBitsOfSecurity;

    /* renamed from: org.bouncycastle.crypto.constraints.LegacyBitsOfSecurityConstraint$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$bouncycastle$crypto$CryptoServicePurpose;

        static {
            int[] iArr = new int[CryptoServicePurpose.values().length];
            $SwitchMap$org$bouncycastle$crypto$CryptoServicePurpose = iArr;
            try {
                iArr[CryptoServicePurpose.ANY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$CryptoServicePurpose[CryptoServicePurpose.VERIFYING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$CryptoServicePurpose[CryptoServicePurpose.DECRYPTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$CryptoServicePurpose[CryptoServicePurpose.VERIFICATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public LegacyBitsOfSecurityConstraint(int i3) {
        this(i3, 0);
    }

    @Override // org.bouncycastle.crypto.CryptoServicesConstraints
    public void check(CryptoServiceProperties cryptoServiceProperties) {
        if (isException(cryptoServiceProperties.getServiceName())) {
            return;
        }
        CryptoServicePurpose purpose = cryptoServiceProperties.getPurpose();
        int i3 = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$CryptoServicePurpose[purpose.ordinal()];
        String string2 = StubApp.getString2(28451);
        String string22 = StubApp.getString2(28450);
        if (i3 != 1 && i3 != 2 && i3 != 3 && i3 != 4) {
            if (cryptoServiceProperties.bitsOfSecurity() >= this.requiredBitsOfSecurity) {
                return;
            }
            throw new CryptoServiceConstraintsException(string22 + this.requiredBitsOfSecurity + string2 + cryptoServiceProperties.bitsOfSecurity());
        }
        if (cryptoServiceProperties.bitsOfSecurity() < this.legacyRequiredBitsOfSecurity) {
            throw new CryptoServiceConstraintsException(string22 + this.legacyRequiredBitsOfSecurity + string2 + cryptoServiceProperties.bitsOfSecurity());
        }
        if (purpose != CryptoServicePurpose.ANY) {
            Logger logger = ServicesConstraint.LOG;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(StubApp.getString2(28453) + cryptoServiceProperties.getServiceName());
            }
        }
    }

    public LegacyBitsOfSecurityConstraint(int i3, int i10) {
        super(Collections.EMPTY_SET);
        this.requiredBitsOfSecurity = i3;
        this.legacyRequiredBitsOfSecurity = i10;
    }

    public LegacyBitsOfSecurityConstraint(int i3, int i10, Set<String> set) {
        super(set);
        this.requiredBitsOfSecurity = i3;
        this.legacyRequiredBitsOfSecurity = i10;
    }

    public LegacyBitsOfSecurityConstraint(int i3, Set<String> set) {
        this(i3, 0, set);
    }
}
