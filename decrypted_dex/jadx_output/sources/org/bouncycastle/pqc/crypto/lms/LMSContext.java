package org.bouncycastle.pqc.crypto.lms;

import org.bouncycastle.crypto.Digest;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class LMSContext implements Digest {

    /* renamed from: C, reason: collision with root package name */
    private final byte[] f19436C;
    private volatile Digest digest;
    private final LMOtsPrivateKey key;
    private final byte[][] path;
    private final LMOtsPublicKey publicKey;
    private final LMSigParameters sigParams;
    private final Object signature;
    private LMSSignedPubKey[] signedPubKeys;

    public LMSContext(LMOtsPrivateKey lMOtsPrivateKey, LMSigParameters lMSigParameters, Digest digest, byte[] bArr, byte[][] bArr2) {
        this.key = lMOtsPrivateKey;
        this.sigParams = lMSigParameters;
        this.digest = digest;
        this.f19436C = bArr;
        this.path = bArr2;
        this.publicKey = null;
        this.signature = null;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i3) {
        return this.digest.doFinal(bArr, i3);
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return this.digest.getAlgorithmName();
    }

    public byte[] getC() {
        return this.f19436C;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return this.digest.getDigestSize();
    }

    public byte[][] getPath() {
        return this.path;
    }

    public LMOtsPrivateKey getPrivateKey() {
        return this.key;
    }

    public LMOtsPublicKey getPublicKey() {
        return this.publicKey;
    }

    public byte[] getQ() {
        byte[] bArr = new byte[34];
        this.digest.doFinal(bArr, 0);
        this.digest = null;
        return bArr;
    }

    public LMSigParameters getSigParams() {
        return this.sigParams;
    }

    public Object getSignature() {
        return this.signature;
    }

    public LMSSignedPubKey[] getSignedPubKeys() {
        return this.signedPubKeys;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.digest.reset();
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b2) {
        this.digest.update(b2);
    }

    public LMSContext withSignedPublicKeys(LMSSignedPubKey[] lMSSignedPubKeyArr) {
        this.signedPubKeys = lMSSignedPubKeyArr;
        return this;
    }

    public LMSContext(LMOtsPublicKey lMOtsPublicKey, Object obj, Digest digest) {
        this.publicKey = lMOtsPublicKey;
        this.signature = obj;
        this.digest = digest;
        this.f19436C = null;
        this.key = null;
        this.sigParams = null;
        this.path = null;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i3, int i10) {
        this.digest.update(bArr, i3, i10);
    }
}
