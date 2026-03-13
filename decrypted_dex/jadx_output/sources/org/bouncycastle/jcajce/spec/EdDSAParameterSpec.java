package org.bouncycastle.jcajce.spec;

import com.stub.StubApp;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.asn1.edec.EdECObjectIdentifiers;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class EdDSAParameterSpec implements AlgorithmParameterSpec {
    public static final String Ed25519 = StubApp.getString2(28196);
    public static final String Ed448 = StubApp.getString2(28197);
    private final String curveName;

    public EdDSAParameterSpec(String str) {
        String string2 = StubApp.getString2(28196);
        if (str.equalsIgnoreCase(string2)) {
            this.curveName = string2;
            return;
        }
        String string22 = StubApp.getString2(28197);
        if (str.equalsIgnoreCase(string22)) {
            this.curveName = string22;
        } else if (str.equals(EdECObjectIdentifiers.id_Ed25519.getId())) {
            this.curveName = string2;
        } else {
            if (!str.equals(EdECObjectIdentifiers.id_Ed448.getId())) {
                throw new IllegalArgumentException(StubApp.getString2(32439).concat(str));
            }
            this.curveName = string22;
        }
    }

    public String getCurveName() {
        return this.curveName;
    }
}
