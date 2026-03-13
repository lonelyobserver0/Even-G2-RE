package org.bouncycastle.pqc.crypto.falcon;

import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class FalconPublicKeyParameters extends FalconKeyParameters {

    /* renamed from: H, reason: collision with root package name */
    private byte[] f19388H;

    public FalconPublicKeyParameters(FalconParameters falconParameters, byte[] bArr) {
        super(false, falconParameters);
        this.f19388H = Arrays.clone(bArr);
    }

    public byte[] getH() {
        return Arrays.clone(this.f19388H);
    }
}
