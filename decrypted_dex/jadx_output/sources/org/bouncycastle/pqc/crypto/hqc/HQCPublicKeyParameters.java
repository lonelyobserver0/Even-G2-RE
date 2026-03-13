package org.bouncycastle.pqc.crypto.hqc;

import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class HQCPublicKeyParameters extends HQCKeyParameters {
    private byte[] pk;

    public HQCPublicKeyParameters(HQCParameters hQCParameters, byte[] bArr) {
        super(true, hQCParameters);
        this.pk = Arrays.clone(bArr);
    }

    public byte[] getEncoded() {
        return getPublicKey();
    }

    public byte[] getPublicKey() {
        return Arrays.clone(this.pk);
    }
}
