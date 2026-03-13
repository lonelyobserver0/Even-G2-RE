package org.bouncycastle.jcajce.spec;

import com.stub.StubApp;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.asn1.edec.EdECObjectIdentifiers;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class XDHParameterSpec implements AlgorithmParameterSpec {
    public static final String X25519 = StubApp.getString2(28389);
    public static final String X448 = StubApp.getString2(28390);
    private final String curveName;

    public XDHParameterSpec(String str) {
        String string2 = StubApp.getString2(28389);
        if (str.equalsIgnoreCase(string2)) {
            this.curveName = string2;
            return;
        }
        String string22 = StubApp.getString2(28390);
        if (str.equalsIgnoreCase(string22)) {
            this.curveName = string22;
        } else if (str.equals(EdECObjectIdentifiers.id_X25519.getId())) {
            this.curveName = string2;
        } else {
            if (!str.equals(EdECObjectIdentifiers.id_X448.getId())) {
                throw new IllegalArgumentException(StubApp.getString2(32439).concat(str));
            }
            this.curveName = string22;
        }
    }

    public String getCurveName() {
        return this.curveName;
    }
}
