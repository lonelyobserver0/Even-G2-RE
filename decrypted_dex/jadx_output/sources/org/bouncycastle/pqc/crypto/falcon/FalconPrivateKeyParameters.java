package org.bouncycastle.pqc.crypto.falcon;

import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class FalconPrivateKeyParameters extends FalconKeyParameters {

    /* renamed from: F, reason: collision with root package name */
    private final byte[] f19385F;

    /* renamed from: f, reason: collision with root package name */
    private final byte[] f19386f;

    /* renamed from: g, reason: collision with root package name */
    private final byte[] f19387g;
    private final byte[] pk;

    public FalconPrivateKeyParameters(FalconParameters falconParameters, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(true, falconParameters);
        this.f19386f = Arrays.clone(bArr);
        this.f19387g = Arrays.clone(bArr2);
        this.f19385F = Arrays.clone(bArr3);
        this.pk = Arrays.clone(bArr4);
    }

    public byte[] getEncoded() {
        return Arrays.concatenate(this.f19386f, this.f19387g, this.f19385F);
    }

    public byte[] getG() {
        return Arrays.clone(this.f19387g);
    }

    public byte[] getPublicKey() {
        return Arrays.clone(this.pk);
    }

    public byte[] getSpolyF() {
        return Arrays.clone(this.f19385F);
    }

    public byte[] getSpolyf() {
        return Arrays.clone(this.f19386f);
    }
}
