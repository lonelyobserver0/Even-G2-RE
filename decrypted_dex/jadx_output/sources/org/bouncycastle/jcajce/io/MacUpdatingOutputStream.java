package org.bouncycastle.jcajce.io;

import java.io.IOException;
import java.io.OutputStream;
import javax.crypto.Mac;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class MacUpdatingOutputStream extends OutputStream {
    private Mac mac;

    public MacUpdatingOutputStream(Mac mac) {
        this.mac = mac;
    }

    @Override // java.io.OutputStream
    public void write(int i3) throws IOException {
        this.mac.update((byte) i3);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.mac.update(bArr);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i3, int i10) throws IOException {
        this.mac.update(bArr, i3, i10);
    }
}
