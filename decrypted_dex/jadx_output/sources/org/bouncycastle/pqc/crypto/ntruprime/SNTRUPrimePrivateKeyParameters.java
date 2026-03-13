package org.bouncycastle.pqc.crypto.ntruprime;

import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SNTRUPrimePrivateKeyParameters extends SNTRUPrimeKeyParameters {

    /* renamed from: f, reason: collision with root package name */
    private final byte[] f19459f;
    private final byte[] ginv;
    private final byte[] hash;
    private final byte[] pk;
    private final byte[] rho;

    public SNTRUPrimePrivateKeyParameters(SNTRUPrimeParameters sNTRUPrimeParameters, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        super(true, sNTRUPrimeParameters);
        this.f19459f = Arrays.clone(bArr);
        this.ginv = Arrays.clone(bArr2);
        this.pk = Arrays.clone(bArr3);
        this.rho = Arrays.clone(bArr4);
        this.hash = Arrays.clone(bArr5);
    }

    public byte[] getEncoded() {
        byte[] bArr = new byte[getParameters().getPrivateKeyBytes()];
        byte[] bArr2 = this.f19459f;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        byte[] bArr3 = this.ginv;
        System.arraycopy(bArr3, 0, bArr, this.f19459f.length, bArr3.length);
        byte[] bArr4 = this.pk;
        System.arraycopy(bArr4, 0, bArr, this.f19459f.length + this.ginv.length, bArr4.length);
        byte[] bArr5 = this.rho;
        System.arraycopy(bArr5, 0, bArr, this.f19459f.length + this.ginv.length + this.pk.length, bArr5.length);
        byte[] bArr6 = this.hash;
        System.arraycopy(bArr6, 0, bArr, this.f19459f.length + this.ginv.length + this.pk.length + this.rho.length, bArr6.length);
        return bArr;
    }

    public byte[] getF() {
        return Arrays.clone(this.f19459f);
    }

    public byte[] getGinv() {
        return Arrays.clone(this.ginv);
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
