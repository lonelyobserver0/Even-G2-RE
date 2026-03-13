package org.bouncycastle.oer;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.asn1.ASN1Encodable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class OEREncoder {
    public static byte[] toByteArray(ASN1Encodable aSN1Encodable, Element element) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            new OEROutputStream(byteArrayOutputStream).write(aSN1Encodable, element);
            byteArrayOutputStream.flush();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e10) {
            throw new IllegalStateException(e10.getMessage(), e10);
        }
    }
}
