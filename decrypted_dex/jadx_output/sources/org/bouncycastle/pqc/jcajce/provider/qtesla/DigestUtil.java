package org.bouncycastle.pqc.jcajce.provider.qtesla;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Xof;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.digests.SHAKEDigest;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class DigestUtil {
    public static Digest getDigest(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_sha256)) {
            return new SHA256Digest();
        }
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_sha512)) {
            return new SHA512Digest();
        }
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_shake128)) {
            return new SHAKEDigest(128);
        }
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_shake256)) {
            return new SHAKEDigest(256);
        }
        throw new IllegalArgumentException(a.e(StubApp.getString2(34023), aSN1ObjectIdentifier));
    }

    public static byte[] getDigestResult(Digest digest) {
        int digestSize = getDigestSize(digest);
        byte[] bArr = new byte[digestSize];
        if (digest instanceof Xof) {
            ((Xof) digest).doFinal(bArr, 0, digestSize);
            return bArr;
        }
        digest.doFinal(bArr, 0);
        return bArr;
    }

    public static int getDigestSize(Digest digest) {
        boolean z2 = digest instanceof Xof;
        int digestSize = digest.getDigestSize();
        return z2 ? digestSize * 2 : digestSize;
    }
}
