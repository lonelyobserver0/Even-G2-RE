package org.bouncycastle.crypto.io;

import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.crypto.Signer;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SignerOutputStream extends OutputStream {
    protected Signer signer;

    public SignerOutputStream(Signer signer) {
        this.signer = signer;
    }

    public Signer getSigner() {
        return this.signer;
    }

    @Override // java.io.OutputStream
    public void write(int i3) throws IOException {
        this.signer.update((byte) i3);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i3, int i10) throws IOException {
        this.signer.update(bArr, i3, i10);
    }
}
