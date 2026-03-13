package org.bouncycastle.crypto.params;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ECKeyParameters extends AsymmetricKeyParameter {
    private final ECDomainParameters parameters;

    public ECKeyParameters(boolean z2, ECDomainParameters eCDomainParameters) {
        super(z2);
        if (eCDomainParameters == null) {
            throw new NullPointerException(StubApp.getString2(29208));
        }
        this.parameters = eCDomainParameters;
    }

    public ECDomainParameters getParameters() {
        return this.parameters;
    }
}
