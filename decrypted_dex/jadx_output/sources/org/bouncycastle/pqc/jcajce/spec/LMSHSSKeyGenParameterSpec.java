package org.bouncycastle.pqc.jcajce.spec;

import com.stub.StubApp;
import java.security.spec.AlgorithmParameterSpec;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class LMSHSSKeyGenParameterSpec implements AlgorithmParameterSpec {
    private final LMSKeyGenParameterSpec[] specs;

    public LMSHSSKeyGenParameterSpec(LMSKeyGenParameterSpec... lMSKeyGenParameterSpecArr) {
        if (lMSKeyGenParameterSpecArr.length == 0) {
            throw new IllegalArgumentException(StubApp.getString2(34742));
        }
        this.specs = (LMSKeyGenParameterSpec[]) lMSKeyGenParameterSpecArr.clone();
    }

    public LMSKeyGenParameterSpec[] getLMSSpecs() {
        return (LMSKeyGenParameterSpec[]) this.specs.clone();
    }
}
