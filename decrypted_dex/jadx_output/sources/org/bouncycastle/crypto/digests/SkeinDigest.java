package org.bouncycastle.crypto.digests;

import com.stub.StubApp;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.crypto.params.SkeinParameters;
import org.bouncycastle.util.Memoable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SkeinDigest implements ExtendedDigest, Memoable {
    public static final int SKEIN_1024 = 1024;
    public static final int SKEIN_256 = 256;
    public static final int SKEIN_512 = 512;
    private SkeinEngine engine;
    private final CryptoServicePurpose purpose;

    public SkeinDigest(int i3, int i10) {
        this(i3, i10, CryptoServicePurpose.ANY);
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new SkeinDigest(this);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i3) {
        return this.engine.doFinal(bArr, i3);
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return StubApp.getString2(28515) + (this.engine.getBlockSize() * 8) + StubApp.getString2(999) + (this.engine.getOutputSize() * 8);
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return this.engine.getBlockSize();
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return this.engine.getOutputSize();
    }

    public void init(SkeinParameters skeinParameters) {
        this.engine.init(skeinParameters);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.engine.reset();
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b2) {
        this.engine.update(b2);
    }

    public SkeinDigest(int i3, int i10, CryptoServicePurpose cryptoServicePurpose) {
        this.engine = new SkeinEngine(i3, i10);
        this.purpose = cryptoServicePurpose;
        init(null);
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(this, getDigestSize() * 4, cryptoServicePurpose));
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        this.engine.reset(((SkeinDigest) memoable).engine);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i3, int i10) {
        this.engine.update(bArr, i3, i10);
    }

    public SkeinDigest(SkeinDigest skeinDigest) {
        this.engine = new SkeinEngine(skeinDigest.engine);
        CryptoServicePurpose cryptoServicePurpose = skeinDigest.purpose;
        this.purpose = cryptoServicePurpose;
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(this, skeinDigest.getDigestSize() * 4, cryptoServicePurpose));
    }
}
