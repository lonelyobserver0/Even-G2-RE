package org.bouncycastle.jcajce.io;

import java.io.IOException;
import java.io.OutputStream;
import java.security.Signature;
import java.security.SignatureException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class SignatureUpdatingOutputStream extends OutputStream {
    private Signature sig;

    public SignatureUpdatingOutputStream(Signature signature) {
        this.sig = signature;
    }

    @Override // java.io.OutputStream
    public void write(int i3) throws IOException {
        try {
            this.sig.update((byte) i3);
        } catch (SignatureException e10) {
            throw new IOException(e10.getMessage());
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        try {
            this.sig.update(bArr);
        } catch (SignatureException e10) {
            throw new IOException(e10.getMessage());
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i3, int i10) throws IOException {
        try {
            this.sig.update(bArr, i3, i10);
        } catch (SignatureException e10) {
            throw new IOException(e10.getMessage());
        }
    }
}
