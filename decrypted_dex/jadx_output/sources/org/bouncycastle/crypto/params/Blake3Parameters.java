package org.bouncycastle.crypto.params;

import com.stub.StubApp;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class Blake3Parameters implements CipherParameters {
    private static final int KEYLEN = 32;
    private byte[] theContext;
    private byte[] theKey;

    public static Blake3Parameters context(byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException(StubApp.getString2(29178));
        }
        Blake3Parameters blake3Parameters = new Blake3Parameters();
        blake3Parameters.theContext = Arrays.clone(bArr);
        return blake3Parameters;
    }

    public static Blake3Parameters key(byte[] bArr) {
        if (bArr == null || bArr.length != 32) {
            throw new IllegalArgumentException(StubApp.getString2(29179));
        }
        Blake3Parameters blake3Parameters = new Blake3Parameters();
        blake3Parameters.theKey = Arrays.clone(bArr);
        return blake3Parameters;
    }

    public void clearKey() {
        Arrays.fill(this.theKey, (byte) 0);
    }

    public byte[] getContext() {
        return Arrays.clone(this.theContext);
    }

    public byte[] getKey() {
        return Arrays.clone(this.theKey);
    }
}
