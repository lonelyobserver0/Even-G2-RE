package org.bouncycastle.pqc.jcajce.provider.cmce;

import com.stub.StubApp;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PublicKey;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.pqc.crypto.cmce.CMCEPublicKeyParameters;
import org.bouncycastle.pqc.crypto.util.PublicKeyFactory;
import org.bouncycastle.pqc.crypto.util.SubjectPublicKeyInfoFactory;
import org.bouncycastle.pqc.jcajce.interfaces.CMCEKey;
import org.bouncycastle.pqc.jcajce.spec.CMCEParameterSpec;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BCCMCEPublicKey implements PublicKey, CMCEKey {
    private static final long serialVersionUID = 1;
    private transient CMCEPublicKeyParameters params;

    public BCCMCEPublicKey(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
        init(subjectPublicKeyInfo);
    }

    private void init(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
        this.params = (CMCEPublicKeyParameters) PublicKeyFactory.createKey(subjectPublicKeyInfo);
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
        if (obj == this) {
            return true;
        }
        if (obj instanceof BCCMCEPublicKey) {
            return Arrays.areEqual(this.params.getEncoded(), ((BCCMCEPublicKey) obj).params.getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return StubApp.getString2(34401);
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return SubjectPublicKeyInfoFactory.createSubjectPublicKeyInfo(this.params).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return StubApp.getString2(19963);
    }

    public CMCEPublicKeyParameters getKeyParams() {
        return this.params;
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.CMCEKey
    public CMCEParameterSpec getParameterSpec() {
        return CMCEParameterSpec.fromName(this.params.getParameters().getName());
    }

    public int hashCode() {
        return Arrays.hashCode(this.params.getEncoded());
    }

    public BCCMCEPublicKey(CMCEPublicKeyParameters cMCEPublicKeyParameters) {
        this.params = cMCEPublicKeyParameters;
    }
}
