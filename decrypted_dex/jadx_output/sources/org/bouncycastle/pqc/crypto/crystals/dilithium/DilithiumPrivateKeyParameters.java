package org.bouncycastle.pqc.crypto.crystals.dilithium;

import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DilithiumPrivateKeyParameters extends DilithiumKeyParameters {

    /* renamed from: k, reason: collision with root package name */
    final byte[] f19373k;
    final byte[] rho;

    /* renamed from: s1, reason: collision with root package name */
    final byte[] f19374s1;

    /* renamed from: s2, reason: collision with root package name */
    final byte[] f19375s2;

    /* renamed from: t0, reason: collision with root package name */
    final byte[] f19376t0;

    /* renamed from: t1, reason: collision with root package name */
    private final byte[] f19377t1;
    final byte[] tr;

    public DilithiumPrivateKeyParameters(DilithiumParameters dilithiumParameters, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7) {
        super(true, dilithiumParameters);
        this.rho = Arrays.clone(bArr);
        this.f19373k = Arrays.clone(bArr2);
        this.tr = Arrays.clone(bArr3);
        this.f19374s1 = Arrays.clone(bArr4);
        this.f19375s2 = Arrays.clone(bArr5);
        this.f19376t0 = Arrays.clone(bArr6);
        this.f19377t1 = Arrays.clone(bArr7);
    }

    public byte[] getEncoded() {
        return Arrays.concatenate(new byte[][]{this.rho, this.f19373k, this.tr, this.f19374s1, this.f19375s2, this.f19376t0});
    }

    public byte[] getK() {
        return Arrays.clone(this.f19373k);
    }

    public byte[] getPrivateKey() {
        return getEncoded();
    }

    public byte[] getRho() {
        return Arrays.clone(this.rho);
    }

    public byte[] getS1() {
        return Arrays.clone(this.f19374s1);
    }

    public byte[] getS2() {
        return Arrays.clone(this.f19375s2);
    }

    public byte[] getT0() {
        return Arrays.clone(this.f19376t0);
    }

    public byte[] getT1() {
        return this.f19377t1;
    }

    public byte[] getTr() {
        return Arrays.clone(this.tr);
    }
}
