package org.bouncycastle.pqc.legacy.crypto.gmss;

import java.util.Enumeration;
import java.util.Vector;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class GMSSUtils {
    public static Vector[] clone(Vector[] vectorArr) {
        if (vectorArr == null) {
            return null;
        }
        Vector[] vectorArr2 = new Vector[vectorArr.length];
        for (int i3 = 0; i3 != vectorArr.length; i3++) {
            vectorArr2[i3] = new Vector();
            Enumeration elements = vectorArr[i3].elements();
            while (elements.hasMoreElements()) {
                vectorArr2[i3].addElement(elements.nextElement());
            }
        }
        return vectorArr2;
    }

    public static GMSSLeaf[] clone(GMSSLeaf[] gMSSLeafArr) {
        if (gMSSLeafArr == null) {
            return null;
        }
        GMSSLeaf[] gMSSLeafArr2 = new GMSSLeaf[gMSSLeafArr.length];
        System.arraycopy(gMSSLeafArr, 0, gMSSLeafArr2, 0, gMSSLeafArr.length);
        return gMSSLeafArr2;
    }

    public static GMSSRootCalc[] clone(GMSSRootCalc[] gMSSRootCalcArr) {
        if (gMSSRootCalcArr == null) {
            return null;
        }
        GMSSRootCalc[] gMSSRootCalcArr2 = new GMSSRootCalc[gMSSRootCalcArr.length];
        System.arraycopy(gMSSRootCalcArr, 0, gMSSRootCalcArr2, 0, gMSSRootCalcArr.length);
        return gMSSRootCalcArr2;
    }

    public static GMSSRootSig[] clone(GMSSRootSig[] gMSSRootSigArr) {
        if (gMSSRootSigArr == null) {
            return null;
        }
        GMSSRootSig[] gMSSRootSigArr2 = new GMSSRootSig[gMSSRootSigArr.length];
        System.arraycopy(gMSSRootSigArr, 0, gMSSRootSigArr2, 0, gMSSRootSigArr.length);
        return gMSSRootSigArr2;
    }

    public static Treehash[] clone(Treehash[] treehashArr) {
        if (treehashArr == null) {
            return null;
        }
        Treehash[] treehashArr2 = new Treehash[treehashArr.length];
        System.arraycopy(treehashArr, 0, treehashArr2, 0, treehashArr.length);
        return treehashArr2;
    }

    public static byte[][] clone(byte[][] bArr) {
        if (bArr == null) {
            return null;
        }
        byte[][] bArr2 = new byte[bArr.length][];
        for (int i3 = 0; i3 != bArr.length; i3++) {
            bArr2[i3] = Arrays.clone(bArr[i3]);
        }
        return bArr2;
    }

    public static Vector[][] clone(Vector[][] vectorArr) {
        if (vectorArr == null) {
            return null;
        }
        Vector[][] vectorArr2 = new Vector[vectorArr.length][];
        for (int i3 = 0; i3 != vectorArr.length; i3++) {
            vectorArr2[i3] = clone(vectorArr[i3]);
        }
        return vectorArr2;
    }

    public static Treehash[][] clone(Treehash[][] treehashArr) {
        if (treehashArr == null) {
            return null;
        }
        Treehash[][] treehashArr2 = new Treehash[treehashArr.length][];
        for (int i3 = 0; i3 != treehashArr.length; i3++) {
            treehashArr2[i3] = clone(treehashArr[i3]);
        }
        return treehashArr2;
    }

    public static byte[][][] clone(byte[][][] bArr) {
        if (bArr == null) {
            return null;
        }
        byte[][][] bArr2 = new byte[bArr.length][][];
        for (int i3 = 0; i3 != bArr.length; i3++) {
            bArr2[i3] = clone(bArr[i3]);
        }
        return bArr2;
    }
}
