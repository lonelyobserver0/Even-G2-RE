package org.bouncycastle.pqc.jcajce.provider.dilithium;

import com.stub.StubApp;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumPublicKeyParameters;
import org.bouncycastle.pqc.crypto.util.PrivateKeyFactory;
import org.bouncycastle.pqc.crypto.util.PrivateKeyInfoFactory;
import org.bouncycastle.pqc.jcajce.interfaces.DilithiumPrivateKey;
import org.bouncycastle.pqc.jcajce.interfaces.DilithiumPublicKey;
import org.bouncycastle.pqc.jcajce.spec.DilithiumParameterSpec;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BCDilithiumPrivateKey implements DilithiumPrivateKey {
    private static final long serialVersionUID = 1;
    private transient ASN1Set attributes;
    private transient DilithiumPrivateKeyParameters params;

    public BCDilithiumPrivateKey(PrivateKeyInfo privateKeyInfo) throws IOException {
        init(privateKeyInfo);
    }

    private void init(PrivateKeyInfo privateKeyInfo) throws IOException {
        this.attributes = privateKeyInfo.getAttributes();
        this.params = (DilithiumPrivateKeyParameters) PrivateKeyFactory.createKey(privateKeyInfo);
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
        if (obj == this) {
            return true;
        }
        if (obj instanceof BCDilithiumPrivateKey) {
            return Arrays.areEqual(this.params.getEncoded(), ((BCDilithiumPrivateKey) obj).params.getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return StubApp.getString2(34407);
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return PrivateKeyInfoFactory.createPrivateKeyInfo(this.params, this.attributes).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return StubApp.getString2(29640);
    }

    public DilithiumPrivateKeyParameters getKeyParams() {
        return this.params;
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.DilithiumKey
    public DilithiumParameterSpec getParameterSpec() {
        return DilithiumParameterSpec.fromName(this.params.getParameters().getName());
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.DilithiumPrivateKey
    public DilithiumPublicKey getPublicKey() {
        return new BCDilithiumPublicKey(new DilithiumPublicKeyParameters(this.params.getParameters(), this.params.getRho(), this.params.getT1()));
    }

    public int hashCode() {
        return Arrays.hashCode(this.params.getEncoded());
    }

    public BCDilithiumPrivateKey(DilithiumPrivateKeyParameters dilithiumPrivateKeyParameters) {
        this.params = dilithiumPrivateKeyParameters;
    }
}
