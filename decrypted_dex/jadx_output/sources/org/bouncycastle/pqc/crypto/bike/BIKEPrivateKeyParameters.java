package org.bouncycastle.pqc.crypto.bike;

import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BIKEPrivateKeyParameters extends BIKEKeyParameters {
    private byte[] h0;

    /* renamed from: h1, reason: collision with root package name */
    private byte[] f19365h1;
    private byte[] sigma;

    public BIKEPrivateKeyParameters(BIKEParameters bIKEParameters, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(true, bIKEParameters);
        this.h0 = Arrays.clone(bArr);
        this.f19365h1 = Arrays.clone(bArr2);
        this.sigma = Arrays.clone(bArr3);
    }

    public byte[] getEncoded() {
        return Arrays.concatenate(Arrays.concatenate(this.h0, this.f19365h1), this.sigma);
    }

    public byte[] getH0() {
        return this.h0;
    }

    public byte[] getH1() {
        return this.f19365h1;
    }

    public byte[] getSigma() {
        return this.sigma;
    }
}
