package org.bouncycastle.pqc.crypto.xmss;

import com.stub.StubApp;
import java.io.Serializable;
import java.util.Stack;
import kotlin.jvm.internal.IntCompanionObject;
import org.bouncycastle.pqc.crypto.xmss.HashTreeAddress;
import org.bouncycastle.pqc.crypto.xmss.LTreeAddress;
import org.bouncycastle.pqc.crypto.xmss.OTSHashAddress;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class BDSTreeHash implements Serializable, Cloneable {
    private static final long serialVersionUID = 1;
    private int height;
    private final int initialHeight;
    private int nextIndex;
    private XMSSNode tailNode;
    private boolean initialized = false;
    private boolean finished = false;

    public BDSTreeHash(int i3) {
        this.initialHeight = i3;
    }

    public int getHeight() {
        return (!this.initialized || this.finished) ? IntCompanionObject.MAX_VALUE : this.height;
    }

    public int getIndexLeaf() {
        return this.nextIndex;
    }

    public XMSSNode getTailNode() {
        return this.tailNode;
    }

    public void initialize(int i3) {
        this.tailNode = null;
        this.height = this.initialHeight;
        this.nextIndex = i3;
        this.initialized = true;
        this.finished = false;
    }

    public boolean isFinished() {
        return this.finished;
    }

    public boolean isInitialized() {
        return this.initialized;
    }

    public void setNode(XMSSNode xMSSNode) {
        this.tailNode = xMSSNode;
        int height = xMSSNode.getHeight();
        this.height = height;
        if (height == this.initialHeight) {
            this.finished = true;
        }
    }

    public void update(Stack<XMSSNode> stack, WOTSPlus wOTSPlus, byte[] bArr, byte[] bArr2, OTSHashAddress oTSHashAddress) {
        if (oTSHashAddress == null) {
            throw new NullPointerException(StubApp.getString2(34240));
        }
        if (this.finished || !this.initialized) {
            throw new IllegalStateException(StubApp.getString2(34249));
        }
        OTSHashAddress oTSHashAddress2 = (OTSHashAddress) new OTSHashAddress.Builder().withLayerAddress(oTSHashAddress.getLayerAddress()).withTreeAddress(oTSHashAddress.getTreeAddress()).withOTSAddress(this.nextIndex).withChainAddress(oTSHashAddress.getChainAddress()).withHashAddress(oTSHashAddress.getHashAddress()).withKeyAndMask(oTSHashAddress.getKeyAndMask()).build();
        LTreeAddress lTreeAddress = (LTreeAddress) new LTreeAddress.Builder().withLayerAddress(oTSHashAddress2.getLayerAddress()).withTreeAddress(oTSHashAddress2.getTreeAddress()).withLTreeAddress(this.nextIndex).build();
        HashTreeAddress hashTreeAddress = (HashTreeAddress) new HashTreeAddress.Builder().withLayerAddress(oTSHashAddress2.getLayerAddress()).withTreeAddress(oTSHashAddress2.getTreeAddress()).withTreeIndex(this.nextIndex).build();
        wOTSPlus.importKeys(wOTSPlus.getWOTSPlusSecretKey(bArr2, oTSHashAddress2), bArr);
        XMSSNode lTree = XMSSNodeUtil.lTree(wOTSPlus, wOTSPlus.getPublicKey(oTSHashAddress2), lTreeAddress);
        while (!stack.isEmpty() && stack.peek().getHeight() == lTree.getHeight() && stack.peek().getHeight() != this.initialHeight) {
            HashTreeAddress hashTreeAddress2 = (HashTreeAddress) new HashTreeAddress.Builder().withLayerAddress(hashTreeAddress.getLayerAddress()).withTreeAddress(hashTreeAddress.getTreeAddress()).withTreeHeight(hashTreeAddress.getTreeHeight()).withTreeIndex((hashTreeAddress.getTreeIndex() - 1) / 2).withKeyAndMask(hashTreeAddress.getKeyAndMask()).build();
            XMSSNode randomizeHash = XMSSNodeUtil.randomizeHash(wOTSPlus, stack.pop(), lTree, hashTreeAddress2);
            XMSSNode xMSSNode = new XMSSNode(randomizeHash.getHeight() + 1, randomizeHash.getValue());
            hashTreeAddress = (HashTreeAddress) new HashTreeAddress.Builder().withLayerAddress(hashTreeAddress2.getLayerAddress()).withTreeAddress(hashTreeAddress2.getTreeAddress()).withTreeHeight(hashTreeAddress2.getTreeHeight() + 1).withTreeIndex(hashTreeAddress2.getTreeIndex()).withKeyAndMask(hashTreeAddress2.getKeyAndMask()).build();
            lTree = xMSSNode;
        }
        XMSSNode xMSSNode2 = this.tailNode;
        if (xMSSNode2 == null) {
            this.tailNode = lTree;
        } else if (xMSSNode2.getHeight() == lTree.getHeight()) {
            HashTreeAddress hashTreeAddress3 = (HashTreeAddress) new HashTreeAddress.Builder().withLayerAddress(hashTreeAddress.getLayerAddress()).withTreeAddress(hashTreeAddress.getTreeAddress()).withTreeHeight(hashTreeAddress.getTreeHeight()).withTreeIndex((hashTreeAddress.getTreeIndex() - 1) / 2).withKeyAndMask(hashTreeAddress.getKeyAndMask()).build();
            lTree = new XMSSNode(this.tailNode.getHeight() + 1, XMSSNodeUtil.randomizeHash(wOTSPlus, this.tailNode, lTree, hashTreeAddress3).getValue());
            this.tailNode = lTree;
        } else {
            stack.push(lTree);
        }
        if (this.tailNode.getHeight() == this.initialHeight) {
            this.finished = true;
        } else {
            this.height = lTree.getHeight();
            this.nextIndex++;
        }
    }

    public BDSTreeHash clone() {
        BDSTreeHash bDSTreeHash = new BDSTreeHash(this.initialHeight);
        bDSTreeHash.tailNode = this.tailNode;
        bDSTreeHash.height = this.height;
        bDSTreeHash.nextIndex = this.nextIndex;
        bDSTreeHash.initialized = this.initialized;
        bDSTreeHash.finished = this.finished;
        return bDSTreeHash;
    }
}
