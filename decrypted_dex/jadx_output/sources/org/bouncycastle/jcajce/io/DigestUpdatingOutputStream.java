package org.bouncycastle.jcajce.io;

import java.io.IOException;
import java.io.OutputStream;
import java.security.MessageDigest;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class DigestUpdatingOutputStream extends OutputStream {
    private MessageDigest digest;

    public DigestUpdatingOutputStream(MessageDigest messageDigest) {
        this.digest = messageDigest;
    }

    @Override // java.io.OutputStream
    public void write(int i3) throws IOException {
        this.digest.update((byte) i3);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.digest.update(bArr);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i3, int i10) throws IOException {
        this.digest.update(bArr, i3, i10);
    }
}
