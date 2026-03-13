package org.bouncycastle.pqc.crypto.lms;

import org.bouncycastle.crypto.Digest;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class LMOtsPrivateKey {

    /* renamed from: I, reason: collision with root package name */
    private final byte[] f19429I;
    private final byte[] masterSecret;
    private final LMOtsParameters parameter;

    /* renamed from: q, reason: collision with root package name */
    private final int f19430q;

    public LMOtsPrivateKey(LMOtsParameters lMOtsParameters, byte[] bArr, int i3, byte[] bArr2) {
        this.parameter = lMOtsParameters;
        this.f19429I = bArr;
        this.f19430q = i3;
        this.masterSecret = bArr2;
    }

    public SeedDerive getDerivationFunction() {
        SeedDerive seedDerive = new SeedDerive(this.f19429I, this.masterSecret, DigestUtil.getDigest(this.parameter.getDigestOID()));
        seedDerive.setQ(this.f19430q);
        return seedDerive;
    }

    public byte[] getI() {
        return this.f19429I;
    }

    public byte[] getMasterSecret() {
        return this.masterSecret;
    }

    public LMOtsParameters getParameter() {
        return this.parameter;
    }

    public int getQ() {
        return this.f19430q;
    }

    public LMSContext getSignatureContext(LMSigParameters lMSigParameters, byte[][] bArr) {
        byte[] bArr2 = new byte[32];
        SeedDerive derivationFunction = getDerivationFunction();
        derivationFunction.setJ(-3);
        derivationFunction.deriveSeed(bArr2, false);
        Digest digest = DigestUtil.getDigest(this.parameter.getDigestOID());
        LmsUtils.byteArray(getI(), digest);
        LmsUtils.u32str(getQ(), digest);
        LmsUtils.u16str((short) -32383, digest);
        LmsUtils.byteArray(bArr2, digest);
        return new LMSContext(this, lMSigParameters, digest, bArr2, bArr);
    }
}
