package org.bouncycastle.pkix;

import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.SubjectKeyIdentifier;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cms.KeyTransRecipientId;
import org.bouncycastle.cms.RecipientId;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class PKIXIdentity {
    private final X509CertificateHolder[] certificateHolders;
    private final PrivateKeyInfo privateKeyInfo;

    public PKIXIdentity(PrivateKeyInfo privateKeyInfo, X509CertificateHolder x509CertificateHolder) {
        this(privateKeyInfo, new X509CertificateHolder[]{x509CertificateHolder});
    }

    private byte[] getSubjectKeyIdentifier() {
        SubjectKeyIdentifier fromExtensions = SubjectKeyIdentifier.fromExtensions(this.certificateHolders[0].getExtensions());
        if (fromExtensions == null) {
            return null;
        }
        return fromExtensions.getKeyIdentifier();
    }

    public X509CertificateHolder getCertificate() {
        return this.certificateHolders[0];
    }

    public X509CertificateHolder[] getCertificateChain() {
        X509CertificateHolder[] x509CertificateHolderArr = this.certificateHolders;
        int length = x509CertificateHolderArr.length;
        X509CertificateHolder[] x509CertificateHolderArr2 = new X509CertificateHolder[length];
        System.arraycopy(x509CertificateHolderArr, 0, x509CertificateHolderArr2, 0, length);
        return x509CertificateHolderArr2;
    }

    public PrivateKeyInfo getPrivateKeyInfo() {
        return this.privateKeyInfo;
    }

    public RecipientId getRecipientId() {
        return new KeyTransRecipientId(this.certificateHolders[0].getIssuer(), this.certificateHolders[0].getSerialNumber(), getSubjectKeyIdentifier());
    }

    public PKIXIdentity(PrivateKeyInfo privateKeyInfo, X509CertificateHolder[] x509CertificateHolderArr) {
        this.privateKeyInfo = privateKeyInfo;
        X509CertificateHolder[] x509CertificateHolderArr2 = new X509CertificateHolder[x509CertificateHolderArr.length];
        this.certificateHolders = x509CertificateHolderArr2;
        System.arraycopy(x509CertificateHolderArr, 0, x509CertificateHolderArr2, 0, x509CertificateHolderArr.length);
    }
}
