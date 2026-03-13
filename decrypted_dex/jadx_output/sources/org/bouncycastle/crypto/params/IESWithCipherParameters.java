package org.bouncycastle.crypto.params;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class IESWithCipherParameters extends IESParameters {
    private int cipherKeySize;

    public IESWithCipherParameters(byte[] bArr, byte[] bArr2, int i3, int i10) {
        super(bArr, bArr2, i3);
        this.cipherKeySize = i10;
    }

    public int getCipherKeySize() {
        return this.cipherKeySize;
    }
}
