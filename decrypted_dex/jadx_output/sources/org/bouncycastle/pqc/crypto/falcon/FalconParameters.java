package org.bouncycastle.pqc.crypto.falcon;

import com.stub.StubApp;
import org.bouncycastle.crypto.CipherParameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class FalconParameters implements CipherParameters {
    private final int logn;
    private final String name;
    private final int nonce_length;
    public static final FalconParameters falcon_512 = new FalconParameters(StubApp.getString2(34011), 9, 40);
    public static final FalconParameters falcon_1024 = new FalconParameters(StubApp.getString2(34012), 10, 40);

    private FalconParameters(String str, int i3, int i10) {
        if (i3 < 1 || i3 > 10) {
            throw new IllegalArgumentException(StubApp.getString2(34013));
        }
        this.name = str;
        this.logn = i3;
        this.nonce_length = i10;
    }

    public int getLogN() {
        return this.logn;
    }

    public String getName() {
        return this.name;
    }

    public int getNonceLength() {
        return this.nonce_length;
    }
}
