package org.bouncycastle.pqc.jcajce.provider.mceliece;

import com.stub.StubApp;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PublicKey;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.jcajce.util.MessageDigestUtils;
import org.bouncycastle.pqc.asn1.McElieceCCA2PublicKey;
import org.bouncycastle.pqc.asn1.PQCObjectIdentifiers;
import org.bouncycastle.pqc.crypto.util.PublicKeyFactory;
import org.bouncycastle.pqc.legacy.crypto.mceliece.McElieceCCA2PublicKeyParameters;
import org.bouncycastle.pqc.legacy.math.linearalgebra.GF2Matrix;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BCMcElieceCCA2PublicKey implements CipherParameters, PublicKey {
    private static final long serialVersionUID = 1;
    private transient McElieceCCA2PublicKeyParameters params;

    public BCMcElieceCCA2PublicKey(McElieceCCA2PublicKeyParameters mcElieceCCA2PublicKeyParameters) {
        this.params = mcElieceCCA2PublicKeyParameters;
    }

    private void init(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
        this.params = (McElieceCCA2PublicKeyParameters) PublicKeyFactory.createKey(subjectPublicKeyInfo);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        init(SubjectPublicKeyInfo.getInstance((byte[]) objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof BCMcElieceCCA2PublicKey)) {
            BCMcElieceCCA2PublicKey bCMcElieceCCA2PublicKey = (BCMcElieceCCA2PublicKey) obj;
            if (this.params.getN() == bCMcElieceCCA2PublicKey.getN() && this.params.getT() == bCMcElieceCCA2PublicKey.getT() && this.params.getG().equals(bCMcElieceCCA2PublicKey.getG())) {
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
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(PQCObjectIdentifiers.mcElieceCca2), new McElieceCCA2PublicKey(this.params.getN(), this.params.getT(), this.params.getG(), MessageDigestUtils.getDigestAlgID(this.params.getDigest()))).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return StubApp.getString2(19963);
    }

    public GF2Matrix getG() {
        return this.params.getG();
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

    public int getT() {
        return this.params.getT();
    }

    public int hashCode() {
        return this.params.getG().hashCode() + (((this.params.getT() * 37) + this.params.getN()) * 37);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(34670));
        sb2.append(this.params.getN());
        String string2 = StubApp.getString2(3692);
        sb2.append(string2);
        StringBuilder n10 = AbstractC1482f.n(sb2.toString(), StubApp.getString2(34671));
        n10.append(this.params.getT());
        n10.append(string2);
        StringBuilder n11 = AbstractC1482f.n(n10.toString(), StubApp.getString2(34672));
        n11.append(this.params.getG().toString());
        return n11.toString();
    }
}
