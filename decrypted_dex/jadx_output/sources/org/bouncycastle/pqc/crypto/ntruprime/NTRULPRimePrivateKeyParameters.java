package org.bouncycastle.pqc.crypto.ntruprime;

import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class NTRULPRimePrivateKeyParameters extends NTRULPRimeKeyParameters {
    private final byte[] enca;
    private final byte[] hash;
    private final byte[] pk;
    private final byte[] rho;

    public NTRULPRimePrivateKeyParameters(NTRULPRimeParameters nTRULPRimeParameters, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(true, nTRULPRimeParameters);
        this.enca = Arrays.clone(bArr);
        this.pk = Arrays.clone(bArr2);
        this.rho = Arrays.clone(bArr3);
        this.hash = Arrays.clone(bArr4);
    }

    public byte[] getEnca() {
        return Arrays.clone(this.enca);
    }

    public byte[] getEncoded() {
        byte[] bArr = new byte[getParameters().getPrivateKeyBytes()];
        byte[] bArr2 = this.enca;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        byte[] bArr3 = this.pk;
        System.arraycopy(bArr3, 0, bArr, this.enca.length, bArr3.length);
        byte[] bArr4 = this.rho;
        System.arraycopy(bArr4, 0, bArr, this.enca.length + this.pk.length, bArr4.length);
        byte[] bArr5 = this.hash;
        System.arraycopy(bArr5, 0, bArr, this.enca.length + this.pk.length + this.rho.length, bArr5.length);
        return bArr;
    }

    public byte[] getHash() {
        return Arrays.clone(this.hash);
    }

    public byte[] getPk() {
        return Arrays.clone(this.pk);
    }

    public byte[] getRho() {
        return Arrays.clone(this.rho);
    }
}
