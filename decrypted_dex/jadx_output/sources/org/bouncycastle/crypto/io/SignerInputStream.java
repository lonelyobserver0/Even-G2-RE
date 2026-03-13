package org.bouncycastle.crypto.io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.crypto.Signer;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SignerInputStream extends FilterInputStream {
    protected Signer signer;

    public SignerInputStream(InputStream inputStream, Signer signer) {
        super(inputStream);
        this.signer = signer;
    }

    public Signer getSigner() {
        return this.signer;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int read = ((FilterInputStream) this).in.read();
        if (read >= 0) {
            this.signer.update((byte) read);
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i3, int i10) throws IOException {
        int read = ((FilterInputStream) this).in.read(bArr, i3, i10);
        if (read > 0) {
            this.signer.update(bArr, i3, read);
        }
        return read;
    }
}
