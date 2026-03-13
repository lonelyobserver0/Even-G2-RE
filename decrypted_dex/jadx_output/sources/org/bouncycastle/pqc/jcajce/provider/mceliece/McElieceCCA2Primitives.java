package org.bouncycastle.pqc.jcajce.provider.mceliece;

import org.bouncycastle.pqc.legacy.crypto.mceliece.McElieceCCA2PrivateKeyParameters;
import org.bouncycastle.pqc.legacy.crypto.mceliece.McElieceCCA2PublicKeyParameters;
import org.bouncycastle.pqc.legacy.math.linearalgebra.GF2Matrix;
import org.bouncycastle.pqc.legacy.math.linearalgebra.GF2Vector;
import org.bouncycastle.pqc.legacy.math.linearalgebra.GF2mField;
import org.bouncycastle.pqc.legacy.math.linearalgebra.GoppaCode;
import org.bouncycastle.pqc.legacy.math.linearalgebra.Permutation;
import org.bouncycastle.pqc.legacy.math.linearalgebra.PolynomialGF2mSmallM;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class McElieceCCA2Primitives {
    private McElieceCCA2Primitives() {
    }

    public static GF2Vector[] decryptionPrimitive(BCMcElieceCCA2PrivateKey bCMcElieceCCA2PrivateKey, GF2Vector gF2Vector) {
        int k3 = bCMcElieceCCA2PrivateKey.getK();
        Permutation p8 = bCMcElieceCCA2PrivateKey.getP();
        GF2mField field = bCMcElieceCCA2PrivateKey.getField();
        PolynomialGF2mSmallM goppaPoly = bCMcElieceCCA2PrivateKey.getGoppaPoly();
        GF2Matrix h2 = bCMcElieceCCA2PrivateKey.getH();
        PolynomialGF2mSmallM[] qInv = bCMcElieceCCA2PrivateKey.getQInv();
        GF2Vector gF2Vector2 = (GF2Vector) gF2Vector.multiply(p8.computeInverse());
        GF2Vector syndromeDecode = GoppaCode.syndromeDecode((GF2Vector) h2.rightMultiply(gF2Vector2), field, goppaPoly, qInv);
        GF2Vector gF2Vector3 = (GF2Vector) ((GF2Vector) gF2Vector2.add(syndromeDecode)).multiply(p8);
        return new GF2Vector[]{gF2Vector3.extractRightVector(k3), (GF2Vector) syndromeDecode.multiply(p8)};
    }

    public static GF2Vector encryptionPrimitive(BCMcElieceCCA2PublicKey bCMcElieceCCA2PublicKey, GF2Vector gF2Vector, GF2Vector gF2Vector2) {
        return (GF2Vector) bCMcElieceCCA2PublicKey.getG().leftMultiplyLeftCompactForm(gF2Vector).add(gF2Vector2);
    }

    public static GF2Vector[] decryptionPrimitive(McElieceCCA2PrivateKeyParameters mcElieceCCA2PrivateKeyParameters, GF2Vector gF2Vector) {
        int k3 = mcElieceCCA2PrivateKeyParameters.getK();
        Permutation p8 = mcElieceCCA2PrivateKeyParameters.getP();
        GF2mField field = mcElieceCCA2PrivateKeyParameters.getField();
        PolynomialGF2mSmallM goppaPoly = mcElieceCCA2PrivateKeyParameters.getGoppaPoly();
        GF2Matrix h2 = mcElieceCCA2PrivateKeyParameters.getH();
        PolynomialGF2mSmallM[] qInv = mcElieceCCA2PrivateKeyParameters.getQInv();
        GF2Vector gF2Vector2 = (GF2Vector) gF2Vector.multiply(p8.computeInverse());
        GF2Vector syndromeDecode = GoppaCode.syndromeDecode((GF2Vector) h2.rightMultiply(gF2Vector2), field, goppaPoly, qInv);
        GF2Vector gF2Vector3 = (GF2Vector) ((GF2Vector) gF2Vector2.add(syndromeDecode)).multiply(p8);
        return new GF2Vector[]{gF2Vector3.extractRightVector(k3), (GF2Vector) syndromeDecode.multiply(p8)};
    }

    public static GF2Vector encryptionPrimitive(McElieceCCA2PublicKeyParameters mcElieceCCA2PublicKeyParameters, GF2Vector gF2Vector, GF2Vector gF2Vector2) {
        return (GF2Vector) mcElieceCCA2PublicKeyParameters.getG().leftMultiplyLeftCompactForm(gF2Vector).add(gF2Vector2);
    }
}
