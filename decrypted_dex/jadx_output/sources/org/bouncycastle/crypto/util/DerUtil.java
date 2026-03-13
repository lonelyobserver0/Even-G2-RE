package org.bouncycastle.crypto.util;

import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class DerUtil {
    public static ASN1OctetString getOctetString(byte[] bArr) {
        return bArr == null ? new DEROctetString(new byte[0]) : new DEROctetString(Arrays.clone(bArr));
    }

    public static byte[] toByteArray(ASN1Primitive aSN1Primitive) {
        try {
            return aSN1Primitive.getEncoded();
        } catch (IOException e10) {
            throw new IllegalStateException(u.q(e10, new StringBuilder(StubApp.getString2(29349)))) { // from class: org.bouncycastle.crypto.util.DerUtil.1
                @Override // java.lang.Throwable
                public Throwable getCause() {
                    return e10;
                }
            };
        }
    }
}
