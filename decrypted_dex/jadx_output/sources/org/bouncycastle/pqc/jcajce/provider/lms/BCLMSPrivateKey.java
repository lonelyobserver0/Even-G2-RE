package org.bouncycastle.pqc.jcajce.provider.lms;

import com.stub.StubApp;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PrivateKey;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.pqc.crypto.lms.HSSPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.lms.LMSKeyParameters;
import org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.util.PrivateKeyFactory;
import org.bouncycastle.pqc.crypto.util.PrivateKeyInfoFactory;
import org.bouncycastle.pqc.jcajce.interfaces.LMSPrivateKey;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BCLMSPrivateKey implements PrivateKey, LMSPrivateKey {
    private static final long serialVersionUID = 8568701712864512338L;
    private transient ASN1Set attributes;
    private transient LMSKeyParameters keyParams;

    public BCLMSPrivateKey(PrivateKeyInfo privateKeyInfo) throws IOException {
        init(privateKeyInfo);
    }

    private void init(PrivateKeyInfo privateKeyInfo) throws IOException {
        this.attributes = privateKeyInfo.getAttributes();
        this.keyParams = (LMSKeyParameters) PrivateKeyFactory.createKey(privateKeyInfo);
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
        if (!(obj instanceof BCLMSPrivateKey)) {
            return false;
        }
        try {
            return Arrays.areEqual(this.keyParams.getEncoded(), ((BCLMSPrivateKey) obj).keyParams.getEncoded());
        } catch (IOException unused) {
            throw new IllegalStateException(StubApp.getString2(34658));
        }
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.LMSPrivateKey
    public LMSPrivateKey extractKeyShard(int i3) {
        LMSKeyParameters lMSKeyParameters = this.keyParams;
        return lMSKeyParameters instanceof LMSPrivateKeyParameters ? new BCLMSPrivateKey(((LMSPrivateKeyParameters) lMSKeyParameters).extractKeyShard(i3)) : new BCLMSPrivateKey(((HSSPrivateKeyParameters) lMSKeyParameters).extractKeyShard(i3));
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return StubApp.getString2(28198);
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return PrivateKeyInfoFactory.createPrivateKeyInfo(this.keyParams, this.attributes).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return StubApp.getString2(29640);
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.LMSPrivateKey
    public long getIndex() {
        if (getUsagesRemaining() == 0) {
            throw new IllegalStateException(StubApp.getString2(34659));
        }
        LMSKeyParameters lMSKeyParameters = this.keyParams;
        return lMSKeyParameters instanceof LMSPrivateKeyParameters ? ((LMSPrivateKeyParameters) lMSKeyParameters).getIndex() : ((HSSPrivateKeyParameters) lMSKeyParameters).getIndex();
    }

    public CipherParameters getKeyParams() {
        return this.keyParams;
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.LMSKey
    public int getLevels() {
        LMSKeyParameters lMSKeyParameters = this.keyParams;
        if (lMSKeyParameters instanceof LMSPrivateKeyParameters) {
            return 1;
        }
        return ((HSSPrivateKeyParameters) lMSKeyParameters).getL();
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.LMSPrivateKey
    public long getUsagesRemaining() {
        LMSKeyParameters lMSKeyParameters = this.keyParams;
        return lMSKeyParameters instanceof LMSPrivateKeyParameters ? ((LMSPrivateKeyParameters) lMSKeyParameters).getUsagesRemaining() : ((HSSPrivateKeyParameters) lMSKeyParameters).getUsagesRemaining();
    }

    public int hashCode() {
        try {
            return Arrays.hashCode(this.keyParams.getEncoded());
        } catch (IOException unused) {
            throw new IllegalStateException(StubApp.getString2(34660));
        }
    }

    public BCLMSPrivateKey(LMSKeyParameters lMSKeyParameters) {
        this.keyParams = lMSKeyParameters;
    }
}
