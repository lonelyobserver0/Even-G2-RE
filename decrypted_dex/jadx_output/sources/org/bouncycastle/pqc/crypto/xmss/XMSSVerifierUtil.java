package org.bouncycastle.pqc.crypto.xmss;

import com.stub.StubApp;
import org.bouncycastle.pqc.crypto.xmss.HashTreeAddress;
import org.bouncycastle.pqc.crypto.xmss.LTreeAddress;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class XMSSVerifierUtil {
    public static XMSSNode getRootNodeFromSignature(WOTSPlus wOTSPlus, int i3, byte[] bArr, XMSSReducedSignature xMSSReducedSignature, OTSHashAddress oTSHashAddress, int i10) {
        if (bArr.length != wOTSPlus.getParams().getTreeDigestSize()) {
            throw new IllegalArgumentException(StubApp.getString2(34308));
        }
        if (xMSSReducedSignature == null) {
            throw new NullPointerException(StubApp.getString2(34307));
        }
        if (oTSHashAddress == null) {
            throw new NullPointerException(StubApp.getString2(34240));
        }
        LTreeAddress lTreeAddress = (LTreeAddress) new LTreeAddress.Builder().withLayerAddress(oTSHashAddress.getLayerAddress()).withTreeAddress(oTSHashAddress.getTreeAddress()).withLTreeAddress(oTSHashAddress.getOTSAddress()).build();
        HashTreeAddress hashTreeAddress = (HashTreeAddress) new HashTreeAddress.Builder().withLayerAddress(oTSHashAddress.getLayerAddress()).withTreeAddress(oTSHashAddress.getTreeAddress()).withTreeIndex(oTSHashAddress.getOTSAddress()).build();
        XMSSNode[] xMSSNodeArr = new XMSSNode[2];
        xMSSNodeArr[0] = XMSSNodeUtil.lTree(wOTSPlus, wOTSPlus.getPublicKeyFromSignature(bArr, xMSSReducedSignature.getWOTSPlusSignature(), oTSHashAddress), lTreeAddress);
        for (int i11 = 0; i11 < i3; i11++) {
            HashTreeAddress hashTreeAddress2 = (HashTreeAddress) new HashTreeAddress.Builder().withLayerAddress(hashTreeAddress.getLayerAddress()).withTreeAddress(hashTreeAddress.getTreeAddress()).withTreeHeight(i11).withTreeIndex(hashTreeAddress.getTreeIndex()).withKeyAndMask(hashTreeAddress.getKeyAndMask()).build();
            if (Math.floor(i10 / (1 << i11)) % 2.0d == 0.0d) {
                hashTreeAddress = (HashTreeAddress) new HashTreeAddress.Builder().withLayerAddress(hashTreeAddress2.getLayerAddress()).withTreeAddress(hashTreeAddress2.getTreeAddress()).withTreeHeight(hashTreeAddress2.getTreeHeight()).withTreeIndex(hashTreeAddress2.getTreeIndex() / 2).withKeyAndMask(hashTreeAddress2.getKeyAndMask()).build();
                XMSSNode randomizeHash = XMSSNodeUtil.randomizeHash(wOTSPlus, xMSSNodeArr[0], xMSSReducedSignature.getAuthPath().get(i11), hashTreeAddress);
                xMSSNodeArr[1] = randomizeHash;
                xMSSNodeArr[1] = new XMSSNode(randomizeHash.getHeight() + 1, xMSSNodeArr[1].getValue());
            } else {
                hashTreeAddress = (HashTreeAddress) new HashTreeAddress.Builder().withLayerAddress(hashTreeAddress2.getLayerAddress()).withTreeAddress(hashTreeAddress2.getTreeAddress()).withTreeHeight(hashTreeAddress2.getTreeHeight()).withTreeIndex((hashTreeAddress2.getTreeIndex() - 1) / 2).withKeyAndMask(hashTreeAddress2.getKeyAndMask()).build();
                XMSSNode randomizeHash2 = XMSSNodeUtil.randomizeHash(wOTSPlus, xMSSReducedSignature.getAuthPath().get(i11), xMSSNodeArr[0], hashTreeAddress);
                xMSSNodeArr[1] = randomizeHash2;
                xMSSNodeArr[1] = new XMSSNode(randomizeHash2.getHeight() + 1, xMSSNodeArr[1].getValue());
            }
            xMSSNodeArr[0] = xMSSNodeArr[1];
        }
        return xMSSNodeArr[0];
    }
}
