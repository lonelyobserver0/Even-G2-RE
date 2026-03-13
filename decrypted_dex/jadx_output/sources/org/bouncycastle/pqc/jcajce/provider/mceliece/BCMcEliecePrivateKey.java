package org.bouncycastle.pqc.jcajce.provider.mceliece;

import com.stub.StubApp;
import java.io.IOException;
import java.security.PrivateKey;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.asn1.McEliecePrivateKey;
import org.bouncycastle.pqc.asn1.PQCObjectIdentifiers;
import org.bouncycastle.pqc.legacy.crypto.mceliece.McEliecePrivateKeyParameters;
import org.bouncycastle.pqc.legacy.math.linearalgebra.GF2Matrix;
import org.bouncycastle.pqc.legacy.math.linearalgebra.GF2mField;
import org.bouncycastle.pqc.legacy.math.linearalgebra.Permutation;
import org.bouncycastle.pqc.legacy.math.linearalgebra.PolynomialGF2mSmallM;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BCMcEliecePrivateKey implements CipherParameters, PrivateKey {
    private static final long serialVersionUID = 1;
    private McEliecePrivateKeyParameters params;

    public BCMcEliecePrivateKey(McEliecePrivateKeyParameters mcEliecePrivateKeyParameters) {
        this.params = mcEliecePrivateKeyParameters;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCMcEliecePrivateKey)) {
            return false;
        }
        BCMcEliecePrivateKey bCMcEliecePrivateKey = (BCMcEliecePrivateKey) obj;
        return getN() == bCMcEliecePrivateKey.getN() && getK() == bCMcEliecePrivateKey.getK() && getField().equals(bCMcEliecePrivateKey.getField()) && getGoppaPoly().equals(bCMcEliecePrivateKey.getGoppaPoly()) && getSInv().equals(bCMcEliecePrivateKey.getSInv()) && getP1().equals(bCMcEliecePrivateKey.getP1()) && getP2().equals(bCMcEliecePrivateKey.getP2());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return StubApp.getString2(34673);
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new PrivateKeyInfo(new AlgorithmIdentifier(PQCObjectIdentifiers.mcEliece), new McEliecePrivateKey(this.params.getN(), this.params.getK(), this.params.getField(), this.params.getGoppaPoly(), this.params.getP1(), this.params.getP2(), this.params.getSInv())).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public GF2mField getField() {
        return this.params.getField();
    }

    @Override // java.security.Key
    public String getFormat() {
        return StubApp.getString2(29640);
    }

    public PolynomialGF2mSmallM getGoppaPoly() {
        return this.params.getGoppaPoly();
    }

    public GF2Matrix getH() {
        return this.params.getH();
    }

    public int getK() {
        return this.params.getK();
    }

    public AsymmetricKeyParameter getKeyParams() {
        return this.params;
    }

    public int getN() {
        return this.params.getN();
    }

    public Permutation getP1() {
        return this.params.getP1();
    }

    public Permutation getP2() {
        return this.params.getP2();
    }

    public PolynomialGF2mSmallM[] getQInv() {
        return this.params.getQInv();
    }

    public GF2Matrix getSInv() {
        return this.params.getSInv();
    }

    public int hashCode() {
        return this.params.getSInv().hashCode() + ((this.params.getP2().hashCode() + ((this.params.getP1().hashCode() + ((this.params.getGoppaPoly().hashCode() + ((this.params.getField().hashCode() + ((this.params.getN() + (this.params.getK() * 37)) * 37)) * 37)) * 37)) * 37)) * 37);
    }
}
