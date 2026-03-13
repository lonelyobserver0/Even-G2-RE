package org.bouncycastle.pqc.crypto.crystals.dilithium;

import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DilithiumPublicKeyParameters extends DilithiumKeyParameters {
    final byte[] rho;

    /* renamed from: t1, reason: collision with root package name */
    final byte[] f19378t1;

    public DilithiumPublicKeyParameters(DilithiumParameters dilithiumParameters, byte[] bArr) {
        super(false, dilithiumParameters);
        this.rho = Arrays.copyOfRange(bArr, 0, 32);
        this.f19378t1 = Arrays.copyOfRange(bArr, 32, bArr.length);
    }

    public byte[] getEncoded() {
        return Arrays.concatenate(this.rho, this.f19378t1);
    }

    public byte[] getRho() {
        return Arrays.clone(this.rho);
    }

    public byte[] getT1() {
        return Arrays.clone(this.f19378t1);
    }

    public DilithiumPublicKeyParameters(DilithiumParameters dilithiumParameters, byte[] bArr, byte[] bArr2) {
        super(false, dilithiumParameters);
        this.rho = Arrays.clone(bArr);
        this.f19378t1 = Arrays.clone(bArr2);
    }
}
