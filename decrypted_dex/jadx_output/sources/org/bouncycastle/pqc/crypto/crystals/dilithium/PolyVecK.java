package org.bouncycastle.pqc.crypto.crystals.dilithium;

import com.stub.StubApp;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class PolyVecK {
    private int dilithiumK;
    private int dilithiumL;
    private DilithiumEngine engine;
    private int mode;
    private int polyVecBytes;
    Poly[] vec;

    public PolyVecK() throws Exception {
        throw new Exception(StubApp.getString2(33981));
    }

    public void addPolyVecK(PolyVecK polyVecK) {
        for (int i3 = 0; i3 < this.dilithiumK; i3++) {
            getVectorIndex(i3).addPoly(polyVecK.getVectorIndex(i3));
        }
    }

    public boolean checkNorm(int i3) {
        for (int i10 = 0; i10 < this.dilithiumK; i10++) {
            if (getVectorIndex(i10).checkNorm(i3)) {
                return true;
            }
        }
        return false;
    }

    public void conditionalAddQ() {
        for (int i3 = 0; i3 < this.dilithiumK; i3++) {
            getVectorIndex(i3).conditionalAddQ();
        }
    }

    public void decompose(PolyVecK polyVecK) {
        for (int i3 = 0; i3 < this.dilithiumK; i3++) {
            getVectorIndex(i3).decompose(polyVecK.getVectorIndex(i3));
        }
    }

    public Poly getVectorIndex(int i3) {
        return this.vec[i3];
    }

    public void invNttToMont() {
        for (int i3 = 0; i3 < this.dilithiumK; i3++) {
            getVectorIndex(i3).invNttToMont();
        }
    }

    public int makeHint(PolyVecK polyVecK, PolyVecK polyVecK2) {
        int i3 = 0;
        for (int i10 = 0; i10 < this.dilithiumK; i10++) {
            i3 += getVectorIndex(i10).polyMakeHint(polyVecK.getVectorIndex(i10), polyVecK2.getVectorIndex(i10));
        }
        return i3;
    }

    public byte[] packW1() {
        byte[] bArr = new byte[this.dilithiumK * this.engine.getDilithiumPolyW1PackedBytes()];
        for (int i3 = 0; i3 < this.dilithiumK; i3++) {
            System.arraycopy(getVectorIndex(i3).w1Pack(), 0, bArr, this.engine.getDilithiumPolyW1PackedBytes() * i3, this.engine.getDilithiumPolyW1PackedBytes());
        }
        return bArr;
    }

    public void pointwisePolyMontgomery(Poly poly, PolyVecK polyVecK) {
        for (int i3 = 0; i3 < this.dilithiumK; i3++) {
            getVectorIndex(i3).pointwiseMontgomery(poly, polyVecK.getVectorIndex(i3));
        }
    }

    public void polyVecNtt() {
        for (int i3 = 0; i3 < this.dilithiumK; i3++) {
            this.vec[i3].polyNtt();
        }
    }

    public void power2Round(PolyVecK polyVecK) {
        for (int i3 = 0; i3 < this.dilithiumK; i3++) {
            getVectorIndex(i3).power2Round(polyVecK.getVectorIndex(i3));
        }
    }

    public void reduce() {
        for (int i3 = 0; i3 < this.dilithiumK; i3++) {
            getVectorIndex(i3).reduce();
        }
    }

    public void setVectorIndex(int i3, Poly poly) {
        this.vec[i3] = poly;
    }

    public void shiftLeft() {
        for (int i3 = 0; i3 < this.dilithiumK; i3++) {
            getVectorIndex(i3).shiftLeft();
        }
    }

    public void subtract(PolyVecK polyVecK) {
        for (int i3 = 0; i3 < this.dilithiumK; i3++) {
            getVectorIndex(i3).subtract(polyVecK.getVectorIndex(i3));
        }
    }

    public String toString() {
        String string2 = StubApp.getString2(1557);
        for (int i3 = 0; i3 < this.dilithiumK; i3++) {
            string2 = string2 + i3 + StubApp.getString2(397) + getVectorIndex(i3).toString();
            if (i3 != this.dilithiumK - 1) {
                string2 = AbstractC1482f.g(string2, StubApp.getString2(6946));
            }
        }
        return AbstractC1482f.g(string2, StubApp.getString2(511));
    }

    public void uniformEta(byte[] bArr, short s10) {
        int i3 = 0;
        while (i3 < this.dilithiumK) {
            getVectorIndex(i3).uniformEta(bArr, s10);
            i3++;
            s10 = (short) (s10 + 1);
        }
    }

    public void useHint(PolyVecK polyVecK, PolyVecK polyVecK2) {
        for (int i3 = 0; i3 < this.dilithiumK; i3++) {
            getVectorIndex(i3).polyUseHint(polyVecK.getVectorIndex(i3), polyVecK2.getVectorIndex(i3));
        }
    }

    public PolyVecK(DilithiumEngine dilithiumEngine) {
        this.engine = dilithiumEngine;
        this.mode = dilithiumEngine.getDilithiumMode();
        this.dilithiumK = dilithiumEngine.getDilithiumK();
        this.dilithiumL = dilithiumEngine.getDilithiumL();
        this.vec = new Poly[this.dilithiumK];
        for (int i3 = 0; i3 < this.dilithiumK; i3++) {
            this.vec[i3] = new Poly(dilithiumEngine);
        }
    }

    public String toString(String str) {
        StringBuilder n10 = AbstractC1482f.n(str, StubApp.getString2(994));
        n10.append(toString());
        return n10.toString();
    }
}
