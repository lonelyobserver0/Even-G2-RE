package org.bouncycastle.pqc.crypto.sphincsplus;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class SIG_FORS {
    final byte[][] authPath;
    final byte[] sk;

    public SIG_FORS(byte[] bArr, byte[][] bArr2) {
        this.authPath = bArr2;
        this.sk = bArr;
    }

    public byte[][] getAuthPath() {
        return this.authPath;
    }

    public byte[] getSK() {
        return this.sk;
    }
}
