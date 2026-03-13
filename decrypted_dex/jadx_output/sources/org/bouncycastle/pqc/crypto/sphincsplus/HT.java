package org.bouncycastle.pqc.crypto.sphincsplus;

import java.util.LinkedList;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class HT {
    SPHINCSPlusEngine engine;
    final byte[] htPubKey;
    private final byte[] pkSeed;
    private final byte[] skSeed;
    WotsPlus wots;

    public HT(SPHINCSPlusEngine sPHINCSPlusEngine, byte[] bArr, byte[] bArr2) {
        this.skSeed = bArr;
        this.pkSeed = bArr2;
        this.engine = sPHINCSPlusEngine;
        this.wots = new WotsPlus(sPHINCSPlusEngine);
        ADRS adrs = new ADRS();
        adrs.setLayerAddress(sPHINCSPlusEngine.f19471D - 1);
        adrs.setTreeAddress(0L);
        if (bArr != null) {
            this.htPubKey = xmss_PKgen(bArr, bArr2, adrs);
        } else {
            this.htPubKey = null;
        }
    }

    public byte[] sign(byte[] bArr, long j, int i3) {
        ADRS adrs = new ADRS();
        adrs.setLayerAddress(0);
        adrs.setTreeAddress(j);
        HT ht = this;
        SIG_XMSS xmss_sign = ht.xmss_sign(bArr, this.skSeed, i3, this.pkSeed, adrs);
        int i10 = ht.engine.f19471D;
        SIG_XMSS[] sig_xmssArr = new SIG_XMSS[i10];
        sig_xmssArr[0] = xmss_sign;
        adrs.setLayerAddress(0);
        adrs.setTreeAddress(j);
        byte[] xmss_pkFromSig = ht.xmss_pkFromSig(i3, xmss_sign, bArr, ht.pkSeed, adrs);
        int i11 = 1;
        while (true) {
            SPHINCSPlusEngine sPHINCSPlusEngine = ht.engine;
            if (i11 >= sPHINCSPlusEngine.f19471D) {
                break;
            }
            int i12 = (int) (((1 << r2) - 1) & j);
            j >>>= sPHINCSPlusEngine.H_PRIME;
            adrs.setLayerAddress(i11);
            adrs.setTreeAddress(j);
            SIG_XMSS xmss_sign2 = ht.xmss_sign(xmss_pkFromSig, ht.skSeed, i12, ht.pkSeed, adrs);
            sig_xmssArr[i11] = xmss_sign2;
            if (i11 < ht.engine.f19471D - 1) {
                xmss_pkFromSig = ht.xmss_pkFromSig(i12, xmss_sign2, xmss_pkFromSig, ht.pkSeed, adrs);
            }
            i11++;
            ht = this;
        }
        byte[][] bArr2 = new byte[i10][];
        for (int i13 = 0; i13 != i10; i13++) {
            SIG_XMSS sig_xmss = sig_xmssArr[i13];
            bArr2[i13] = Arrays.concatenate(sig_xmss.sig, Arrays.concatenate(sig_xmss.auth));
        }
        return Arrays.concatenate(bArr2);
    }

    public byte[] treehash(byte[] bArr, int i3, int i10, byte[] bArr2, ADRS adrs) {
        ADRS adrs2 = new ADRS(adrs);
        LinkedList linkedList = new LinkedList();
        int i11 = 1 << i10;
        if (i3 % i11 != 0) {
            return null;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            adrs2.setType(0);
            int i13 = i3 + i12;
            adrs2.setKeyPairAddress(i13);
            byte[] pkGen = this.wots.pkGen(bArr, bArr2, adrs2);
            adrs2.setType(2);
            adrs2.setTreeHeight(1);
            adrs2.setTreeIndex(i13);
            while (!linkedList.isEmpty() && ((NodeEntry) linkedList.get(0)).nodeHeight == adrs2.getTreeHeight()) {
                adrs2.setTreeIndex((adrs2.getTreeIndex() - 1) / 2);
                pkGen = this.engine.H(bArr2, adrs2, ((NodeEntry) linkedList.remove(0)).nodeValue, pkGen);
                adrs2.setTreeHeight(adrs2.getTreeHeight() + 1);
            }
            linkedList.add(0, new NodeEntry(pkGen, adrs2.getTreeHeight()));
        }
        return ((NodeEntry) linkedList.get(0)).nodeValue;
    }

    public boolean verify(byte[] bArr, SIG_XMSS[] sig_xmssArr, byte[] bArr2, long j, int i3, byte[] bArr3) {
        ADRS adrs = new ADRS();
        SIG_XMSS sig_xmss = sig_xmssArr[0];
        adrs.setLayerAddress(0);
        adrs.setTreeAddress(j);
        HT ht = this;
        byte[] xmss_pkFromSig = ht.xmss_pkFromSig(i3, sig_xmss, bArr, bArr2, adrs);
        int i10 = 1;
        while (true) {
            SPHINCSPlusEngine sPHINCSPlusEngine = ht.engine;
            if (i10 >= sPHINCSPlusEngine.f19471D) {
                return Arrays.areEqual(bArr3, xmss_pkFromSig);
            }
            int i11 = (int) (((1 << r12) - 1) & j);
            j >>>= sPHINCSPlusEngine.H_PRIME;
            SIG_XMSS sig_xmss2 = sig_xmssArr[i10];
            adrs.setLayerAddress(i10);
            adrs.setTreeAddress(j);
            xmss_pkFromSig = ht.xmss_pkFromSig(i11, sig_xmss2, xmss_pkFromSig, bArr2, adrs);
            i10++;
            ht = this;
        }
    }

    public byte[] xmss_PKgen(byte[] bArr, byte[] bArr2, ADRS adrs) {
        return treehash(bArr, 0, this.engine.H_PRIME, bArr2, adrs);
    }

    public byte[] xmss_pkFromSig(int i3, SIG_XMSS sig_xmss, byte[] bArr, byte[] bArr2, ADRS adrs) {
        ADRS adrs2 = new ADRS(adrs);
        int i10 = 0;
        adrs2.setType(0);
        adrs2.setKeyPairAddress(i3);
        byte[] wOTSSig = sig_xmss.getWOTSSig();
        byte[][] xmssauth = sig_xmss.getXMSSAUTH();
        byte[] pkFromSig = this.wots.pkFromSig(wOTSSig, bArr, bArr2, adrs2);
        adrs2.setType(2);
        adrs2.setTreeIndex(i3);
        while (i10 < this.engine.H_PRIME) {
            int i11 = i10 + 1;
            adrs2.setTreeHeight(i11);
            if ((i3 / (1 << i10)) % 2 == 0) {
                adrs2.setTreeIndex(adrs2.getTreeIndex() / 2);
                pkFromSig = this.engine.H(bArr2, adrs2, pkFromSig, xmssauth[i10]);
            } else {
                adrs2.setTreeIndex((adrs2.getTreeIndex() - 1) / 2);
                pkFromSig = this.engine.H(bArr2, adrs2, xmssauth[i10], pkFromSig);
            }
            i10 = i11;
        }
        return pkFromSig;
    }

    public SIG_XMSS xmss_sign(byte[] bArr, byte[] bArr2, int i3, byte[] bArr3, ADRS adrs) {
        byte[][] bArr4 = new byte[this.engine.H_PRIME][];
        ADRS adrs2 = new ADRS(adrs);
        adrs2.setType(2);
        adrs2.setLayerAddress(adrs.getLayerAddress());
        adrs2.setTreeAddress(adrs.getTreeAddress());
        int i10 = 0;
        while (i10 < this.engine.H_PRIME) {
            int i11 = 1 << i10;
            byte[] bArr5 = bArr2;
            byte[] bArr6 = bArr3;
            bArr4[i10] = treehash(bArr5, (1 ^ (i3 / i11)) * i11, i10, bArr6, adrs2);
            i10++;
            bArr2 = bArr5;
            bArr3 = bArr6;
        }
        byte[] bArr7 = bArr3;
        byte[] bArr8 = bArr2;
        ADRS adrs3 = new ADRS(adrs);
        adrs3.setType(1);
        adrs3.setKeyPairAddress(i3);
        return new SIG_XMSS(this.wots.sign(bArr, bArr8, bArr7, adrs3), bArr4);
    }
}
