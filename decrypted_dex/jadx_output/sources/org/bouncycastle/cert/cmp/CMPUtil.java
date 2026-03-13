package org.bouncycastle.cert.cmp;

import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.asn1.ASN1Object;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class CMPUtil {
    public static void derEncodeToStream(ASN1Object aSN1Object, OutputStream outputStream) {
        try {
            aSN1Object.encodeTo(outputStream, StubApp.getString2("26791"));
            outputStream.close();
        } catch (IOException e10) {
            throw new CMPRuntimeException(u.q(e10, new StringBuilder(StubApp.getString2(28018))), e10);
        }
    }
}
