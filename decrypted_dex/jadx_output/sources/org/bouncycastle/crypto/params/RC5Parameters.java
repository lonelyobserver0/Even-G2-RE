package org.bouncycastle.crypto.params;

import com.stub.StubApp;
import org.bouncycastle.crypto.CipherParameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class RC5Parameters implements CipherParameters {
    private byte[] key;
    private int rounds;

    public RC5Parameters(byte[] bArr, int i3) {
        if (bArr.length > 255) {
            throw new IllegalArgumentException(StubApp.getString2(29222));
        }
        byte[] bArr2 = new byte[bArr.length];
        this.key = bArr2;
        this.rounds = i3;
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
    }

    public byte[] getKey() {
        return this.key;
    }

    public int getRounds() {
        return this.rounds;
    }
}
