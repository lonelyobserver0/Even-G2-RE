package org.bouncycastle.pkcs.jcajce;

import com.stub.StubApp;
import java.io.IOException;
import java.security.PrivateKey;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.Certificate;
import org.bouncycastle.operator.OutputEncryptor;
import org.bouncycastle.pkcs.PKCS12SafeBagBuilder;
import org.bouncycastle.pkcs.PKCSIOException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class JcaPKCS12SafeBagBuilder extends PKCS12SafeBagBuilder {
    public JcaPKCS12SafeBagBuilder(PrivateKey privateKey) {
        super(PrivateKeyInfo.getInstance(privateKey.getEncoded()));
    }

    private static Certificate convertCert(X509Certificate x509Certificate) throws IOException {
        try {
            return Certificate.getInstance(x509Certificate.getEncoded());
        } catch (CertificateEncodingException e10) {
            throw new PKCSIOException(StubApp.getString2(28037) + e10.getMessage(), e10);
        }
    }

    public JcaPKCS12SafeBagBuilder(PrivateKey privateKey, OutputEncryptor outputEncryptor) {
        super(PrivateKeyInfo.getInstance(privateKey.getEncoded()), outputEncryptor);
    }

    public JcaPKCS12SafeBagBuilder(X509Certificate x509Certificate) throws IOException {
        super(convertCert(x509Certificate));
    }
}
