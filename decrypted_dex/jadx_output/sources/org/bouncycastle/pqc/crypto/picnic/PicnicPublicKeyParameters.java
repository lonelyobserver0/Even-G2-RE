package org.bouncycastle.pqc.crypto.picnic;

import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class PicnicPublicKeyParameters extends PicnicKeyParameters {
    private final byte[] publicKey;

    public PicnicPublicKeyParameters(PicnicParameters picnicParameters, byte[] bArr) {
        super(false, picnicParameters);
        this.publicKey = Arrays.clone(bArr);
    }

    public byte[] getEncoded() {
        return Arrays.clone(this.publicKey);
    }
}
