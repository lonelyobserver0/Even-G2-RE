package org.bouncycastle.pqc.crypto.xmss;

import com.stub.StubApp;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.crypto.ExhaustedPrivateKeyException;
import org.bouncycastle.pqc.crypto.StateAwareMessageSigner;
import org.bouncycastle.pqc.crypto.xmss.OTSHashAddress;
import org.bouncycastle.pqc.crypto.xmss.XMSSSignature;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class XMSSSigner implements StateAwareMessageSigner {
    private boolean hasGenerated;
    private boolean initSign;
    private KeyedHashFunctions khf;
    private XMSSParameters params;
    private XMSSPrivateKeyParameters privateKey;
    private XMSSPublicKeyParameters publicKey;
    private WOTSPlus wotsPlus;

    private WOTSPlusSignature wotsSign(byte[] bArr, OTSHashAddress oTSHashAddress) {
        if (bArr.length != this.params.getTreeDigestSize()) {
            throw new IllegalArgumentException(StubApp.getString2(34308));
        }
        if (oTSHashAddress == null) {
            throw new NullPointerException(StubApp.getString2(34240));
        }
        WOTSPlus wOTSPlus = this.wotsPlus;
        wOTSPlus.importKeys(wOTSPlus.getWOTSPlusSecretKey(this.privateKey.getSecretKeySeed(), oTSHashAddress), this.privateKey.getPublicSeed());
        return this.wotsPlus.sign(bArr, oTSHashAddress);
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public byte[] generateSignature(byte[] bArr) {
        byte[] byteArray;
        if (bArr == null) {
            throw new NullPointerException(StubApp.getString2(34332));
        }
        if (!this.initSign) {
            throw new IllegalStateException(StubApp.getString2(34352));
        }
        XMSSPrivateKeyParameters xMSSPrivateKeyParameters = this.privateKey;
        if (xMSSPrivateKeyParameters == null) {
            throw new IllegalStateException(StubApp.getString2(34351));
        }
        synchronized (xMSSPrivateKeyParameters) {
            try {
                if (this.privateKey.getUsagesRemaining() <= 0) {
                    throw new ExhaustedPrivateKeyException(StubApp.getString2("34350"));
                }
                if (this.privateKey.getBDSState().getAuthenticationPath().isEmpty()) {
                    throw new IllegalStateException(StubApp.getString2("34349"));
                }
                try {
                    int index = this.privateKey.getIndex();
                    this.hasGenerated = true;
                    long j = index;
                    byte[] PRF = this.khf.PRF(this.privateKey.getSecretKeyPRF(), XMSSUtil.toBytesBigEndian(j, 32));
                    byteArray = new XMSSSignature.Builder(this.params).withIndex(index).withRandom(PRF).withWOTSPlusSignature(wotsSign(this.khf.HMsg(Arrays.concatenate(PRF, this.privateKey.getRoot(), XMSSUtil.toBytesBigEndian(j, this.params.getTreeDigestSize())), bArr), (OTSHashAddress) new OTSHashAddress.Builder().withOTSAddress(index).build())).withAuthPath(this.privateKey.getBDSState().getAuthenticationPath()).build().toByteArray();
                } finally {
                    this.privateKey.getBDSState().markUsed();
                    this.privateKey.rollKey();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return byteArray;
    }

    @Override // org.bouncycastle.pqc.crypto.StateAwareMessageSigner
    public AsymmetricKeyParameter getUpdatedPrivateKey() {
        XMSSPrivateKeyParameters xMSSPrivateKeyParameters;
        synchronized (this.privateKey) {
            try {
                if (this.hasGenerated) {
                    xMSSPrivateKeyParameters = this.privateKey;
                    this.privateKey = null;
                } else {
                    xMSSPrivateKeyParameters = this.privateKey;
                    if (xMSSPrivateKeyParameters != null) {
                        this.privateKey = xMSSPrivateKeyParameters.getNextKey();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return xMSSPrivateKeyParameters;
    }

    public long getUsagesRemaining() {
        return this.privateKey.getUsagesRemaining();
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public void init(boolean z2, CipherParameters cipherParameters) {
        XMSSParameters parameters;
        if (z2) {
            this.initSign = true;
            this.hasGenerated = false;
            XMSSPrivateKeyParameters xMSSPrivateKeyParameters = (XMSSPrivateKeyParameters) cipherParameters;
            this.privateKey = xMSSPrivateKeyParameters;
            parameters = xMSSPrivateKeyParameters.getParameters();
        } else {
            this.initSign = false;
            XMSSPublicKeyParameters xMSSPublicKeyParameters = (XMSSPublicKeyParameters) cipherParameters;
            this.publicKey = xMSSPublicKeyParameters;
            parameters = xMSSPublicKeyParameters.getParameters();
        }
        this.params = parameters;
        WOTSPlus wOTSPlus = this.params.getWOTSPlus();
        this.wotsPlus = wOTSPlus;
        this.khf = wOTSPlus.getKhf();
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public boolean verifySignature(byte[] bArr, byte[] bArr2) {
        XMSSSignature build = new XMSSSignature.Builder(this.params).withSignature(bArr2).build();
        int index = build.getIndex();
        this.wotsPlus.importKeys(new byte[this.params.getTreeDigestSize()], this.publicKey.getPublicSeed());
        long j = index;
        byte[] HMsg = this.khf.HMsg(Arrays.concatenate(build.getRandom(), this.publicKey.getRoot(), XMSSUtil.toBytesBigEndian(j, this.params.getTreeDigestSize())), bArr);
        int height = this.params.getHeight();
        return Arrays.constantTimeAreEqual(XMSSVerifierUtil.getRootNodeFromSignature(this.wotsPlus, height, HMsg, build, (OTSHashAddress) new OTSHashAddress.Builder().withOTSAddress(index).build(), XMSSUtil.getLeafIndex(j, height)).getValue(), this.publicKey.getRoot());
    }
}
