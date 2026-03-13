package org.bouncycastle.jcajce.provider.asymmetric.util;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class KeyUtil {
    public static byte[] getEncodedPrivateKeyInfo(PrivateKeyInfo privateKeyInfo) {
        try {
            return privateKeyInfo.getEncoded(StubApp.getString2("26791"));
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] getEncodedSubjectPublicKeyInfo(AlgorithmIdentifier algorithmIdentifier, ASN1Encodable aSN1Encodable) {
        try {
            return getEncodedSubjectPublicKeyInfo(new SubjectPublicKeyInfo(algorithmIdentifier, aSN1Encodable));
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] getEncodedPrivateKeyInfo(AlgorithmIdentifier algorithmIdentifier, ASN1Encodable aSN1Encodable) {
        try {
            return getEncodedPrivateKeyInfo(new PrivateKeyInfo(algorithmIdentifier, aSN1Encodable.toASN1Primitive()));
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] getEncodedSubjectPublicKeyInfo(AlgorithmIdentifier algorithmIdentifier, byte[] bArr) {
        try {
            return getEncodedSubjectPublicKeyInfo(new SubjectPublicKeyInfo(algorithmIdentifier, bArr));
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] getEncodedSubjectPublicKeyInfo(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        try {
            return subjectPublicKeyInfo.getEncoded(StubApp.getString2("26791"));
        } catch (Exception unused) {
            return null;
        }
    }
}
