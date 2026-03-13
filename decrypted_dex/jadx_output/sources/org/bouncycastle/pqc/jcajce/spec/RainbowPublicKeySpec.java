package org.bouncycastle.pqc.jcajce.spec;

import java.security.spec.KeySpec;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class RainbowPublicKeySpec implements KeySpec {
    private short[][] coeffquadratic;
    private short[] coeffscalar;
    private short[][] coeffsingular;
    private int docLength;

    public RainbowPublicKeySpec(int i3, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.docLength = i3;
        this.coeffquadratic = sArr;
        this.coeffsingular = sArr2;
        this.coeffscalar = sArr3;
    }

    public short[][] getCoeffQuadratic() {
        return this.coeffquadratic;
    }

    public short[] getCoeffScalar() {
        return this.coeffscalar;
    }

    public short[][] getCoeffSingular() {
        return this.coeffsingular;
    }

    public int getDocLength() {
        return this.docLength;
    }
}
