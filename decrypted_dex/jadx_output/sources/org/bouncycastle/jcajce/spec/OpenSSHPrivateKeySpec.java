package org.bouncycastle.jcajce.spec;

import com.stub.StubApp;
import java.security.spec.EncodedKeySpec;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class OpenSSHPrivateKeySpec extends EncodedKeySpec {
    private final String format;

    public OpenSSHPrivateKeySpec(byte[] bArr) {
        super(bArr);
        String string2;
        byte b2 = bArr[0];
        if (b2 == 48) {
            string2 = StubApp.getString2(30489);
        } else {
            if (b2 != 111) {
                throw new IllegalArgumentException(StubApp.getString2(32445));
            }
            string2 = StubApp.getString2(32444);
        }
        this.format = string2;
    }

    @Override // java.security.spec.EncodedKeySpec
    public String getFormat() {
        return this.format;
    }
}
