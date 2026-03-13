package org.bouncycastle.pqc.jcajce.provider.sphincsplus;

import com.stub.StubApp;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusPublicKeyParameters;
import org.bouncycastle.pqc.crypto.util.PrivateKeyFactory;
import org.bouncycastle.pqc.crypto.util.PrivateKeyInfoFactory;
import org.bouncycastle.pqc.jcajce.interfaces.SPHINCSPlusPrivateKey;
import org.bouncycastle.pqc.jcajce.interfaces.SPHINCSPlusPublicKey;
import org.bouncycastle.pqc.jcajce.spec.SPHINCSPlusParameterSpec;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BCSPHINCSPlusPrivateKey implements SPHINCSPlusPrivateKey {
    private static final long serialVersionUID = 1;
    private transient ASN1Set attributes;
    private transient SPHINCSPlusPrivateKeyParameters params;

    public BCSPHINCSPlusPrivateKey(PrivateKeyInfo privateKeyInfo) throws IOException {
        init(privateKeyInfo);
    }

    private void init(PrivateKeyInfo privateKeyInfo) throws IOException {
        this.attributes = privateKeyInfo.getAttributes();
        this.params = (SPHINCSPlusPrivateKeyParameters) PrivateKeyFactory.createKey(privateKeyInfo);
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
        if (obj instanceof BCSPHINCSPlusPrivateKey) {
            return Arrays.areEqual(this.params.getEncoded(), ((BCSPHINCSPlusPrivateKey) obj).params.getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return StubApp.getString2(33701);
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

    public CipherParameters getKeyParams() {
        return this.params;
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.SPHINCSPlusKey
    public SPHINCSPlusParameterSpec getParameterSpec() {
        return SPHINCSPlusParameterSpec.fromName(this.params.getParameters().getName());
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.SPHINCSPlusPrivateKey
    public SPHINCSPlusPublicKey getPublicKey() {
        return new BCSPHINCSPlusPublicKey(new SPHINCSPlusPublicKeyParameters(this.params.getParameters(), this.params.getPublicKey()));
    }

    public int hashCode() {
        return Arrays.hashCode(this.params.getEncoded());
    }

    public BCSPHINCSPlusPrivateKey(SPHINCSPlusPrivateKeyParameters sPHINCSPlusPrivateKeyParameters) {
        this.params = sPHINCSPlusPrivateKeyParameters;
    }
}
