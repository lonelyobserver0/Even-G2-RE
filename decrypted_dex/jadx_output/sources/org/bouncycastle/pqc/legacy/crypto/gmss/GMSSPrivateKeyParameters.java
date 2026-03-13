package org.bouncycastle.pqc.legacy.crypto.gmss;

import com.stub.StubApp;
import java.lang.reflect.Array;
import java.util.Vector;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.pqc.legacy.crypto.gmss.util.GMSSRandom;
import org.bouncycastle.pqc.legacy.crypto.gmss.util.WinternitzOTSignature;
import org.bouncycastle.util.Arrays;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class GMSSPrivateKeyParameters extends GMSSKeyParameters {

    /* renamed from: K, reason: collision with root package name */
    private int[] f19509K;
    private byte[][][] currentAuthPaths;
    private Vector[][] currentRetain;
    private byte[][] currentRootSig;
    private byte[][] currentSeeds;
    private Vector[] currentStack;
    private Treehash[][] currentTreehash;
    private GMSSDigestProvider digestProvider;
    private GMSSParameters gmssPS;
    private GMSSRandom gmssRandom;
    private int[] heightOfTrees;
    private int[] index;
    private byte[][][] keep;
    private int mdLength;
    private Digest messDigestTrees;
    private int[] minTreehash;
    private byte[][][] nextAuthPaths;
    private GMSSLeaf[] nextNextLeaf;
    private GMSSRootCalc[] nextNextRoot;
    private byte[][] nextNextSeeds;
    private Vector[][] nextRetain;
    private byte[][] nextRoot;
    private GMSSRootSig[] nextRootSig;
    private Vector[] nextStack;
    private Treehash[][] nextTreehash;
    private int numLayer;
    private int[] numLeafs;
    private int[] otsIndex;
    private GMSSLeaf[] upperLeaf;
    private GMSSLeaf[] upperTreehashLeaf;
    private boolean used;

    private GMSSPrivateKeyParameters(GMSSPrivateKeyParameters gMSSPrivateKeyParameters) {
        super(true, gMSSPrivateKeyParameters.getParameters());
        this.used = false;
        this.index = Arrays.clone(gMSSPrivateKeyParameters.index);
        this.currentSeeds = Arrays.clone(gMSSPrivateKeyParameters.currentSeeds);
        this.nextNextSeeds = Arrays.clone(gMSSPrivateKeyParameters.nextNextSeeds);
        this.currentAuthPaths = Arrays.clone(gMSSPrivateKeyParameters.currentAuthPaths);
        this.nextAuthPaths = Arrays.clone(gMSSPrivateKeyParameters.nextAuthPaths);
        this.currentTreehash = gMSSPrivateKeyParameters.currentTreehash;
        this.nextTreehash = gMSSPrivateKeyParameters.nextTreehash;
        this.currentStack = gMSSPrivateKeyParameters.currentStack;
        this.nextStack = gMSSPrivateKeyParameters.nextStack;
        this.currentRetain = gMSSPrivateKeyParameters.currentRetain;
        this.nextRetain = gMSSPrivateKeyParameters.nextRetain;
        this.keep = Arrays.clone(gMSSPrivateKeyParameters.keep);
        this.nextNextLeaf = gMSSPrivateKeyParameters.nextNextLeaf;
        this.upperLeaf = gMSSPrivateKeyParameters.upperLeaf;
        this.upperTreehashLeaf = gMSSPrivateKeyParameters.upperTreehashLeaf;
        this.minTreehash = gMSSPrivateKeyParameters.minTreehash;
        this.gmssPS = gMSSPrivateKeyParameters.gmssPS;
        this.nextRoot = Arrays.clone(gMSSPrivateKeyParameters.nextRoot);
        this.nextNextRoot = gMSSPrivateKeyParameters.nextNextRoot;
        this.currentRootSig = gMSSPrivateKeyParameters.currentRootSig;
        this.nextRootSig = gMSSPrivateKeyParameters.nextRootSig;
        this.digestProvider = gMSSPrivateKeyParameters.digestProvider;
        this.heightOfTrees = gMSSPrivateKeyParameters.heightOfTrees;
        this.otsIndex = gMSSPrivateKeyParameters.otsIndex;
        this.f19509K = gMSSPrivateKeyParameters.f19509K;
        this.numLayer = gMSSPrivateKeyParameters.numLayer;
        this.messDigestTrees = gMSSPrivateKeyParameters.messDigestTrees;
        this.mdLength = gMSSPrivateKeyParameters.mdLength;
        this.gmssRandom = gMSSPrivateKeyParameters.gmssRandom;
        this.numLeafs = gMSSPrivateKeyParameters.numLeafs;
    }

    private void computeAuthPaths(int i3) {
        int i10;
        byte[] bArr;
        int i11 = this.index[i3];
        int i12 = this.heightOfTrees[i3];
        int i13 = this.f19509K[i3];
        int i14 = 0;
        while (true) {
            i10 = i12 - i13;
            if (i14 >= i10) {
                break;
            }
            this.currentTreehash[i3][i14].updateNextSeed(this.gmssRandom);
            i14++;
        }
        int heightOfPhi = heightOfPhi(i11);
        byte[] bArr2 = new byte[this.mdLength];
        byte[] nextSeed = this.gmssRandom.nextSeed(this.currentSeeds[i3]);
        int i15 = (i11 >>> (heightOfPhi + 1)) & 1;
        int i16 = this.mdLength;
        byte[] bArr3 = new byte[i16];
        int i17 = i12 - 1;
        if (heightOfPhi < i17 && i15 == 0) {
            System.arraycopy(this.currentAuthPaths[i3][heightOfPhi], 0, bArr3, 0, i16);
        }
        int i18 = this.mdLength;
        byte[] bArr4 = new byte[i18];
        if (heightOfPhi == 0) {
            if (i3 == this.numLayer - 1) {
                bArr = new WinternitzOTSignature(nextSeed, this.digestProvider.get(), this.otsIndex[i3]).getPublicKey();
            } else {
                byte[] bArr5 = new byte[i18];
                System.arraycopy(this.currentSeeds[i3], 0, bArr5, 0, i18);
                this.gmssRandom.nextSeed(bArr5);
                byte[] leaf = this.upperLeaf[i3].getLeaf();
                this.upperLeaf[i3].initLeafCalc(bArr5);
                bArr = leaf;
            }
            System.arraycopy(bArr, 0, this.currentAuthPaths[i3][0], 0, this.mdLength);
        } else {
            int i19 = i18 << 1;
            byte[] bArr6 = new byte[i19];
            System.arraycopy(this.currentAuthPaths[i3][heightOfPhi - 1], 0, bArr6, 0, i18);
            byte[] bArr7 = this.keep[i3][(int) Math.floor(r12 / 2)];
            int i20 = this.mdLength;
            System.arraycopy(bArr7, 0, bArr6, i20, i20);
            this.messDigestTrees.update(bArr6, 0, i19);
            this.currentAuthPaths[i3][heightOfPhi] = new byte[this.messDigestTrees.getDigestSize()];
            this.messDigestTrees.doFinal(this.currentAuthPaths[i3][heightOfPhi], 0);
            for (int i21 = 0; i21 < heightOfPhi; i21++) {
                if (i21 < i10) {
                    if (this.currentTreehash[i3][i21].wasFinished()) {
                        System.arraycopy(this.currentTreehash[i3][i21].getFirstNode(), 0, this.currentAuthPaths[i3][i21], 0, this.mdLength);
                        this.currentTreehash[i3][i21].destroy();
                    } else {
                        System.err.println(AbstractC1482f.e(i3, StubApp.getString2(34761), i21, StubApp.getString2(321), StubApp.getString2(34762)));
                    }
                }
                if (i21 < i17 && i21 >= i10) {
                    int i22 = i21 - i10;
                    if (this.currentRetain[i3][i22].size() > 0) {
                        System.arraycopy(this.currentRetain[i3][i22].lastElement(), 0, this.currentAuthPaths[i3][i21], 0, this.mdLength);
                        Vector vector = this.currentRetain[i3][i22];
                        vector.removeElementAt(vector.size() - 1);
                    }
                }
                if (i21 < i10 && ((1 << i21) * 3) + i11 < this.numLeafs[i3]) {
                    this.currentTreehash[i3][i21].initialize();
                }
            }
        }
        if (heightOfPhi < i17 && i15 == 0) {
            System.arraycopy(bArr3, 0, this.keep[i3][(int) Math.floor(heightOfPhi / 2)], 0, this.mdLength);
        }
        if (i3 != this.numLayer - 1) {
            this.minTreehash[i3] = getMinTreehashIndex(i3);
            return;
        }
        for (int i23 = 1; i23 <= i10 / 2; i23++) {
            int minTreehashIndex = getMinTreehashIndex(i3);
            if (minTreehashIndex >= 0) {
                try {
                    byte[] bArr8 = new byte[this.mdLength];
                    System.arraycopy(this.currentTreehash[i3][minTreehashIndex].getSeedActive(), 0, bArr8, 0, this.mdLength);
                    this.currentTreehash[i3][minTreehashIndex].update(this.gmssRandom, new WinternitzOTSignature(this.gmssRandom.nextSeed(bArr8), this.digestProvider.get(), this.otsIndex[i3]).getPublicKey());
                } catch (Exception e10) {
                    System.out.println(e10);
                }
            }
        }
    }

    private int getMinTreehashIndex(int i3) {
        int i10 = -1;
        for (int i11 = 0; i11 < this.heightOfTrees[i3] - this.f19509K[i3]; i11++) {
            if (this.currentTreehash[i3][i11].wasInitialized() && !this.currentTreehash[i3][i11].wasFinished() && (i10 == -1 || this.currentTreehash[i3][i11].getLowestNodeHeight() < this.currentTreehash[i3][i10].getLowestNodeHeight())) {
                i10 = i11;
            }
        }
        return i10;
    }

    private int heightOfPhi(int i3) {
        if (i3 == 0) {
            return -1;
        }
        int i10 = 0;
        int i11 = 1;
        while (i3 % i11 == 0) {
            i11 *= 2;
            i10++;
        }
        return i10 - 1;
    }

    private void nextTree(int i3) {
        if (i3 > 0) {
            int[] iArr = this.index;
            int i10 = i3 - 1;
            iArr[i10] = iArr[i10] + 1;
            int i11 = i3;
            boolean z2 = true;
            do {
                i11--;
                if (this.index[i11] < this.numLeafs[i11]) {
                    z2 = false;
                }
                if (!z2) {
                    break;
                }
            } while (i11 > 0);
            if (z2) {
                return;
            }
            this.gmssRandom.nextSeed(this.currentSeeds[i3]);
            this.nextRootSig[i10].updateSign();
            if (i3 > 1) {
                GMSSLeaf[] gMSSLeafArr = this.nextNextLeaf;
                int i12 = i3 - 2;
                gMSSLeafArr[i12] = gMSSLeafArr[i12].nextLeaf();
            }
            GMSSLeaf[] gMSSLeafArr2 = this.upperLeaf;
            gMSSLeafArr2[i10] = gMSSLeafArr2[i10].nextLeaf();
            if (this.minTreehash[i10] >= 0) {
                GMSSLeaf[] gMSSLeafArr3 = this.upperTreehashLeaf;
                gMSSLeafArr3[i10] = gMSSLeafArr3[i10].nextLeaf();
                try {
                    this.currentTreehash[i10][this.minTreehash[i10]].update(this.gmssRandom, this.upperTreehashLeaf[i10].getLeaf());
                    this.currentTreehash[i10][this.minTreehash[i10]].wasFinished();
                } catch (Exception e10) {
                    System.out.println(e10);
                }
            }
            updateNextNextAuthRoot(i3);
            this.currentRootSig[i10] = this.nextRootSig[i10].getSig();
            for (int i13 = 0; i13 < this.heightOfTrees[i3] - this.f19509K[i3]; i13++) {
                Treehash[] treehashArr = this.currentTreehash[i3];
                Treehash[][] treehashArr2 = this.nextTreehash;
                treehashArr[i13] = treehashArr2[i10][i13];
                treehashArr2[i10][i13] = this.nextNextRoot[i10].getTreehash()[i13];
            }
            for (int i14 = 0; i14 < this.heightOfTrees[i3]; i14++) {
                System.arraycopy(this.nextAuthPaths[i10][i14], 0, this.currentAuthPaths[i3][i14], 0, this.mdLength);
                System.arraycopy(this.nextNextRoot[i10].getAuthPath()[i14], 0, this.nextAuthPaths[i10][i14], 0, this.mdLength);
            }
            for (int i15 = 0; i15 < this.f19509K[i3] - 1; i15++) {
                Vector[] vectorArr = this.currentRetain[i3];
                Vector[][] vectorArr2 = this.nextRetain;
                vectorArr[i15] = vectorArr2[i10][i15];
                vectorArr2[i10][i15] = this.nextNextRoot[i10].getRetain()[i15];
            }
            Vector[] vectorArr3 = this.currentStack;
            Vector[] vectorArr4 = this.nextStack;
            vectorArr3[i3] = vectorArr4[i10];
            vectorArr4[i10] = this.nextNextRoot[i10].getStack();
            this.nextRoot[i10] = this.nextNextRoot[i10].getRoot();
            int i16 = this.mdLength;
            byte[] bArr = new byte[i16];
            byte[] bArr2 = new byte[i16];
            System.arraycopy(this.currentSeeds[i10], 0, bArr2, 0, i16);
            this.gmssRandom.nextSeed(bArr2);
            this.gmssRandom.nextSeed(bArr2);
            this.nextRootSig[i10].initSign(this.gmssRandom.nextSeed(bArr2), this.nextRoot[i10]);
            nextKey(i10);
        }
    }

    private void updateKey(int i3) {
        computeAuthPaths(i3);
        if (i3 > 0) {
            if (i3 > 1) {
                GMSSLeaf[] gMSSLeafArr = this.nextNextLeaf;
                int i10 = i3 - 2;
                gMSSLeafArr[i10] = gMSSLeafArr[i10].nextLeaf();
            }
            GMSSLeaf[] gMSSLeafArr2 = this.upperLeaf;
            int i11 = i3 - 1;
            gMSSLeafArr2[i11] = gMSSLeafArr2[i11].nextLeaf();
            int floor = (int) Math.floor((getNumLeafs(i3) * 2) / (this.heightOfTrees[i11] - this.f19509K[i11]));
            int i12 = this.index[i3];
            if (i12 % floor == 1) {
                if (i12 > 1 && this.minTreehash[i11] >= 0) {
                    try {
                        this.currentTreehash[i11][this.minTreehash[i11]].update(this.gmssRandom, this.upperTreehashLeaf[i11].getLeaf());
                        this.currentTreehash[i11][this.minTreehash[i11]].wasFinished();
                    } catch (Exception e10) {
                        System.out.println(e10);
                    }
                }
                this.minTreehash[i11] = getMinTreehashIndex(i11);
                int i13 = this.minTreehash[i11];
                if (i13 >= 0) {
                    this.upperTreehashLeaf[i11] = new GMSSLeaf(this.digestProvider.get(), this.otsIndex[i11], floor, this.currentTreehash[i11][i13].getSeedActive());
                    GMSSLeaf[] gMSSLeafArr3 = this.upperTreehashLeaf;
                    gMSSLeafArr3[i11] = gMSSLeafArr3[i11].nextLeaf();
                }
            } else if (this.minTreehash[i11] >= 0) {
                GMSSLeaf[] gMSSLeafArr4 = this.upperTreehashLeaf;
                gMSSLeafArr4[i11] = gMSSLeafArr4[i11].nextLeaf();
            }
            this.nextRootSig[i11].updateSign();
            if (this.index[i3] == 1) {
                this.nextNextRoot[i11].initialize(new Vector());
            }
            updateNextNextAuthRoot(i3);
        }
    }

    private void updateNextNextAuthRoot(int i3) {
        byte[] bArr = new byte[this.mdLength];
        int i10 = i3 - 1;
        byte[] nextSeed = this.gmssRandom.nextSeed(this.nextNextSeeds[i10]);
        if (i3 == this.numLayer - 1) {
            this.nextNextRoot[i10].update(this.nextNextSeeds[i10], new WinternitzOTSignature(nextSeed, this.digestProvider.get(), this.otsIndex[i3]).getPublicKey());
        } else {
            this.nextNextRoot[i10].update(this.nextNextSeeds[i10], this.nextNextLeaf[i10].getLeaf());
            this.nextNextLeaf[i10].initLeafCalc(this.nextNextSeeds[i10]);
        }
    }

    public byte[][][] getCurrentAuthPaths() {
        return Arrays.clone(this.currentAuthPaths);
    }

    public byte[][] getCurrentSeeds() {
        return Arrays.clone(this.currentSeeds);
    }

    public int getIndex(int i3) {
        return this.index[i3];
    }

    public GMSSDigestProvider getName() {
        return this.digestProvider;
    }

    public int getNumLeafs(int i3) {
        return this.numLeafs[i3];
    }

    public byte[] getSubtreeRootSig(int i3) {
        return this.currentRootSig[i3];
    }

    public boolean isUsed() {
        return this.used;
    }

    public void markUsed() {
        this.used = true;
    }

    public GMSSPrivateKeyParameters nextKey() {
        GMSSPrivateKeyParameters gMSSPrivateKeyParameters = new GMSSPrivateKeyParameters(this);
        gMSSPrivateKeyParameters.nextKey(this.gmssPS.getNumOfLayers() - 1);
        return gMSSPrivateKeyParameters;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GMSSPrivateKeyParameters(int[] iArr, byte[][] bArr, byte[][] bArr2, byte[][][] bArr3, byte[][][] bArr4, byte[][][] bArr5, Treehash[][] treehashArr, Treehash[][] treehashArr2, Vector[] vectorArr, Vector[] vectorArr2, Vector[][] vectorArr3, Vector[][] vectorArr4, GMSSLeaf[] gMSSLeafArr, GMSSLeaf[] gMSSLeafArr2, GMSSLeaf[] gMSSLeafArr3, int[] iArr2, byte[][] bArr6, GMSSRootCalc[] gMSSRootCalcArr, byte[][] bArr7, GMSSRootSig[] gMSSRootSigArr, GMSSParameters gMSSParameters, GMSSDigestProvider gMSSDigestProvider) {
        super(true, gMSSParameters);
        int i3;
        int i10 = 1;
        this.used = false;
        Digest digest = gMSSDigestProvider.get();
        this.messDigestTrees = digest;
        this.mdLength = digest.getDigestSize();
        this.gmssPS = gMSSParameters;
        this.otsIndex = gMSSParameters.getWinternitzParameter();
        this.f19509K = gMSSParameters.getK();
        this.heightOfTrees = gMSSParameters.getHeightOfTrees();
        int numOfLayers = this.gmssPS.getNumOfLayers();
        this.numLayer = numOfLayers;
        if (iArr == null) {
            this.index = new int[numOfLayers];
            for (int i11 = 0; i11 < this.numLayer; i11++) {
                this.index[i11] = 0;
            }
        } else {
            this.index = iArr;
        }
        this.currentSeeds = bArr;
        this.nextNextSeeds = bArr2;
        this.currentAuthPaths = Arrays.clone(bArr3);
        this.nextAuthPaths = bArr4;
        if (bArr5 == null) {
            this.keep = new byte[this.numLayer][][];
            int i12 = 0;
            while (i12 < this.numLayer) {
                byte[][][] bArr8 = this.keep;
                int i13 = i10;
                int floor = (int) Math.floor(this.heightOfTrees[i12] / 2);
                int[] iArr3 = new int[2];
                iArr3[i13] = this.mdLength;
                iArr3[0] = floor;
                bArr8[i12] = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, iArr3);
                i12++;
                i10 = i13;
            }
            i3 = i10;
        } else {
            i3 = 1;
            this.keep = bArr5;
        }
        if (vectorArr == null) {
            this.currentStack = new Vector[this.numLayer];
            for (int i14 = 0; i14 < this.numLayer; i14++) {
                this.currentStack[i14] = new Vector();
            }
        } else {
            this.currentStack = vectorArr;
        }
        if (vectorArr2 == null) {
            this.nextStack = new Vector[this.numLayer - 1];
            for (int i15 = 0; i15 < this.numLayer - 1; i15++) {
                this.nextStack[i15] = new Vector();
            }
        } else {
            this.nextStack = vectorArr2;
        }
        this.currentTreehash = treehashArr;
        this.nextTreehash = treehashArr2;
        this.currentRetain = vectorArr3;
        this.nextRetain = vectorArr4;
        this.nextRoot = bArr6;
        this.digestProvider = gMSSDigestProvider;
        if (gMSSRootCalcArr == null) {
            this.nextNextRoot = new GMSSRootCalc[this.numLayer - 1];
            int i16 = 0;
            while (i16 < this.numLayer - 1) {
                int i17 = i16 + 1;
                this.nextNextRoot[i16] = new GMSSRootCalc(this.heightOfTrees[i17], this.f19509K[i17], this.digestProvider);
                i16 = i17;
            }
        } else {
            this.nextNextRoot = gMSSRootCalcArr;
        }
        this.currentRootSig = bArr7;
        this.numLeafs = new int[this.numLayer];
        for (int i18 = 0; i18 < this.numLayer; i18++) {
            this.numLeafs[i18] = i3 << this.heightOfTrees[i18];
        }
        this.gmssRandom = new GMSSRandom(this.messDigestTrees);
        int i19 = this.numLayer;
        if (i19 <= i3) {
            this.nextNextLeaf = new GMSSLeaf[0];
        } else if (gMSSLeafArr == null) {
            this.nextNextLeaf = new GMSSLeaf[i19 - 2];
            int i20 = 0;
            while (i20 < this.numLayer - 2) {
                int i21 = i20 + 1;
                this.nextNextLeaf[i20] = new GMSSLeaf(gMSSDigestProvider.get(), this.otsIndex[i21], this.numLeafs[i20 + 2], this.nextNextSeeds[i20]);
                i20 = i21;
            }
        } else {
            this.nextNextLeaf = gMSSLeafArr;
        }
        if (gMSSLeafArr2 == null) {
            this.upperLeaf = new GMSSLeaf[this.numLayer - 1];
            int i22 = 0;
            while (i22 < this.numLayer - 1) {
                int i23 = i22 + 1;
                this.upperLeaf[i22] = new GMSSLeaf(gMSSDigestProvider.get(), this.otsIndex[i22], this.numLeafs[i23], this.currentSeeds[i22]);
                i22 = i23;
            }
        } else {
            this.upperLeaf = gMSSLeafArr2;
        }
        if (gMSSLeafArr3 == null) {
            this.upperTreehashLeaf = new GMSSLeaf[this.numLayer - 1];
            int i24 = 0;
            while (i24 < this.numLayer - 1) {
                int i25 = i24 + 1;
                this.upperTreehashLeaf[i24] = new GMSSLeaf(gMSSDigestProvider.get(), this.otsIndex[i24], this.numLeafs[i25]);
                i24 = i25;
            }
        } else {
            this.upperTreehashLeaf = gMSSLeafArr3;
        }
        if (iArr2 == null) {
            this.minTreehash = new int[this.numLayer - 1];
            for (int i26 = 0; i26 < this.numLayer - 1; i26++) {
                this.minTreehash[i26] = -1;
            }
        } else {
            this.minTreehash = iArr2;
        }
        int i27 = this.mdLength;
        byte[] bArr9 = new byte[i27];
        byte[] bArr10 = new byte[i27];
        if (gMSSRootSigArr != null) {
            this.nextRootSig = gMSSRootSigArr;
            return;
        }
        this.nextRootSig = new GMSSRootSig[this.numLayer - 1];
        int i28 = 0;
        while (i28 < this.numLayer - 1) {
            System.arraycopy(bArr[i28], 0, bArr9, 0, this.mdLength);
            this.gmssRandom.nextSeed(bArr9);
            byte[] nextSeed = this.gmssRandom.nextSeed(bArr9);
            int i29 = i28 + 1;
            this.nextRootSig[i28] = new GMSSRootSig(gMSSDigestProvider.get(), this.otsIndex[i28], this.heightOfTrees[i29]);
            this.nextRootSig[i28].initSign(nextSeed, bArr6[i28]);
            i28 = i29;
        }
    }

    private void nextKey(int i3) {
        int i10 = this.numLayer;
        if (i3 == i10 - 1) {
            int[] iArr = this.index;
            iArr[i3] = iArr[i3] + 1;
        }
        if (this.index[i3] != this.numLeafs[i3]) {
            updateKey(i3);
        } else if (i10 != 1) {
            nextTree(i3);
            this.index[i3] = 0;
        }
    }

    public int[] getIndex() {
        return this.index;
    }

    public GMSSPrivateKeyParameters(byte[][] bArr, byte[][] bArr2, byte[][][] bArr3, byte[][][] bArr4, Treehash[][] treehashArr, Treehash[][] treehashArr2, Vector[] vectorArr, Vector[] vectorArr2, Vector[][] vectorArr3, Vector[][] vectorArr4, byte[][] bArr5, byte[][] bArr6, GMSSParameters gMSSParameters, GMSSDigestProvider gMSSDigestProvider) {
        this(null, bArr, bArr2, bArr3, bArr4, null, treehashArr, treehashArr2, vectorArr, vectorArr2, vectorArr3, vectorArr4, null, null, null, null, bArr5, null, bArr6, null, gMSSParameters, gMSSDigestProvider);
    }
}
