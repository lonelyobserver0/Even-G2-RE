package org.bouncycastle.pqc.crypto.xmss;

import com.stub.StubApp;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.crypto.StateAwareMessageSigner;
import org.bouncycastle.pqc.crypto.xmss.OTSHashAddress;
import org.bouncycastle.pqc.crypto.xmss.XMSSMTSignature;
import org.bouncycastle.pqc.crypto.xmss.XMSSReducedSignature;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class XMSSMTSigner implements StateAwareMessageSigner {
    private boolean hasGenerated;
    private boolean initSign;
    private XMSSMTParameters params;
    private XMSSMTPrivateKeyParameters privateKey;
    private XMSSMTPublicKeyParameters publicKey;
    private WOTSPlus wotsPlus;
    private XMSSParameters xmssParams;

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
        XMSSMTPrivateKeyParameters xMSSMTPrivateKeyParameters = this.privateKey;
        if (xMSSMTPrivateKeyParameters == null) {
            throw new IllegalStateException(StubApp.getString2(34351));
        }
        synchronized (xMSSMTPrivateKeyParameters) {
            if (this.privateKey.getUsagesRemaining() <= 0) {
                throw new IllegalStateException(StubApp.getString2("34350"));
            }
            if (this.privateKey.getBDSState().isEmpty()) {
                throw new IllegalStateException(StubApp.getString2("34349"));
            }
            try {
                BDSStateMap bDSState = this.privateKey.getBDSState();
                long index = this.privateKey.getIndex();
                this.params.getHeight();
                int height = this.xmssParams.getHeight();
                if (this.privateKey.getUsagesRemaining() <= 0) {
                    throw new IllegalStateException(StubApp.getString2("34233"));
                }
                byte[] PRF = this.wotsPlus.getKhf().PRF(this.privateKey.getSecretKeyPRF(), XMSSUtil.toBytesBigEndian(index, 32));
                byte[] HMsg = this.wotsPlus.getKhf().HMsg(Arrays.concatenate(PRF, this.privateKey.getRoot(), XMSSUtil.toBytesBigEndian(index, this.params.getTreeDigestSize())), bArr);
                this.hasGenerated = true;
                XMSSMTSignature build = new XMSSMTSignature.Builder(this.params).withIndex(index).withRandom(PRF).build();
                long treeIndex = XMSSUtil.getTreeIndex(index, height);
                int leafIndex = XMSSUtil.getLeafIndex(index, height);
                this.wotsPlus.importKeys(new byte[this.params.getTreeDigestSize()], this.privateKey.getPublicSeed());
                OTSHashAddress oTSHashAddress = (OTSHashAddress) new OTSHashAddress.Builder().withTreeAddress(treeIndex).withOTSAddress(leafIndex).build();
                if (bDSState.get(0) == null || leafIndex == 0) {
                    bDSState.put(0, new BDS(this.xmssParams, this.privateKey.getPublicSeed(), this.privateKey.getSecretKeySeed(), oTSHashAddress));
                }
                build.getReducedSignatures().add(new XMSSReducedSignature.Builder(this.xmssParams).withWOTSPlusSignature(wotsSign(HMsg, oTSHashAddress)).withAuthPath(bDSState.get(0).getAuthenticationPath()).build());
                for (int i3 = 1; i3 < this.params.getLayers(); i3++) {
                    XMSSNode root = bDSState.get(i3 - 1).getRoot();
                    int leafIndex2 = XMSSUtil.getLeafIndex(treeIndex, height);
                    treeIndex = XMSSUtil.getTreeIndex(treeIndex, height);
                    OTSHashAddress oTSHashAddress2 = (OTSHashAddress) new OTSHashAddress.Builder().withLayerAddress(i3).withTreeAddress(treeIndex).withOTSAddress(leafIndex2).build();
                    WOTSPlusSignature wotsSign = wotsSign(root.getValue(), oTSHashAddress2);
                    if (bDSState.get(i3) != null && !XMSSUtil.isNewBDSInitNeeded(index, height, i3)) {
                        build.getReducedSignatures().add(new XMSSReducedSignature.Builder(this.xmssParams).withWOTSPlusSignature(wotsSign).withAuthPath(bDSState.get(i3).getAuthenticationPath()).build());
                    }
                    bDSState.put(i3, new BDS(this.xmssParams, this.privateKey.getPublicSeed(), this.privateKey.getSecretKeySeed(), oTSHashAddress2));
                    build.getReducedSignatures().add(new XMSSReducedSignature.Builder(this.xmssParams).withWOTSPlusSignature(wotsSign).withAuthPath(bDSState.get(i3).getAuthenticationPath()).build());
                }
                byteArray = build.toByteArray();
                this.privateKey.rollKey();
            } catch (Throwable th) {
                this.privateKey.rollKey();
                throw th;
            }
        }
        return byteArray;
    }

    @Override // org.bouncycastle.pqc.crypto.StateAwareMessageSigner
    public AsymmetricKeyParameter getUpdatedPrivateKey() {
        XMSSMTPrivateKeyParameters xMSSMTPrivateKeyParameters;
        XMSSMTPrivateKeyParameters nextKey;
        if (this.hasGenerated) {
            xMSSMTPrivateKeyParameters = this.privateKey;
            nextKey = null;
        } else {
            xMSSMTPrivateKeyParameters = this.privateKey;
            if (xMSSMTPrivateKeyParameters == null) {
                return xMSSMTPrivateKeyParameters;
            }
            nextKey = xMSSMTPrivateKeyParameters.getNextKey();
        }
        this.privateKey = nextKey;
        return xMSSMTPrivateKeyParameters;
    }

    public long getUsagesRemaining() {
        return this.privateKey.getUsagesRemaining();
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public void init(boolean z2, CipherParameters cipherParameters) {
        XMSSMTParameters parameters;
        if (z2) {
            this.initSign = true;
            this.hasGenerated = false;
            XMSSMTPrivateKeyParameters xMSSMTPrivateKeyParameters = (XMSSMTPrivateKeyParameters) cipherParameters;
            this.privateKey = xMSSMTPrivateKeyParameters;
            parameters = xMSSMTPrivateKeyParameters.getParameters();
        } else {
            this.initSign = false;
            XMSSMTPublicKeyParameters xMSSMTPublicKeyParameters = (XMSSMTPublicKeyParameters) cipherParameters;
            this.publicKey = xMSSMTPublicKeyParameters;
            parameters = xMSSMTPublicKeyParameters.getParameters();
        }
        this.params = parameters;
        this.xmssParams = parameters.getXMSSParameters();
        this.wotsPlus = this.params.getWOTSPlus();
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public boolean verifySignature(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException(StubApp.getString2(34332));
        }
        if (bArr2 == null) {
            throw new NullPointerException(StubApp.getString2(34307));
        }
        if (this.publicKey == null) {
            throw new NullPointerException(StubApp.getString2(34326));
        }
        XMSSMTSignature build = new XMSSMTSignature.Builder(this.params).withSignature(bArr2).build();
        byte[] HMsg = this.wotsPlus.getKhf().HMsg(Arrays.concatenate(build.getRandom(), this.publicKey.getRoot(), XMSSUtil.toBytesBigEndian(build.getIndex(), this.params.getTreeDigestSize())), bArr);
        long index = build.getIndex();
        int height = this.xmssParams.getHeight();
        long treeIndex = XMSSUtil.getTreeIndex(index, height);
        int leafIndex = XMSSUtil.getLeafIndex(index, height);
        this.wotsPlus.importKeys(new byte[this.params.getTreeDigestSize()], this.publicKey.getPublicSeed());
        OTSHashAddress oTSHashAddress = (OTSHashAddress) new OTSHashAddress.Builder().withTreeAddress(treeIndex).withOTSAddress(leafIndex).build();
        XMSSNode rootNodeFromSignature = XMSSVerifierUtil.getRootNodeFromSignature(this.wotsPlus, height, HMsg, build.getReducedSignatures().get(0), oTSHashAddress, leafIndex);
        int i3 = 1;
        while (i3 < this.params.getLayers()) {
            XMSSReducedSignature xMSSReducedSignature = build.getReducedSignatures().get(i3);
            int leafIndex2 = XMSSUtil.getLeafIndex(treeIndex, height);
            long treeIndex2 = XMSSUtil.getTreeIndex(treeIndex, height);
            rootNodeFromSignature = XMSSVerifierUtil.getRootNodeFromSignature(this.wotsPlus, height, rootNodeFromSignature.getValue(), xMSSReducedSignature, (OTSHashAddress) new OTSHashAddress.Builder().withLayerAddress(i3).withTreeAddress(treeIndex2).withOTSAddress(leafIndex2).build(), leafIndex2);
            i3++;
            treeIndex = treeIndex2;
        }
        return Arrays.constantTimeAreEqual(rootNodeFromSignature.getValue(), this.publicKey.getRoot());
    }
}
