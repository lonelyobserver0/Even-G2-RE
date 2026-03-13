package org.bouncycastle.jcajce.spec;

import com.stub.StubApp;
import java.security.spec.KeySpec;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class TLSKeyMaterialSpec implements KeySpec {
    public static final String KEY_EXPANSION = StubApp.getString2(32449);
    public static final String MASTER_SECRET = StubApp.getString2(32450);
    private final String label;
    private final int length;
    private final byte[] secret;
    private final byte[] seed;

    public TLSKeyMaterialSpec(byte[] bArr, String str, int i3, byte[]... bArr2) {
        this.secret = Arrays.clone(bArr);
        this.label = str;
        this.length = i3;
        this.seed = Arrays.concatenate(bArr2);
    }

    public String getLabel() {
        return this.label;
    }

    public int getLength() {
        return this.length;
    }

    public byte[] getSecret() {
        return Arrays.clone(this.secret);
    }

    public byte[] getSeed() {
        return Arrays.clone(this.seed);
    }
}
