package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CipherParameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class KeyParameter implements CipherParameters {
    private byte[] key;

    public KeyParameter(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public byte[] getKey() {
        return this.key;
    }

    public KeyParameter(byte[] bArr, int i3, int i10) {
        byte[] bArr2 = new byte[i10];
        this.key = bArr2;
        System.arraycopy(bArr, i3, bArr2, 0, i10);
    }
}
