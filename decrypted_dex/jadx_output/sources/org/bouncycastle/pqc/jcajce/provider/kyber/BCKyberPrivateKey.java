package org.bouncycastle.pqc.jcajce.provider.kyber;

import com.stub.StubApp;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberPublicKeyParameters;
import org.bouncycastle.pqc.crypto.util.PrivateKeyFactory;
import org.bouncycastle.pqc.crypto.util.PrivateKeyInfoFactory;
import org.bouncycastle.pqc.jcajce.interfaces.KyberPrivateKey;
import org.bouncycastle.pqc.jcajce.interfaces.KyberPublicKey;
import org.bouncycastle.pqc.jcajce.spec.KyberParameterSpec;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BCKyberPrivateKey implements KyberPrivateKey {
    private static final long serialVersionUID = 1;
    private transient ASN1Set attributes;
    private transient KyberPrivateKeyParameters params;

    public BCKyberPrivateKey(PrivateKeyInfo privateKeyInfo) throws IOException {
        init(privateKeyInfo);
    }

    private void init(PrivateKeyInfo privateKeyInfo) throws IOException {
        this.attributes = privateKeyInfo.getAttributes();
        this.params = (KyberPrivateKeyParameters) PrivateKeyFactory.createKey(privateKeyInfo);
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
        if (obj instanceof BCKyberPrivateKey) {
            return Arrays.areEqual(this.params.getEncoded(), ((BCKyberPrivateKey) obj).params.getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return StubApp.getString2(34406);
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

    public KyberPrivateKeyParameters getKeyParams() {
        return this.params;
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.KyberKey
    public KyberParameterSpec getParameterSpec() {
        return KyberParameterSpec.fromName(this.params.getParameters().getName());
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.KyberPrivateKey
    public KyberPublicKey getPublicKey() {
        return new BCKyberPublicKey(new KyberPublicKeyParameters(this.params.getParameters(), this.params.getPublicKey()));
    }

    public int hashCode() {
        return Arrays.hashCode(this.params.getEncoded());
    }

    public BCKyberPrivateKey(KyberPrivateKeyParameters kyberPrivateKeyParameters) {
        this.params = kyberPrivateKeyParameters;
    }
}
