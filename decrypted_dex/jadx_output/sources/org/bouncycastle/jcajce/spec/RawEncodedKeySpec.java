package org.bouncycastle.jcajce.spec;

import com.stub.StubApp;
import java.security.spec.EncodedKeySpec;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class RawEncodedKeySpec extends EncodedKeySpec {
    public RawEncodedKeySpec(byte[] bArr) {
        super(bArr);
    }

    @Override // java.security.spec.EncodedKeySpec
    public String getFormat() {
        return StubApp.getString2(31343);
    }
}
