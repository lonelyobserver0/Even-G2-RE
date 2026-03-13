package org.bouncycastle.pqc.crypto.sphincsplus;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class PK {
    final byte[] root;
    final byte[] seed;

    public PK(byte[] bArr, byte[] bArr2) {
        this.seed = bArr;
        this.root = bArr2;
    }
}
