package org.bouncycastle.jcajce.provider.asymmetric.edec;

import com.stub.StubApp;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.edec.EdECObjectIdentifiers;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.Ed25519PublicKeyParameters;
import org.bouncycastle.crypto.params.Ed448PublicKeyParameters;
import org.bouncycastle.jcajce.interfaces.EdDSAPublicKey;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BCEdDSAPublicKey implements EdDSAPublicKey {
    static final long serialVersionUID = 1;
    transient AsymmetricKeyParameter eddsaPublicKey;

    public BCEdDSAPublicKey(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        populateFromPubKeyInfo(subjectPublicKeyInfo);
    }

    private void populateFromPubKeyInfo(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        byte[] octets = subjectPublicKeyInfo.getPublicKeyData().getOctets();
        this.eddsaPublicKey = EdECObjectIdentifiers.id_Ed448.equals((ASN1Primitive) subjectPublicKeyInfo.getAlgorithm().getAlgorithm()) ? new Ed448PublicKeyParameters(octets) : new Ed25519PublicKeyParameters(octets);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        populateFromPubKeyInfo(SubjectPublicKeyInfo.getInstance((byte[]) objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public AsymmetricKeyParameter engineGetKeyParameters() {
        return this.eddsaPublicKey;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PublicKey) {
            return Arrays.areEqual(((PublicKey) obj).getEncoded(), getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.eddsaPublicKey instanceof Ed448PublicKeyParameters ? StubApp.getString2(28197) : StubApp.getString2(28196);
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        if (this.eddsaPublicKey instanceof Ed448PublicKeyParameters) {
            byte[] bArr = KeyFactorySpi.Ed448Prefix;
            byte[] bArr2 = new byte[bArr.length + 57];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            ((Ed448PublicKeyParameters) this.eddsaPublicKey).encode(bArr2, bArr.length);
            return bArr2;
        }
        byte[] bArr3 = KeyFactorySpi.Ed25519Prefix;
        byte[] bArr4 = new byte[bArr3.length + 32];
        System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
        ((Ed25519PublicKeyParameters) this.eddsaPublicKey).encode(bArr4, bArr3.length);
        return bArr4;
    }

    @Override // java.security.Key
    public String getFormat() {
        return StubApp.getString2(19963);
    }

    @Override // org.bouncycastle.jcajce.interfaces.EdDSAPublicKey
    public byte[] getPointEncoding() {
        AsymmetricKeyParameter asymmetricKeyParameter = this.eddsaPublicKey;
        return asymmetricKeyParameter instanceof Ed448PublicKeyParameters ? ((Ed448PublicKeyParameters) asymmetricKeyParameter).getEncoded() : ((Ed25519PublicKeyParameters) asymmetricKeyParameter).getEncoded();
    }

    public int hashCode() {
        return Arrays.hashCode(getEncoded());
    }

    public String toString() {
        return Utils.keyToString(StubApp.getString2(30676), getAlgorithm(), this.eddsaPublicKey);
    }

    public BCEdDSAPublicKey(AsymmetricKeyParameter asymmetricKeyParameter) {
        this.eddsaPublicKey = asymmetricKeyParameter;
    }

    public BCEdDSAPublicKey(byte[] bArr, byte[] bArr2) throws InvalidKeySpecException {
        AsymmetricKeyParameter ed25519PublicKeyParameters;
        int length = bArr.length;
        boolean isValidPrefix = Utils.isValidPrefix(bArr, bArr2);
        String string2 = StubApp.getString2(30675);
        if (!isValidPrefix) {
            throw new InvalidKeySpecException(string2);
        }
        if (bArr2.length - length == 57) {
            ed25519PublicKeyParameters = new Ed448PublicKeyParameters(bArr2, length);
        } else {
            if (bArr2.length - length != 32) {
                throw new InvalidKeySpecException(string2);
            }
            ed25519PublicKeyParameters = new Ed25519PublicKeyParameters(bArr2, length);
        }
        this.eddsaPublicKey = ed25519PublicKeyParameters;
    }
}
