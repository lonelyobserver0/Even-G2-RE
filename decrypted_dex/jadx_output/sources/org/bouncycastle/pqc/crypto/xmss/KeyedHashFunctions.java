package org.bouncycastle.pqc.crypto.xmss;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Xof;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
final class KeyedHashFunctions {
    private final Digest digest;
    private final int digestSize;

    public KeyedHashFunctions(ASN1ObjectIdentifier aSN1ObjectIdentifier, int i3) {
        if (aSN1ObjectIdentifier == null) {
            throw new NullPointerException(StubApp.getString2(34295));
        }
        this.digest = DigestUtil.getDigest(aSN1ObjectIdentifier);
        this.digestSize = i3;
    }

    private byte[] coreDigest(int i3, byte[] bArr, byte[] bArr2) {
        byte[] bytesBigEndian = XMSSUtil.toBytesBigEndian(i3, this.digestSize);
        this.digest.update(bytesBigEndian, 0, bytesBigEndian.length);
        this.digest.update(bArr, 0, bArr.length);
        this.digest.update(bArr2, 0, bArr2.length);
        int i10 = this.digestSize;
        byte[] bArr3 = new byte[i10];
        Digest digest = this.digest;
        if (digest instanceof Xof) {
            ((Xof) digest).doFinal(bArr3, 0, i10);
            return bArr3;
        }
        digest.doFinal(bArr3, 0);
        return bArr3;
    }

    public byte[] F(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i3 = this.digestSize;
        if (length != i3) {
            throw new IllegalArgumentException(StubApp.getString2(34297));
        }
        if (bArr2.length == i3) {
            return coreDigest(0, bArr, bArr2);
        }
        throw new IllegalArgumentException(StubApp.getString2(34296));
    }

    public byte[] H(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i3 = this.digestSize;
        if (length != i3) {
            throw new IllegalArgumentException(StubApp.getString2(34297));
        }
        if (bArr2.length == i3 * 2) {
            return coreDigest(1, bArr, bArr2);
        }
        throw new IllegalArgumentException(StubApp.getString2(34296));
    }

    public byte[] HMsg(byte[] bArr, byte[] bArr2) {
        if (bArr.length == this.digestSize * 3) {
            return coreDigest(2, bArr, bArr2);
        }
        throw new IllegalArgumentException(StubApp.getString2(34297));
    }

    public byte[] PRF(byte[] bArr, byte[] bArr2) {
        if (bArr.length != this.digestSize) {
            throw new IllegalArgumentException(StubApp.getString2(34297));
        }
        if (bArr2.length == 32) {
            return coreDigest(3, bArr, bArr2);
        }
        throw new IllegalArgumentException(StubApp.getString2(34298));
    }
}
