package org.bouncycastle.pqc.crypto.picnic;

import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class PicnicPrivateKeyParameters extends PicnicKeyParameters {
    private final byte[] privateKey;

    public PicnicPrivateKeyParameters(PicnicParameters picnicParameters, byte[] bArr) {
        super(true, picnicParameters);
        this.privateKey = Arrays.clone(bArr);
    }

    public byte[] getEncoded() {
        return Arrays.clone(this.privateKey);
    }
}
