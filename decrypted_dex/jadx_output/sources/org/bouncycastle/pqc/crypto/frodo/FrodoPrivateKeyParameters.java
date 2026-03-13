package org.bouncycastle.pqc.crypto.frodo;

import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class FrodoPrivateKeyParameters extends FrodoKeyParameters {
    private byte[] privateKey;

    public FrodoPrivateKeyParameters(FrodoParameters frodoParameters, byte[] bArr) {
        super(true, frodoParameters);
        this.privateKey = Arrays.clone(bArr);
    }

    public byte[] getEncoded() {
        return Arrays.clone(this.privateKey);
    }

    public byte[] getPrivateKey() {
        return Arrays.clone(this.privateKey);
    }
}
