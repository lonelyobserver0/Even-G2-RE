package org.bouncycastle.pqc.crypto.sphincsplus;

import java.util.LinkedList;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class Fors {
    SPHINCSPlusEngine engine;

    public Fors(SPHINCSPlusEngine sPHINCSPlusEngine) {
        this.engine = sPHINCSPlusEngine;
    }

    public static int[] message_to_idxs(byte[] bArr, int i3, int i10) {
        int[] iArr = new int[i3];
        int i11 = 0;
        for (int i12 = 0; i12 < i3; i12++) {
            iArr[i12] = 0;
            for (int i13 = 0; i13 < i10; i13++) {
                iArr[i12] = iArr[i12] ^ (((bArr[i11 >> 3] >> (i11 & 7)) & 1) << i13);
                i11++;
            }
        }
        return iArr;
    }

    public byte[] pkFromSig(SIG_FORS[] sig_forsArr, byte[] bArr, byte[] bArr2, ADRS adrs) {
        int i3;
        int i10 = 2;
        byte[][] bArr3 = new byte[2][];
        SPHINCSPlusEngine sPHINCSPlusEngine = this.engine;
        int i11 = sPHINCSPlusEngine.f19473K;
        byte[][] bArr4 = new byte[i11][];
        int i12 = sPHINCSPlusEngine.f19475T;
        int[] message_to_idxs = message_to_idxs(bArr, i11, sPHINCSPlusEngine.f19470A);
        int i13 = 0;
        while (i13 < this.engine.f19473K) {
            int i14 = message_to_idxs[i13];
            byte[] sk = sig_forsArr[i13].getSK();
            adrs.setTreeHeight(0);
            int i15 = (i13 * i12) + i14;
            adrs.setTreeIndex(i15);
            bArr3[0] = this.engine.F(bArr2, adrs, sk);
            byte[][] authPath = sig_forsArr[i13].getAuthPath();
            adrs.setTreeIndex(i15);
            int i16 = 0;
            while (i16 < this.engine.f19470A) {
                int i17 = i16 + 1;
                adrs.setTreeHeight(i17);
                if ((i14 / (1 << i16)) % i10 == 0) {
                    adrs.setTreeIndex(adrs.getTreeIndex() / i10);
                    i3 = i10;
                    bArr3[1] = this.engine.H(bArr2, adrs, bArr3[0], authPath[i16]);
                } else {
                    i3 = i10;
                    adrs.setTreeIndex((adrs.getTreeIndex() - 1) / 2);
                    bArr3[1] = this.engine.H(bArr2, adrs, authPath[i16], bArr3[0]);
                }
                bArr3[0] = bArr3[1];
                i16 = i17;
                i10 = i3;
            }
            bArr4[i13] = bArr3[0];
            i13++;
            i10 = i10;
        }
        ADRS adrs2 = new ADRS(adrs);
        adrs2.setType(4);
        adrs2.setKeyPairAddress(adrs.getKeyPairAddress());
        return this.engine.T_l(bArr2, adrs2, Arrays.concatenate(bArr4));
    }

    public SIG_FORS[] sign(byte[] bArr, byte[] bArr2, byte[] bArr3, ADRS adrs) {
        Fors fors = this;
        ADRS adrs2 = new ADRS(adrs);
        SPHINCSPlusEngine sPHINCSPlusEngine = fors.engine;
        int[] message_to_idxs = message_to_idxs(bArr, sPHINCSPlusEngine.f19473K, sPHINCSPlusEngine.f19470A);
        SPHINCSPlusEngine sPHINCSPlusEngine2 = fors.engine;
        SIG_FORS[] sig_forsArr = new SIG_FORS[sPHINCSPlusEngine2.f19473K];
        int i3 = sPHINCSPlusEngine2.f19475T;
        int i10 = 0;
        while (i10 < fors.engine.f19473K) {
            int i11 = message_to_idxs[i10];
            adrs2.setType(6);
            adrs2.setKeyPairAddress(adrs.getKeyPairAddress());
            adrs2.setTreeHeight(0);
            int i12 = i10 * i3;
            adrs2.setTreeIndex(i12 + i11);
            byte[] bArr4 = bArr2;
            byte[] bArr5 = bArr3;
            byte[] PRF = fors.engine.PRF(bArr5, bArr4, adrs2);
            adrs2.changeType(3);
            byte[][] bArr6 = new byte[fors.engine.f19470A][];
            int i13 = 0;
            while (i13 < fors.engine.f19470A) {
                int i14 = 1 << i13;
                bArr6[i13] = fors.treehash(bArr4, (((i11 / i14) ^ 1) * i14) + i12, i13, bArr5, adrs2);
                i13++;
                fors = this;
                bArr4 = bArr2;
                bArr5 = bArr3;
            }
            sig_forsArr[i10] = new SIG_FORS(PRF, bArr6);
            i10++;
            fors = this;
        }
        return sig_forsArr;
    }

    public byte[] treehash(byte[] bArr, int i3, int i10, byte[] bArr2, ADRS adrs) {
        LinkedList linkedList = new LinkedList();
        int i11 = 1 << i10;
        if (i3 % i11 != 0) {
            return null;
        }
        ADRS adrs2 = new ADRS(adrs);
        for (int i12 = 0; i12 < i11; i12++) {
            adrs2.setType(6);
            adrs2.setKeyPairAddress(adrs.getKeyPairAddress());
            adrs2.setTreeHeight(0);
            adrs2.setTreeIndex(i3 + i12);
            byte[] PRF = this.engine.PRF(bArr2, bArr, adrs2);
            adrs2.changeType(3);
            byte[] F3 = this.engine.F(bArr2, adrs2, PRF);
            adrs2.setTreeHeight(1);
            while (!linkedList.isEmpty() && ((NodeEntry) linkedList.get(0)).nodeHeight == adrs2.getTreeHeight()) {
                adrs2.setTreeIndex((adrs2.getTreeIndex() - 1) / 2);
                F3 = this.engine.H(bArr2, adrs2, ((NodeEntry) linkedList.remove(0)).nodeValue, F3);
                adrs2.setTreeHeight(adrs2.getTreeHeight() + 1);
            }
            linkedList.add(0, new NodeEntry(F3, adrs2.getTreeHeight()));
        }
        return ((NodeEntry) linkedList.get(0)).nodeValue;
    }
}
