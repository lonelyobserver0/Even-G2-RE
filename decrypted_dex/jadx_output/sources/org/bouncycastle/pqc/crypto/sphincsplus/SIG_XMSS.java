package org.bouncycastle.pqc.crypto.sphincsplus;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class SIG_XMSS {
    final byte[][] auth;
    final byte[] sig;

    public SIG_XMSS(byte[] bArr, byte[][] bArr2) {
        this.sig = bArr;
        this.auth = bArr2;
    }

    public byte[] getWOTSSig() {
        return this.sig;
    }

    public byte[][] getXMSSAUTH() {
        return this.auth;
    }
}
