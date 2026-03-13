package org.bouncycastle.pqc.jcajce.provider.mceliece;

import com.stub.StubApp;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PrivateKey;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.jcajce.util.MessageDigestUtils;
import org.bouncycastle.pqc.asn1.McElieceCCA2PrivateKey;
import org.bouncycastle.pqc.asn1.PQCObjectIdentifiers;
import org.bouncycastle.pqc.crypto.util.PrivateKeyFactory;
import org.bouncycastle.pqc.legacy.crypto.mceliece.McElieceCCA2PrivateKeyParameters;
import org.bouncycastle.pqc.legacy.math.linearalgebra.GF2Matrix;
import org.bouncycastle.pqc.legacy.math.linearalgebra.GF2mField;
import org.bouncycastle.pqc.legacy.math.linearalgebra.Permutation;
import org.bouncycastle.pqc.legacy.math.linearalgebra.PolynomialGF2mSmallM;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BCMcElieceCCA2PrivateKey implements PrivateKey {
    private static final long serialVersionUID = 1;
    private transient McElieceCCA2PrivateKeyParameters params;

    public BCMcElieceCCA2PrivateKey(McElieceCCA2PrivateKeyParameters mcElieceCCA2PrivateKeyParameters) {
        this.params = mcElieceCCA2PrivateKeyParameters;
    }

    private void init(PrivateKeyInfo privateKeyInfo) throws IOException {
        this.params = (McElieceCCA2PrivateKeyParameters) PrivateKeyFactory.createKey(privateKeyInfo);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        init(PrivateKeyInfo.getInstance((byte[]) objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof BCMcElieceCCA2PrivateKey)) {
            BCMcElieceCCA2PrivateKey bCMcElieceCCA2PrivateKey = (BCMcElieceCCA2PrivateKey) obj;
            if (getN() == bCMcElieceCCA2PrivateKey.getN() && getK() == bCMcElieceCCA2PrivateKey.getK() && getField().equals(bCMcElieceCCA2PrivateKey.getField()) && getGoppaPoly().equals(bCMcElieceCCA2PrivateKey.getGoppaPoly()) && getP().equals(bCMcElieceCCA2PrivateKey.getP()) && getH().equals(bCMcElieceCCA2PrivateKey.getH())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return StubApp.getString2(34669);
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new PrivateKeyInfo(new AlgorithmIdentifier(PQCObjectIdentifiers.mcElieceCca2), new McElieceCCA2PrivateKey(getN(), getK(), getField(), getGoppaPoly(), getP(), MessageDigestUtils.getDigestAlgID(this.params.getDigest()))).getEncoded();
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

    public Permutation getP() {
        return this.params.getP();
    }

    public PolynomialGF2mSmallM[] getQInv() {
        return this.params.getQInv();
    }

    public int getT() {
        return this.params.getGoppaPoly().getDegree();
    }

    public int hashCode() {
        return this.params.getH().hashCode() + ((this.params.getP().hashCode() + ((this.params.getGoppaPoly().hashCode() + ((this.params.getField().hashCode() + ((this.params.getN() + (this.params.getK() * 37)) * 37)) * 37)) * 37)) * 37);
    }
}
