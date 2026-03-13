package org.bouncycastle.pqc.jcajce.provider.xmss;

import com.stub.StubApp;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PublicKey;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.pqc.crypto.util.PublicKeyFactory;
import org.bouncycastle.pqc.crypto.util.SubjectPublicKeyInfoFactory;
import org.bouncycastle.pqc.crypto.xmss.XMSSPublicKeyParameters;
import org.bouncycastle.pqc.jcajce.interfaces.XMSSKey;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BCXMSSPublicKey implements PublicKey, XMSSKey {
    private static final long serialVersionUID = -5617456225328969766L;
    private transient XMSSPublicKeyParameters keyParams;
    private transient ASN1ObjectIdentifier treeDigest;

    public BCXMSSPublicKey(ASN1ObjectIdentifier aSN1ObjectIdentifier, XMSSPublicKeyParameters xMSSPublicKeyParameters) {
        this.treeDigest = aSN1ObjectIdentifier;
        this.keyParams = xMSSPublicKeyParameters;
    }

    private void init(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
        XMSSPublicKeyParameters xMSSPublicKeyParameters = (XMSSPublicKeyParameters) PublicKeyFactory.createKey(subjectPublicKeyInfo);
        this.keyParams = xMSSPublicKeyParameters;
        this.treeDigest = DigestUtil.getDigestOID(xMSSPublicKeyParameters.getTreeDigest());
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
        if (obj instanceof BCXMSSPublicKey) {
            BCXMSSPublicKey bCXMSSPublicKey = (BCXMSSPublicKey) obj;
            try {
                if (this.treeDigest.equals((ASN1Primitive) bCXMSSPublicKey.treeDigest)) {
                    if (Arrays.areEqual(this.keyParams.getEncoded(), bCXMSSPublicKey.keyParams.getEncoded())) {
                        return true;
                    }
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return StubApp.getString2(32734);
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return SubjectPublicKeyInfoFactory.createSubjectPublicKeyInfo(this.keyParams).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return StubApp.getString2(19963);
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.XMSSKey
    public int getHeight() {
        return this.keyParams.getParameters().getHeight();
    }

    public CipherParameters getKeyParams() {
        return this.keyParams;
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.XMSSKey
    public String getTreeDigest() {
        return DigestUtil.getXMSSDigestName(this.treeDigest);
    }

    public int hashCode() {
        try {
            return (Arrays.hashCode(this.keyParams.getEncoded()) * 37) + this.treeDigest.hashCode();
        } catch (IOException unused) {
            return this.treeDigest.hashCode();
        }
    }

    public BCXMSSPublicKey(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
        init(subjectPublicKeyInfo);
    }
}
