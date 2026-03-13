package org.bouncycastle.crypto.macs;

import com.stub.StubApp;
import org.bouncycastle.asn1.a;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.digests.SkeinEngine;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.SkeinParameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SkeinMac implements Mac {
    public static final int SKEIN_1024 = 1024;
    public static final int SKEIN_256 = 256;
    public static final int SKEIN_512 = 512;
    private SkeinEngine engine;

    public SkeinMac(int i3, int i10) {
        this.engine = new SkeinEngine(i3, i10);
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i3) {
        return this.engine.doFinal(bArr, i3);
    }

    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return StubApp.getString2(29055) + (this.engine.getBlockSize() * 8) + StubApp.getString2(999) + (this.engine.getOutputSize() * 8);
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return this.engine.getOutputSize();
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) throws IllegalArgumentException {
        SkeinParameters build;
        if (cipherParameters instanceof SkeinParameters) {
            build = (SkeinParameters) cipherParameters;
        } else {
            if (!(cipherParameters instanceof KeyParameter)) {
                throw new IllegalArgumentException(a.g(StubApp.getString2(29057), cipherParameters));
            }
            build = new SkeinParameters.Builder().setKey(((KeyParameter) cipherParameters).getKey()).build();
        }
        if (build.getKey() == null) {
            throw new IllegalArgumentException(StubApp.getString2(29056));
        }
        this.engine.init(build);
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        this.engine.reset();
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b2) {
        this.engine.update(b2);
    }

    public SkeinMac(SkeinMac skeinMac) {
        this.engine = new SkeinEngine(skeinMac.engine);
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i3, int i10) {
        this.engine.update(bArr, i3, i10);
    }
}
