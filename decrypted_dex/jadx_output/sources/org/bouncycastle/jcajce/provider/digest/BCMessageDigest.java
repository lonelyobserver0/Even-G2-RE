package org.bouncycastle.jcajce.provider.digest;

import com.stub.StubApp;
import java.security.DigestException;
import java.security.MessageDigest;
import org.bouncycastle.crypto.Digest;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BCMessageDigest extends MessageDigest {
    protected Digest digest;
    protected int digestSize;

    public BCMessageDigest(Digest digest) {
        super(digest.getAlgorithmName());
        this.digest = digest;
        this.digestSize = digest.getDigestSize();
    }

    @Override // java.security.MessageDigestSpi
    public int engineDigest(byte[] bArr, int i3, int i10) throws DigestException {
        int i11 = this.digestSize;
        if (i10 < i11) {
            throw new DigestException(StubApp.getString2(30949));
        }
        if (bArr.length - i3 < i11) {
            throw new DigestException(StubApp.getString2(30948));
        }
        this.digest.doFinal(bArr, i3);
        return this.digestSize;
    }

    @Override // java.security.MessageDigestSpi
    public int engineGetDigestLength() {
        return this.digestSize;
    }

    @Override // java.security.MessageDigestSpi
    public void engineReset() {
        this.digest.reset();
    }

    @Override // java.security.MessageDigestSpi
    public void engineUpdate(byte b2) {
        this.digest.update(b2);
    }

    @Override // java.security.MessageDigestSpi
    public byte[] engineDigest() {
        byte[] bArr = new byte[this.digestSize];
        this.digest.doFinal(bArr, 0);
        return bArr;
    }

    @Override // java.security.MessageDigestSpi
    public void engineUpdate(byte[] bArr, int i3, int i10) {
        this.digest.update(bArr, i3, i10);
    }
}
