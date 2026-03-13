package org.bouncycastle.pqc.crypto.crystals.dilithium;

import com.stub.StubApp;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class PolyVecL {
    private int dilithiumK;
    private int dilithiumL;
    private DilithiumEngine engine;
    private int mode;
    private int polyVecBytes;
    Poly[] vec;

    public PolyVecL() throws Exception {
        throw new Exception(StubApp.getString2(33981));
    }

    public void addPolyVecL(PolyVecL polyVecL) {
        for (int i3 = 0; i3 < this.dilithiumL; i3++) {
            getVectorIndex(i3).addPoly(polyVecL.getVectorIndex(i3));
        }
    }

    public boolean checkNorm(int i3) {
        for (int i10 = 0; i10 < this.dilithiumL; i10++) {
            if (getVectorIndex(i10).checkNorm(i3)) {
                return true;
            }
        }
        return false;
    }

    public void copyPolyVecL(PolyVecL polyVecL) {
        for (int i3 = 0; i3 < this.dilithiumL; i3++) {
            for (int i10 = 0; i10 < 256; i10++) {
                polyVecL.getVectorIndex(i3).setCoeffIndex(i10, getVectorIndex(i3).getCoeffIndex(i10));
            }
        }
    }

    public void expandMatrix(byte[] bArr, int i3) {
        for (int i10 = 0; i10 < this.dilithiumL; i10++) {
            this.vec[i10].uniformBlocks(bArr, (short) ((i3 << 8) + i10));
        }
    }

    public Poly getVectorIndex(int i3) {
        return this.vec[i3];
    }

    public void invNttToMont() {
        for (int i3 = 0; i3 < this.dilithiumL; i3++) {
            getVectorIndex(i3).invNttToMont();
        }
    }

    public void pointwisePolyMontgomery(Poly poly, PolyVecL polyVecL) {
        for (int i3 = 0; i3 < this.dilithiumL; i3++) {
            getVectorIndex(i3).pointwiseMontgomery(poly, polyVecL.getVectorIndex(i3));
        }
    }

    public void polyVecNtt() {
        for (int i3 = 0; i3 < this.dilithiumL; i3++) {
            this.vec[i3].polyNtt();
        }
    }

    public void reduce() {
        for (int i3 = 0; i3 < this.dilithiumL; i3++) {
            getVectorIndex(i3).reduce();
        }
    }

    public String toString() {
        String string2 = StubApp.getString2(33982);
        for (int i3 = 0; i3 < this.dilithiumL; i3++) {
            string2 = string2 + StubApp.getString2(33983) + i3 + StubApp.getString2(397) + getVectorIndex(i3).toString();
            if (i3 != this.dilithiumL - 1) {
                string2 = AbstractC1482f.g(string2, StubApp.getString2(6946));
            }
        }
        return AbstractC1482f.g(string2, StubApp.getString2(511));
    }

    public void uniformEta(byte[] bArr, short s10) {
        int i3 = 0;
        while (i3 < this.dilithiumL) {
            getVectorIndex(i3).uniformEta(bArr, s10);
            i3++;
            s10 = (short) (s10 + 1);
        }
    }

    public void uniformGamma1(byte[] bArr, short s10) {
        for (int i3 = 0; i3 < this.dilithiumL; i3++) {
            getVectorIndex(i3).uniformGamma1(bArr, (short) ((this.dilithiumL * s10) + i3));
        }
    }

    public PolyVecL(DilithiumEngine dilithiumEngine) {
        this.engine = dilithiumEngine;
        this.mode = dilithiumEngine.getDilithiumMode();
        this.dilithiumL = dilithiumEngine.getDilithiumL();
        this.dilithiumK = dilithiumEngine.getDilithiumK();
        this.vec = new Poly[this.dilithiumL];
        for (int i3 = 0; i3 < this.dilithiumL; i3++) {
            this.vec[i3] = new Poly(dilithiumEngine);
        }
    }

    public String toString(String str) {
        StringBuilder n10 = AbstractC1482f.n(str, StubApp.getString2(994));
        n10.append(toString());
        return n10.toString();
    }
}
