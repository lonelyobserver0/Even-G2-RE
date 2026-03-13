package org.bouncycastle.pqc.crypto.crystals.dilithium;

import com.stub.StubApp;
import p0.AbstractC1482f;
import w.AbstractC1856e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class PolyVecMatrix {
    private final int dilithiumK;
    private final int dilithiumL;
    private final PolyVecL[] mat;

    public PolyVecMatrix(DilithiumEngine dilithiumEngine) {
        int dilithiumK = dilithiumEngine.getDilithiumK();
        this.dilithiumK = dilithiumK;
        this.dilithiumL = dilithiumEngine.getDilithiumL();
        this.mat = new PolyVecL[dilithiumK];
        for (int i3 = 0; i3 < this.dilithiumK; i3++) {
            this.mat[i3] = new PolyVecL(dilithiumEngine);
        }
    }

    private String addString() {
        String string2 = StubApp.getString2(1557);
        int i3 = 0;
        while (true) {
            int i10 = this.dilithiumK;
            String string22 = StubApp.getString2(33984);
            if (i3 >= i10) {
                return AbstractC1482f.g(string2, string22);
            }
            StringBuilder b2 = AbstractC1856e.b(string2 + StubApp.getString2(33985) + i3 + StubApp.getString2(510));
            b2.append(this.mat[i3].toString());
            String sb2 = b2.toString();
            string2 = i3 == this.dilithiumK + (-1) ? AbstractC1482f.g(sb2, string22) : AbstractC1482f.g(sb2, StubApp.getString2(33986));
            i3++;
        }
    }

    public void expandMatrix(byte[] bArr) {
        for (int i3 = 0; i3 < this.dilithiumK; i3++) {
            for (int i10 = 0; i10 < this.dilithiumL; i10++) {
                this.mat[i3].getVectorIndex(i10).uniformBlocks(bArr, (short) ((i3 << 8) + i10));
            }
        }
    }

    public void pointwiseMontgomery(PolyVecK polyVecK, PolyVecL polyVecL) {
        for (int i3 = 0; i3 < this.dilithiumK; i3++) {
            polyVecK.getVectorIndex(i3).pointwiseAccountMontgomery(this.mat[i3], polyVecL);
        }
    }

    public String toString(String str) {
        return str.concat(StubApp.getString2(33987) + addString());
    }
}
