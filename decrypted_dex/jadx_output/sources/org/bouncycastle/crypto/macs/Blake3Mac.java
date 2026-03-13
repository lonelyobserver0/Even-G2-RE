package org.bouncycastle.crypto.macs;

import com.stub.StubApp;
import org.bouncycastle.asn1.a;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.digests.Blake3Digest;
import org.bouncycastle.crypto.params.Blake3Parameters;
import org.bouncycastle.crypto.params.KeyParameter;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class Blake3Mac implements Mac {
    private final Blake3Digest theDigest;

    public Blake3Mac(Blake3Digest blake3Digest) {
        this.theDigest = blake3Digest;
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i3) {
        return this.theDigest.doFinal(bArr, i3);
    }

    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return this.theDigest.getAlgorithmName() + StubApp.getString2(17481);
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return this.theDigest.getDigestSize();
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) {
        CipherParameters key = cipherParameters instanceof KeyParameter ? Blake3Parameters.key(((KeyParameter) cipherParameters).getKey()) : cipherParameters;
        if (!(key instanceof Blake3Parameters)) {
            throw new IllegalArgumentException(a.g(StubApp.getString2(29017), cipherParameters));
        }
        Blake3Parameters blake3Parameters = (Blake3Parameters) key;
        if (blake3Parameters.getKey() == null) {
            throw new IllegalArgumentException(StubApp.getString2(29016));
        }
        this.theDigest.init(blake3Parameters);
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        this.theDigest.reset();
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b2) {
        this.theDigest.update(b2);
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i3, int i10) {
        this.theDigest.update(bArr, i3, i10);
    }
}
