package org.bouncycastle.pqc.legacy.crypto.gmss;

import com.stub.StubApp;
import java.lang.reflect.Array;
import java.util.Enumeration;
import java.util.Vector;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.encoders.Hex;
import p0.AbstractC1482f;
import w.AbstractC1856e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class GMSSRootCalc {
    private byte[][] AuthPath;

    /* renamed from: K, reason: collision with root package name */
    private int f19510K;
    private GMSSDigestProvider digestProvider;
    private int heightOfNextSeed;
    private Vector heightOfNodes;
    private int heightOfTree;
    private int[] index;
    private int indexForNextSeed;
    private boolean isFinished;
    private boolean isInitialized;
    private int mdLength;
    private Digest messDigestTree;
    private Vector[] retain;
    private byte[] root;
    private Vector tailStack;
    private Treehash[] treehash;

    public GMSSRootCalc(int i3, int i10, GMSSDigestProvider gMSSDigestProvider) {
        this.heightOfTree = i3;
        this.digestProvider = gMSSDigestProvider;
        Digest digest = gMSSDigestProvider.get();
        this.messDigestTree = digest;
        int digestSize = digest.getDigestSize();
        this.mdLength = digestSize;
        this.f19510K = i10;
        this.index = new int[i3];
        int[] iArr = {i3, digestSize};
        this.AuthPath = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, iArr);
        this.root = new byte[this.mdLength];
        this.retain = new Vector[this.f19510K - 1];
        for (int i11 = 0; i11 < i10 - 1; i11++) {
            this.retain[i11] = new Vector();
        }
    }

    public byte[][] getAuthPath() {
        return GMSSUtils.clone(this.AuthPath);
    }

    public Vector[] getRetain() {
        return GMSSUtils.clone(this.retain);
    }

    public byte[] getRoot() {
        return Arrays.clone(this.root);
    }

    public Vector getStack() {
        Vector vector = new Vector();
        Enumeration elements = this.tailStack.elements();
        while (elements.hasMoreElements()) {
            vector.addElement(elements.nextElement());
        }
        return vector;
    }

    public byte[][] getStatByte() {
        Vector vector = this.tailStack;
        int size = vector == null ? 0 : vector.size();
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, this.heightOfTree + 1 + size, 64);
        bArr[0] = this.root;
        int i3 = 0;
        while (i3 < this.heightOfTree) {
            int i10 = i3 + 1;
            bArr[i10] = this.AuthPath[i3];
            i3 = i10;
        }
        for (int i11 = 0; i11 < size; i11++) {
            bArr[this.heightOfTree + 1 + i11] = (byte[]) this.tailStack.elementAt(i11);
        }
        return bArr;
    }

    public int[] getStatInt() {
        Vector vector = this.tailStack;
        int size = vector == null ? 0 : vector.size();
        int i3 = this.heightOfTree;
        int[] iArr = new int[i3 + 8 + size];
        iArr[0] = i3;
        iArr[1] = this.mdLength;
        iArr[2] = this.f19510K;
        iArr[3] = this.indexForNextSeed;
        iArr[4] = this.heightOfNextSeed;
        if (this.isFinished) {
            iArr[5] = 1;
        } else {
            iArr[5] = 0;
        }
        if (this.isInitialized) {
            iArr[6] = 1;
        } else {
            iArr[6] = 0;
        }
        iArr[7] = size;
        for (int i10 = 0; i10 < this.heightOfTree; i10++) {
            iArr[i10 + 8] = this.index[i10];
        }
        for (int i11 = 0; i11 < size; i11++) {
            iArr[this.heightOfTree + 8 + i11] = ((Integer) this.heightOfNodes.elementAt(i11)).intValue();
        }
        return iArr;
    }

    public Treehash[] getTreehash() {
        return GMSSUtils.clone(this.treehash);
    }

    public void initialize(Vector vector) {
        int i3;
        this.treehash = new Treehash[this.heightOfTree - this.f19510K];
        int i10 = 0;
        while (true) {
            i3 = this.heightOfTree;
            if (i10 >= i3 - this.f19510K) {
                break;
            }
            this.treehash[i10] = new Treehash(vector, i10, this.digestProvider.get());
            i10++;
        }
        this.index = new int[i3];
        this.AuthPath = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i3, this.mdLength);
        this.root = new byte[this.mdLength];
        this.tailStack = new Vector();
        this.heightOfNodes = new Vector();
        this.isInitialized = true;
        this.isFinished = false;
        for (int i11 = 0; i11 < this.heightOfTree; i11++) {
            this.index[i11] = -1;
        }
        this.retain = new Vector[this.f19510K - 1];
        for (int i12 = 0; i12 < this.f19510K - 1; i12++) {
            this.retain[i12] = new Vector();
        }
        this.indexForNextSeed = 3;
        this.heightOfNextSeed = 0;
    }

    public void initializeTreehashSeed(byte[] bArr, int i3) {
        this.treehash[i3].initializeSeed(bArr);
    }

    public String toString() {
        String string2;
        Vector vector = this.tailStack;
        int size = vector == null ? 0 : vector.size();
        String str = "";
        int i3 = 0;
        while (true) {
            int i10 = this.heightOfTree + 8 + size;
            string2 = StubApp.getString2(397);
            if (i3 >= i10) {
                break;
            }
            str = AbstractC1482f.f(getStatInt()[i3], string2, AbstractC1856e.b(str));
            i3++;
        }
        for (int i11 = 0; i11 < this.heightOfTree + 1 + size; i11++) {
            str = AbstractC1482f.k(AbstractC1856e.b(str), new String(Hex.encode(getStatByte()[i11])), string2);
        }
        StringBuilder n10 = AbstractC1482f.n(str, StubApp.getString2(6127));
        n10.append(this.digestProvider.get().getDigestSize());
        return n10.toString();
    }

    public void update(byte[] bArr) {
        if (this.isFinished) {
            System.out.print(StubApp.getString2(34763));
            return;
        }
        if (!this.isInitialized) {
            System.err.println(StubApp.getString2(34764));
            return;
        }
        int[] iArr = this.index;
        int i3 = iArr[0] + 1;
        iArr[0] = i3;
        if (i3 == 1) {
            System.arraycopy(bArr, 0, this.AuthPath[0], 0, this.mdLength);
        } else if (i3 == 3 && this.heightOfTree > this.f19510K) {
            this.treehash[0].setFirstNode(bArr);
        }
        int i10 = this.index[0];
        if ((i10 - 3) % 2 == 0 && i10 >= 3 && this.heightOfTree == this.f19510K) {
            this.retain[0].insertElementAt(bArr, 0);
        }
        if (this.index[0] == 0) {
            this.tailStack.addElement(bArr);
            this.heightOfNodes.addElement(Integers.valueOf(0));
            return;
        }
        int i11 = this.mdLength;
        byte[] bArr2 = new byte[i11];
        int i12 = i11 << 1;
        byte[] bArr3 = new byte[i12];
        System.arraycopy(bArr, 0, bArr2, 0, i11);
        int i13 = 0;
        while (this.tailStack.size() > 0 && i13 == ((Integer) this.heightOfNodes.lastElement()).intValue()) {
            System.arraycopy(this.tailStack.lastElement(), 0, bArr3, 0, this.mdLength);
            Vector vector = this.tailStack;
            vector.removeElementAt(vector.size() - 1);
            Vector vector2 = this.heightOfNodes;
            vector2.removeElementAt(vector2.size() - 1);
            int i14 = this.mdLength;
            System.arraycopy(bArr2, 0, bArr3, i14, i14);
            this.messDigestTree.update(bArr3, 0, i12);
            bArr2 = new byte[this.messDigestTree.getDigestSize()];
            this.messDigestTree.doFinal(bArr2, 0);
            i13++;
            if (i13 < this.heightOfTree) {
                int[] iArr2 = this.index;
                int i15 = iArr2[i13] + 1;
                iArr2[i13] = i15;
                if (i15 == 1) {
                    System.arraycopy(bArr2, 0, this.AuthPath[i13], 0, this.mdLength);
                }
                if (i13 >= this.heightOfTree - this.f19510K) {
                    if (i13 == 0) {
                        System.out.println(StubApp.getString2(34765));
                    }
                    int i16 = this.index[i13];
                    if ((i16 - 3) % 2 == 0 && i16 >= 3) {
                        this.retain[i13 - (this.heightOfTree - this.f19510K)].insertElementAt(bArr2, 0);
                    }
                } else if (this.index[i13] == 3) {
                    this.treehash[i13].setFirstNode(bArr2);
                }
            }
        }
        this.tailStack.addElement(bArr2);
        this.heightOfNodes.addElement(Integers.valueOf(i13));
        if (i13 == this.heightOfTree) {
            this.isFinished = true;
            this.isInitialized = false;
            this.root = (byte[]) this.tailStack.lastElement();
        }
    }

    public boolean wasFinished() {
        return this.isFinished;
    }

    public boolean wasInitialized() {
        return this.isInitialized;
    }

    public void update(byte[] bArr, byte[] bArr2) {
        int i3 = this.heightOfNextSeed;
        if (i3 < this.heightOfTree - this.f19510K && this.indexForNextSeed - 2 == this.index[0]) {
            initializeTreehashSeed(bArr, i3);
            this.heightOfNextSeed++;
            this.indexForNextSeed *= 2;
        }
        update(bArr2);
    }
}
