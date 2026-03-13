package org.bouncycastle.jcajce.spec;

import com.stub.StubApp;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SM2ParameterSpec implements AlgorithmParameterSpec {
    private byte[] id;

    public SM2ParameterSpec(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException(StubApp.getString2(32448));
        }
        this.id = Arrays.clone(bArr);
    }

    public byte[] getID() {
        return Arrays.clone(this.id);
    }
}
