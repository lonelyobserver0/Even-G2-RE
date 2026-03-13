package org.bouncycastle.pkix.jcajce;

import com.stub.StubApp;
import java.security.PrivateKey;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cert.jcajce.JcaX509CertificateHolder;
import org.bouncycastle.pkix.PKIXIdentity;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class JcaPKIXIdentity extends PKIXIdentity {
    private final X509Certificate[] certs;
    private final PrivateKey privKey;

    public JcaPKIXIdentity(PrivateKey privateKey, X509Certificate x509Certificate) {
        this(privateKey, new X509Certificate[]{x509Certificate});
    }

    private static X509CertificateHolder[] getCertificates(X509Certificate[] x509CertificateArr) {
        int length = x509CertificateArr.length;
        X509CertificateHolder[] x509CertificateHolderArr = new X509CertificateHolder[length];
        for (int i3 = 0; i3 != length; i3++) {
            try {
                x509CertificateHolderArr[i3] = new JcaX509CertificateHolder(x509CertificateArr[i3]);
            } catch (CertificateEncodingException e10) {
                throw new IllegalArgumentException(StubApp.getString2(33912) + e10.getMessage());
            }
        }
        return x509CertificateHolderArr;
    }

    private static PrivateKeyInfo getPrivateKeyInfo(PrivateKey privateKey) {
        try {
            return PrivateKeyInfo.getInstance(privateKey.getEncoded());
        } catch (Exception unused) {
            return null;
        }
    }

    public PrivateKey getPrivateKey() {
        return this.privKey;
    }

    public X509Certificate getX509Certificate() {
        return this.certs[0];
    }

    public X509Certificate[] getX509CertificateChain() {
        X509Certificate[] x509CertificateArr = this.certs;
        int length = x509CertificateArr.length;
        X509Certificate[] x509CertificateArr2 = new X509Certificate[length];
        System.arraycopy(x509CertificateArr, 0, x509CertificateArr2, 0, length);
        return x509CertificateArr2;
    }

    public JcaPKIXIdentity(PrivateKey privateKey, X509Certificate[] x509CertificateArr) {
        super(getPrivateKeyInfo(privateKey), getCertificates(x509CertificateArr));
        this.privKey = privateKey;
        X509Certificate[] x509CertificateArr2 = new X509Certificate[x509CertificateArr.length];
        this.certs = x509CertificateArr2;
        System.arraycopy(x509CertificateArr, 0, x509CertificateArr2, 0, x509CertificateArr.length);
    }
}
