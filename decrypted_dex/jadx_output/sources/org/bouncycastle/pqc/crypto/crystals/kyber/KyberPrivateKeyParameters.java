package org.bouncycastle.pqc.crypto.crystals.kyber;

import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class KyberPrivateKeyParameters extends KyberKeyParameters {
    final byte[] hpk;
    final byte[] nonce;
    final byte[] rho;

    /* renamed from: s, reason: collision with root package name */
    final byte[] f19380s;

    /* renamed from: t, reason: collision with root package name */
    final byte[] f19381t;

    public KyberPrivateKeyParameters(KyberParameters kyberParameters, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        super(true, kyberParameters);
        this.f19380s = Arrays.clone(bArr);
        this.hpk = Arrays.clone(bArr2);
        this.nonce = Arrays.clone(bArr3);
        this.f19381t = Arrays.clone(bArr4);
        this.rho = Arrays.clone(bArr5);
    }

    public byte[] getEncoded() {
        return getPrivateKey();
    }

    public byte[] getHPK() {
        return Arrays.clone(this.hpk);
    }

    public byte[] getNonce() {
        return Arrays.clone(this.nonce);
    }

    public byte[] getPrivateKey() {
        return Arrays.concatenate(this.f19380s, getPublicKey(), this.hpk, this.nonce);
    }

    public byte[] getPublicKey() {
        return Arrays.concatenate(this.f19381t, this.rho);
    }

    public byte[] getRho() {
        return Arrays.clone(this.rho);
    }

    public byte[] getS() {
        return Arrays.clone(this.f19380s);
    }

    public byte[] getT() {
        return Arrays.clone(this.f19381t);
    }
}
