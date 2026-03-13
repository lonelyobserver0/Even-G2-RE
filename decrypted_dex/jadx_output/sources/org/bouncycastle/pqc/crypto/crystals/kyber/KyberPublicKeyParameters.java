package org.bouncycastle.pqc.crypto.crystals.kyber;

import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class KyberPublicKeyParameters extends KyberKeyParameters {
    final byte[] rho;

    /* renamed from: t, reason: collision with root package name */
    final byte[] f19382t;

    public KyberPublicKeyParameters(KyberParameters kyberParameters, byte[] bArr) {
        super(false, kyberParameters);
        this.f19382t = Arrays.copyOfRange(bArr, 0, bArr.length - 32);
        this.rho = Arrays.copyOfRange(bArr, bArr.length - 32, bArr.length);
    }

    public byte[] getEncoded() {
        return getPublicKey();
    }

    public byte[] getPublicKey() {
        return Arrays.concatenate(this.f19382t, this.rho);
    }

    public byte[] getRho() {
        return Arrays.clone(this.rho);
    }

    public byte[] getT() {
        return Arrays.clone(this.f19382t);
    }

    public KyberPublicKeyParameters(KyberParameters kyberParameters, byte[] bArr, byte[] bArr2) {
        super(false, kyberParameters);
        this.f19382t = Arrays.clone(bArr);
        this.rho = Arrays.clone(bArr2);
    }
}
