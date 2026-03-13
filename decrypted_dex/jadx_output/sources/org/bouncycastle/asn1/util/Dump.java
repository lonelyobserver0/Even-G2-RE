package org.bouncycastle.asn1.util;

import com.stub.StubApp;
import java.io.FileInputStream;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Primitive;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class Dump {
    public static void main(String[] strArr) throws Exception {
        char c10 = 1;
        if (strArr.length < 1) {
            System.out.println(StubApp.getString2(27550));
            System.exit(1);
        }
        boolean z2 = false;
        if (strArr.length > 1) {
            z2 = StubApp.getString2(27551).equals(strArr[0]);
        } else {
            c10 = 0;
        }
        FileInputStream fileInputStream = new FileInputStream(strArr[c10]);
        try {
            ASN1InputStream aSN1InputStream = new ASN1InputStream(fileInputStream);
            while (true) {
                ASN1Primitive readObject = aSN1InputStream.readObject();
                if (readObject == null) {
                    return;
                } else {
                    System.out.println(ASN1Dump.dumpAsString(readObject, z2));
                }
            }
        } finally {
            fileInputStream.close();
        }
    }
}
