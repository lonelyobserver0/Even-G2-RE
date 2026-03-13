package org.bouncycastle.operator.bc;

import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.Signer;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BcSignerOutputStream extends OutputStream {
    private Signer sig;

    public BcSignerOutputStream(Signer signer) {
        this.sig = signer;
    }

    public byte[] getSignature() throws CryptoException {
        return this.sig.generateSignature();
    }

    public boolean verify(byte[] bArr) {
        return this.sig.verifySignature(bArr);
    }

    @Override // java.io.OutputStream
    public void write(int i3) throws IOException {
        this.sig.update((byte) i3);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.sig.update(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i3, int i10) throws IOException {
        this.sig.update(bArr, i3, i10);
    }
}
