package org.bouncycastle.pqc.crypto.bike;

import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BIKEPublicKeyParameters extends BIKEKeyParameters {
    byte[] publicKey;

    public BIKEPublicKeyParameters(BIKEParameters bIKEParameters, byte[] bArr) {
        super(false, bIKEParameters);
        this.publicKey = Arrays.clone(bArr);
    }

    public byte[] getEncoded() {
        return Arrays.clone(this.publicKey);
    }
}
