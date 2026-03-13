package org.bouncycastle.pqc.crypto.ntru;

import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class NTRUPrivateKeyParameters extends NTRUKeyParameters {
    final byte[] privateKey;

    public NTRUPrivateKeyParameters(NTRUParameters nTRUParameters, byte[] bArr) {
        super(true, nTRUParameters);
        this.privateKey = Arrays.clone(bArr);
    }

    public byte[] getEncoded() {
        return getPrivateKey();
    }

    public byte[] getPrivateKey() {
        return Arrays.clone(this.privateKey);
    }
}
