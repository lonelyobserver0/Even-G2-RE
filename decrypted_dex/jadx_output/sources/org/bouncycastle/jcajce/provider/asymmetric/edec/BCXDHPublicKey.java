package org.bouncycastle.jcajce.provider.asymmetric.edec;

import com.stub.StubApp;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.edec.EdECObjectIdentifiers;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.X25519PublicKeyParameters;
import org.bouncycastle.crypto.params.X448PublicKeyParameters;
import org.bouncycastle.jcajce.interfaces.XDHPublicKey;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BCXDHPublicKey implements XDHPublicKey {
    static final long serialVersionUID = 1;
    transient AsymmetricKeyParameter xdhPublicKey;

    public BCXDHPublicKey(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        populateFromPubKeyInfo(subjectPublicKeyInfo);
    }

    private void populateFromPubKeyInfo(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        byte[] octets = subjectPublicKeyInfo.getPublicKeyData().getOctets();
        this.xdhPublicKey = EdECObjectIdentifiers.id_X448.equals((ASN1Primitive) subjectPublicKeyInfo.getAlgorithm().getAlgorithm()) ? new X448PublicKeyParameters(octets) : new X25519PublicKeyParameters(octets);
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
        return this.xdhPublicKey;
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
        return this.xdhPublicKey instanceof X448PublicKeyParameters ? StubApp.getString2(28390) : StubApp.getString2(28389);
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        if (this.xdhPublicKey instanceof X448PublicKeyParameters) {
            byte[] bArr = KeyFactorySpi.x448Prefix;
            byte[] bArr2 = new byte[bArr.length + 56];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            ((X448PublicKeyParameters) this.xdhPublicKey).encode(bArr2, bArr.length);
            return bArr2;
        }
        byte[] bArr3 = KeyFactorySpi.x25519Prefix;
        byte[] bArr4 = new byte[bArr3.length + 32];
        System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
        ((X25519PublicKeyParameters) this.xdhPublicKey).encode(bArr4, bArr3.length);
        return bArr4;
    }

    @Override // java.security.Key
    public String getFormat() {
        return StubApp.getString2(19963);
    }

    @Override // org.bouncycastle.jcajce.interfaces.XDHPublicKey
    public BigInteger getU() {
        byte[] uEncoding = getUEncoding();
        Arrays.reverseInPlace(uEncoding);
        return new BigInteger(1, uEncoding);
    }

    @Override // org.bouncycastle.jcajce.interfaces.XDHPublicKey
    public byte[] getUEncoding() {
        AsymmetricKeyParameter asymmetricKeyParameter = this.xdhPublicKey;
        return asymmetricKeyParameter instanceof X448PublicKeyParameters ? ((X448PublicKeyParameters) asymmetricKeyParameter).getEncoded() : ((X25519PublicKeyParameters) asymmetricKeyParameter).getEncoded();
    }

    public int hashCode() {
        return Arrays.hashCode(getEncoded());
    }

    public String toString() {
        return Utils.keyToString(StubApp.getString2(30676), getAlgorithm(), this.xdhPublicKey);
    }

    public BCXDHPublicKey(AsymmetricKeyParameter asymmetricKeyParameter) {
        this.xdhPublicKey = asymmetricKeyParameter;
    }

    public BCXDHPublicKey(byte[] bArr, byte[] bArr2) throws InvalidKeySpecException {
        AsymmetricKeyParameter x25519PublicKeyParameters;
        int length = bArr.length;
        boolean isValidPrefix = Utils.isValidPrefix(bArr, bArr2);
        String string2 = StubApp.getString2(30675);
        if (!isValidPrefix) {
            throw new InvalidKeySpecException(string2);
        }
        if (bArr2.length - length == 56) {
            x25519PublicKeyParameters = new X448PublicKeyParameters(bArr2, length);
        } else {
            if (bArr2.length - length != 32) {
                throw new InvalidKeySpecException(string2);
            }
            x25519PublicKeyParameters = new X25519PublicKeyParameters(bArr2, length);
        }
        this.xdhPublicKey = x25519PublicKeyParameters;
    }
}
