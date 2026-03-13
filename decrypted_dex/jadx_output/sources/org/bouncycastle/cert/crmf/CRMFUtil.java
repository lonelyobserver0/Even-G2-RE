package org.bouncycastle.cert.crmf;

import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.x509.ExtensionsGenerator;
import org.bouncycastle.cert.CertIOException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class CRMFUtil {
    public static void addExtension(ExtensionsGenerator extensionsGenerator, ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z2, ASN1Encodable aSN1Encodable) throws CertIOException {
        try {
            extensionsGenerator.addExtension(aSN1ObjectIdentifier, z2, aSN1Encodable);
        } catch (IOException e10) {
            throw new CertIOException(u.q(e10, new StringBuilder(StubApp.getString2(28004))), e10);
        }
    }

    public static void derEncodeToStream(ASN1Object aSN1Object, OutputStream outputStream) {
        try {
            aSN1Object.encodeTo(outputStream, StubApp.getString2("26791"));
            outputStream.close();
        } catch (IOException e10) {
            throw new CRMFRuntimeException(u.q(e10, new StringBuilder(StubApp.getString2(28018))), e10);
        }
    }
}
