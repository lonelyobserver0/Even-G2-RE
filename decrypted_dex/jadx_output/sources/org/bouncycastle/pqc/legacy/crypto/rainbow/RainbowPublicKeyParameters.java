package org.bouncycastle.pqc.legacy.crypto.rainbow;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class RainbowPublicKeyParameters extends RainbowKeyParameters {
    private short[][] coeffquadratic;
    private short[] coeffscalar;
    private short[][] coeffsingular;

    public RainbowPublicKeyParameters(int i3, short[][] sArr, short[][] sArr2, short[] sArr3) {
        super(false, i3);
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
}
