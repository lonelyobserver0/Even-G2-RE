package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class IESParameters implements CipherParameters {
    private byte[] derivation;
    private byte[] encoding;
    private int macKeySize;

    public IESParameters(byte[] bArr, byte[] bArr2, int i3) {
        this.derivation = Arrays.clone(bArr);
        this.encoding = Arrays.clone(bArr2);
        this.macKeySize = i3;
    }

    public byte[] getDerivationV() {
        return Arrays.clone(this.derivation);
    }

    public byte[] getEncodingV() {
        return Arrays.clone(this.encoding);
    }

    public int getMacKeySize() {
        return this.macKeySize;
    }
}
