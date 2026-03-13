package org.bouncycastle.pqc.crypto.picnic;

import com.stub.StubApp;
import java.lang.reflect.Array;
import java.util.logging.Logger;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class Tree {
    private static final Logger LOG = Logger.getLogger(Tree.class.getName());
    private static final int MAX_SEED_SIZE_BYTES = 32;
    private final int MAX_AUX_BYTES = 176;
    private int dataSize;
    private int depth;
    private PicnicEngine engine;
    private boolean[] exists;
    private boolean[] haveNode;
    byte[][] nodes;
    private int numLeaves;
    private int numNodes;

    public Tree(PicnicEngine picnicEngine, int i3, int i10) {
        int i11;
        this.engine = picnicEngine;
        int ceil_log2 = Utils.ceil_log2(i3);
        int i12 = ceil_log2 + 1;
        this.depth = i12;
        int i13 = ((1 << i12) - 1) - ((1 << ceil_log2) - i3);
        this.numNodes = i13;
        this.numLeaves = i3;
        this.dataSize = i10;
        this.nodes = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i13, i10);
        int i14 = 0;
        while (true) {
            i11 = this.numNodes;
            if (i14 >= i11) {
                break;
            }
            this.nodes[i14] = new byte[i10];
            i14++;
        }
        this.haveNode = new boolean[i11];
        boolean[] zArr = new boolean[i11];
        this.exists = zArr;
        Arrays.fill(zArr, i11 - this.numLeaves, i11, true);
        for (int i15 = this.numNodes - this.numLeaves; i15 > 0; i15--) {
            int i16 = i15 * 2;
            if (exists(i16 + 1) || exists(i16 + 2)) {
                this.exists[i15] = true;
            }
        }
        this.exists[0] = true;
    }

    private void computeParentHash(int i3, byte[] bArr) {
        if (exists(i3)) {
            int parent = getParent(i3);
            boolean[] zArr = this.haveNode;
            if (zArr[parent]) {
                return;
            }
            int i10 = parent * 2;
            int i11 = i10 + 1;
            if (zArr[i11]) {
                int i12 = i10 + 2;
                if (!exists(i12) || this.haveNode[i12]) {
                    this.engine.digest.update((byte) 3);
                    PicnicEngine picnicEngine = this.engine;
                    picnicEngine.digest.update(this.nodes[i11], 0, picnicEngine.digestSizeBytes);
                    if (hasRightChild(parent)) {
                        PicnicEngine picnicEngine2 = this.engine;
                        picnicEngine2.digest.update(this.nodes[i12], 0, picnicEngine2.digestSizeBytes);
                    }
                    this.engine.digest.update(bArr, 0, 32);
                    this.engine.digest.update(Pack.intToLittleEndian(parent), 0, 2);
                    PicnicEngine picnicEngine3 = this.engine;
                    picnicEngine3.digest.doFinal(this.nodes[parent], 0, picnicEngine3.digestSizeBytes);
                    this.haveNode[parent] = true;
                }
            }
        }
    }

    private boolean contains(int[] iArr, int i3, int i10) {
        for (int i11 = 0; i11 < i3; i11++) {
            if (iArr[i11] == i10) {
                return true;
            }
        }
        return false;
    }

    private boolean exists(int i3) {
        if (i3 >= this.numNodes) {
            return false;
        }
        return this.exists[i3];
    }

    private void expandSeeds(byte[] bArr, int i3) {
        byte[] bArr2;
        int i10;
        byte[] bArr3 = new byte[64];
        int parent = getParent(this.numNodes - 1);
        int i11 = 0;
        while (i11 <= parent) {
            if (this.haveNode[i11]) {
                bArr2 = bArr;
                i10 = i3;
                hashSeed(bArr3, this.nodes[i11], bArr2, (byte) 1, i10, i11);
                int i12 = i11 * 2;
                int i13 = i12 + 1;
                if (!this.haveNode[i13]) {
                    System.arraycopy(bArr3, 0, this.nodes[i13], 0, this.engine.seedSizeBytes);
                    this.haveNode[i13] = true;
                }
                int i14 = i12 + 2;
                if (exists(i14) && !this.haveNode[i14]) {
                    int i15 = this.engine.seedSizeBytes;
                    System.arraycopy(bArr3, i15, this.nodes[i14], 0, i15);
                    this.haveNode[i14] = true;
                }
            } else {
                bArr2 = bArr;
                i10 = i3;
            }
            i11++;
            bArr = bArr2;
            i3 = i10;
        }
    }

    private int getParent(int i3) {
        return (isLeftChild(i3) ? i3 - 1 : i3 - 2) / 2;
    }

    private int[] getRevealedMerkleNodes(int[] iArr, int i3, int[] iArr2) {
        int i10 = this.numNodes;
        int i11 = i10 - this.numLeaves;
        boolean[] zArr = new boolean[i10];
        for (int i12 = 0; i12 < i3; i12++) {
            zArr[iArr[i12] + i11] = true;
        }
        for (int parent = getParent(this.numNodes - 1); parent > 0; parent--) {
            if (exists(parent)) {
                int i13 = parent * 2;
                int i14 = i13 + 2;
                int i15 = i13 + 1;
                if (exists(i14)) {
                    if (zArr[i15] && zArr[i14]) {
                        zArr[parent] = true;
                    }
                } else if (zArr[i15]) {
                    zArr[parent] = true;
                }
            }
        }
        int[] iArr3 = new int[this.numLeaves];
        int i16 = 0;
        for (int i17 = 0; i17 < i3; i17++) {
            int i18 = iArr[i17] + i11;
            while (true) {
                if (zArr[getParent(i18)]) {
                    i18 = getParent(i18);
                    if (i18 == 0) {
                        break;
                    }
                } else if (!contains(iArr3, i16, i18)) {
                    iArr3[i16] = i18;
                    i16++;
                }
            }
        }
        iArr2[0] = i16;
        return iArr3;
    }

    private int[] getRevealedNodes(int[] iArr, int i3, int[] iArr2) {
        int i10 = this.depth - 1;
        int[][] iArr3 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i10, i3);
        for (int i11 = 0; i11 < i3; i11++) {
            int i12 = (this.numNodes - this.numLeaves) + iArr[i11];
            iArr3[0][i11] = i12;
            int i13 = 1;
            while (true) {
                i12 = getParent(i12);
                if (i12 != 0) {
                    iArr3[i13][i11] = i12;
                    i13++;
                }
            }
        }
        int[] iArr4 = new int[this.numLeaves];
        int i14 = 0;
        for (int i15 = 0; i15 < i10; i15++) {
            for (int i16 = 0; i16 < i3; i16++) {
                if (hasSibling(iArr3[i15][i16])) {
                    int sibling = getSibling(iArr3[i15][i16]);
                    if (!contains(iArr3[i15], i3, sibling)) {
                        while (!hasRightChild(sibling) && !isLeafNode(sibling)) {
                            sibling = (sibling * 2) + 1;
                        }
                        if (!contains(iArr4, i14, sibling)) {
                            iArr4[i14] = sibling;
                            i14++;
                        }
                    }
                }
            }
        }
        iArr2[0] = i14;
        return iArr4;
    }

    private int getSibling(int i3) {
        if (!isLeftChild(i3)) {
            return i3 - 1;
        }
        int i10 = i3 + 1;
        if (i10 < this.numNodes) {
            return i10;
        }
        LOG.fine(StubApp.getString2(34125));
        return 0;
    }

    private boolean hasRightChild(int i3) {
        return (i3 * 2) + 2 < this.numNodes && exists(i3);
    }

    private boolean hasSibling(int i3) {
        if (exists(i3)) {
            return !isLeftChild(i3) || exists(i3 + 1);
        }
        return false;
    }

    private void hashSeed(byte[] bArr, byte[] bArr2, byte[] bArr3, byte b2, int i3, int i10) {
        this.engine.digest.update(b2);
        PicnicEngine picnicEngine = this.engine;
        picnicEngine.digest.update(bArr2, 0, picnicEngine.seedSizeBytes);
        this.engine.digest.update(bArr3, 0, 32);
        this.engine.digest.update(Pack.shortToLittleEndian((short) (i3 & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH)), 0, 2);
        this.engine.digest.update(Pack.shortToLittleEndian((short) (65535 & i10)), 0, 2);
        PicnicEngine picnicEngine2 = this.engine;
        picnicEngine2.digest.doFinal(bArr, 0, picnicEngine2.seedSizeBytes * 2);
    }

    private boolean isLeafNode(int i3) {
        return (i3 * 2) + 1 >= this.numNodes;
    }

    private boolean isLeftChild(int i3) {
        return i3 % 2 == 1;
    }

    public int addMerkleNodes(int[] iArr, int i3, byte[] bArr, int i10) {
        int[] iArr2 = {0};
        int[] revealedMerkleNodes = getRevealedMerkleNodes(iArr, i3, iArr2);
        for (int i11 = 0; i11 < iArr2[0]; i11++) {
            int i12 = this.dataSize;
            i10 -= i12;
            if (i10 < 0) {
                return -1;
            }
            System.arraycopy(bArr, i11 * i12, this.nodes[revealedMerkleNodes[i11]], 0, i12);
            this.haveNode[revealedMerkleNodes[i11]] = true;
        }
        return i10 != 0 ? -1 : 0;
    }

    public void buildMerkleTree(byte[][] bArr, byte[] bArr2) {
        int i3 = this.numNodes - this.numLeaves;
        for (int i10 = 0; i10 < this.numLeaves; i10++) {
            byte[] bArr3 = bArr[i10];
            if (bArr3 != null) {
                int i11 = i3 + i10;
                System.arraycopy(bArr3, 0, this.nodes[i11], 0, this.dataSize);
                this.haveNode[i11] = true;
            }
        }
        for (int i12 = this.numNodes; i12 > 0; i12--) {
            computeParentHash(i12, bArr2);
        }
    }

    public void generateSeeds(byte[] bArr, byte[] bArr2, int i3) {
        this.nodes[0] = bArr;
        this.haveNode[0] = true;
        expandSeeds(bArr2, i3);
    }

    public byte[] getLeaf(int i3) {
        return this.nodes[(this.numNodes - this.numLeaves) + i3];
    }

    public byte[][] getLeaves() {
        return this.nodes;
    }

    public int getLeavesOffset() {
        return this.numNodes - this.numLeaves;
    }

    public boolean hasLeftChild(Tree tree, int i3) {
        return (i3 * 2) + 1 < this.numNodes;
    }

    public byte[] openMerkleTree(int[] iArr, int i3, int[] iArr2) {
        int[] iArr3 = new int[1];
        int[] revealedMerkleNodes = getRevealedMerkleNodes(iArr, i3, iArr3);
        int i10 = iArr3[0] * this.dataSize;
        iArr2[0] = i10;
        byte[] bArr = new byte[i10];
        for (int i11 = 0; i11 < iArr3[0]; i11++) {
            byte[] bArr2 = this.nodes[revealedMerkleNodes[i11]];
            int i12 = this.dataSize;
            System.arraycopy(bArr2, 0, bArr, i11 * i12, i12);
        }
        return bArr;
    }

    public int openMerkleTreeSize(int[] iArr, int i3) {
        int[] iArr2 = new int[1];
        getRevealedMerkleNodes(iArr, i3, iArr2);
        return iArr2[0] * this.engine.digestSizeBytes;
    }

    public int reconstructSeeds(int[] iArr, int i3, byte[] bArr, int i10, byte[] bArr2, int i11) {
        int[] iArr2 = {0};
        int[] revealedNodes = getRevealedNodes(iArr, i3, iArr2);
        for (int i12 = 0; i12 < iArr2[0]; i12++) {
            int i13 = this.engine.seedSizeBytes;
            i10 -= i13;
            if (i10 < 0) {
                return -1;
            }
            System.arraycopy(bArr, i12 * i13, this.nodes[revealedNodes[i12]], 0, i13);
            this.haveNode[revealedNodes[i12]] = true;
        }
        expandSeeds(bArr2, i11);
        return 0;
    }

    public int revealSeeds(int[] iArr, int i3, byte[] bArr, int i10) {
        int[] iArr2 = {0};
        int[] revealedNodes = getRevealedNodes(iArr, i3, iArr2);
        for (int i11 = 0; i11 < iArr2[0]; i11++) {
            int i12 = this.engine.seedSizeBytes;
            i10 -= i12;
            if (i10 < 0) {
                LOG.fine(StubApp.getString2(34126));
                return 0;
            }
            System.arraycopy(this.nodes[revealedNodes[i11]], 0, bArr, i11 * i12, i12);
        }
        return bArr.length - i10;
    }

    public int revealSeedsSize(int[] iArr, int i3) {
        int[] iArr2 = {0};
        getRevealedNodes(iArr, i3, iArr2);
        return iArr2[0] * this.engine.seedSizeBytes;
    }

    public int verifyMerkleTree(byte[][] bArr, byte[] bArr2) {
        int i3 = this.numNodes - this.numLeaves;
        for (int i10 = 0; i10 < this.numLeaves; i10++) {
            byte[] bArr3 = bArr[i10];
            if (bArr3 != null) {
                int i11 = i3 + i10;
                if (this.haveNode[i11]) {
                    return -1;
                }
                if (bArr3 != null) {
                    System.arraycopy(bArr3, 0, this.nodes[i11], 0, this.dataSize);
                    this.haveNode[i11] = true;
                }
            }
        }
        for (int i12 = this.numNodes; i12 > 0; i12--) {
            computeParentHash(i12, bArr2);
        }
        return !this.haveNode[0] ? -1 : 0;
    }
}
