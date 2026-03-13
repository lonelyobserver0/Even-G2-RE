package org.bouncycastle.crypto.io;

import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.crypto.Digest;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DigestOutputStream extends OutputStream {
    protected Digest digest;

    public DigestOutputStream(Digest digest) {
        this.digest = digest;
    }

    public byte[] getDigest() {
        byte[] bArr = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(bArr, 0);
        return bArr;
    }

    @Override // java.io.OutputStream
    public void write(int i3) throws IOException {
        this.digest.update((byte) i3);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i3, int i10) throws IOException {
        this.digest.update(bArr, i3, i10);
    }
}
