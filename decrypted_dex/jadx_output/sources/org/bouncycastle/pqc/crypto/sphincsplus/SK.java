package org.bouncycastle.pqc.crypto.sphincsplus;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class SK {
    final byte[] prf;
    final byte[] seed;

    public SK(byte[] bArr, byte[] bArr2) {
        this.seed = bArr;
        this.prf = bArr2;
    }
}
