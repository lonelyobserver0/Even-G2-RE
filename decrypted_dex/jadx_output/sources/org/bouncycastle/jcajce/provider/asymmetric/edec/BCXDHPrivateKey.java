package org.bouncycastle.jcajce.provider.asymmetric.edec;

import com.stub.StubApp;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PrivateKey;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.edec.EdECObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.X25519PrivateKeyParameters;
import org.bouncycastle.crypto.params.X448PrivateKeyParameters;
import org.bouncycastle.crypto.util.PrivateKeyInfoFactory;
import org.bouncycastle.jcajce.interfaces.XDHPrivateKey;
import org.bouncycastle.jcajce.interfaces.XDHPublicKey;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Properties;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BCXDHPrivateKey implements XDHPrivateKey {
    static final long serialVersionUID = 1;
    private final byte[] attributes;
    private final boolean hasPublicKey;
    transient AsymmetricKeyParameter xdhPrivateKey;

    public BCXDHPrivateKey(PrivateKeyInfo privateKeyInfo) throws IOException {
        this.hasPublicKey = privateKeyInfo.hasPublicKey();
        this.attributes = privateKeyInfo.getAttributes() != null ? privateKeyInfo.getAttributes().getEncoded() : null;
        populateFromPrivateKeyInfo(privateKeyInfo);
    }

    private void populateFromPrivateKeyInfo(PrivateKeyInfo privateKeyInfo) throws IOException {
        byte[] octets = privateKeyInfo.getPrivateKey().getOctets();
        if (octets.length != 32 && octets.length != 56) {
            octets = ASN1OctetString.getInstance(privateKeyInfo.parsePrivateKey()).getOctets();
        }
        this.xdhPrivateKey = EdECObjectIdentifiers.id_X448.equals((ASN1Primitive) privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm()) ? new X448PrivateKeyParameters(octets) : new X25519PrivateKeyParameters(octets);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        populateFromPrivateKeyInfo(PrivateKeyInfo.getInstance((byte[]) objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public AsymmetricKeyParameter engineGetKeyParameters() {
        return this.xdhPrivateKey;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PrivateKey) {
            return Arrays.areEqual(((PrivateKey) obj).getEncoded(), getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.xdhPrivateKey instanceof X448PrivateKeyParameters ? StubApp.getString2(28390) : StubApp.getString2(28389);
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            ASN1Set aSN1Set = ASN1Set.getInstance(this.attributes);
            PrivateKeyInfo createPrivateKeyInfo = PrivateKeyInfoFactory.createPrivateKeyInfo(this.xdhPrivateKey, aSN1Set);
            return (!this.hasPublicKey || Properties.isOverrideSet(StubApp.getString2("30673"))) ? new PrivateKeyInfo(createPrivateKeyInfo.getPrivateKeyAlgorithm(), createPrivateKeyInfo.parsePrivateKey(), aSN1Set).getEncoded() : createPrivateKeyInfo.getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return StubApp.getString2(29640);
    }

    @Override // org.bouncycastle.jcajce.interfaces.XDHPrivateKey
    public XDHPublicKey getPublicKey() {
        AsymmetricKeyParameter asymmetricKeyParameter = this.xdhPrivateKey;
        return asymmetricKeyParameter instanceof X448PrivateKeyParameters ? new BCXDHPublicKey(((X448PrivateKeyParameters) asymmetricKeyParameter).generatePublicKey()) : new BCXDHPublicKey(((X25519PrivateKeyParameters) asymmetricKeyParameter).generatePublicKey());
    }

    public int hashCode() {
        return Arrays.hashCode(getEncoded());
    }

    public String toString() {
        AsymmetricKeyParameter asymmetricKeyParameter = this.xdhPrivateKey;
        return Utils.keyToString(StubApp.getString2(30674), getAlgorithm(), asymmetricKeyParameter instanceof X448PrivateKeyParameters ? ((X448PrivateKeyParameters) asymmetricKeyParameter).generatePublicKey() : ((X25519PrivateKeyParameters) asymmetricKeyParameter).generatePublicKey());
    }

    public BCXDHPrivateKey(AsymmetricKeyParameter asymmetricKeyParameter) {
        this.hasPublicKey = true;
        this.attributes = null;
        this.xdhPrivateKey = asymmetricKeyParameter;
    }
}
