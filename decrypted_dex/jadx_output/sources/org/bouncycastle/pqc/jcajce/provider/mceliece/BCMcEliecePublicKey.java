package org.bouncycastle.pqc.jcajce.provider.mceliece;

import com.stub.StubApp;
import java.io.IOException;
import java.security.PublicKey;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.asn1.McEliecePublicKey;
import org.bouncycastle.pqc.asn1.PQCObjectIdentifiers;
import org.bouncycastle.pqc.legacy.crypto.mceliece.McEliecePublicKeyParameters;
import org.bouncycastle.pqc.legacy.math.linearalgebra.GF2Matrix;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BCMcEliecePublicKey implements PublicKey {
    private static final long serialVersionUID = 1;
    private McEliecePublicKeyParameters params;

    public BCMcEliecePublicKey(McEliecePublicKeyParameters mcEliecePublicKeyParameters) {
        this.params = mcEliecePublicKeyParameters;
    }

    public boolean equals(Object obj) {
        if (obj instanceof BCMcEliecePublicKey) {
            BCMcEliecePublicKey bCMcEliecePublicKey = (BCMcEliecePublicKey) obj;
            if (this.params.getN() == bCMcEliecePublicKey.getN() && this.params.getT() == bCMcEliecePublicKey.getT() && this.params.getG().equals(bCMcEliecePublicKey.getG())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return StubApp.getString2(34673);
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(PQCObjectIdentifiers.mcEliece), new McEliecePublicKey(this.params.getN(), this.params.getT(), this.params.getG())).getEncoded();
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
        n11.append(this.params.getG());
        return n11.toString();
    }
}
