package org.bouncycastle.cms.jcajce;

import java.io.IOException;
import java.io.OutputStream;
import javax.crypto.Cipher;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class JceAADStream extends OutputStream {
    private static final byte[] SINGLE_BYTE = new byte[1];
    private Cipher cipher;

    public JceAADStream(Cipher cipher) {
        this.cipher = cipher;
    }

    @Override // java.io.OutputStream
    public void write(int i3) throws IOException {
        byte[] bArr = SINGLE_BYTE;
        bArr[0] = (byte) i3;
        this.cipher.updateAAD(bArr, 0, 1);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i3, int i10) throws IOException {
        this.cipher.updateAAD(bArr, i3, i10);
    }
}
