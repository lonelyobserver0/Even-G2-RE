package org.bouncycastle.cms.jcajce;

import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import java.security.Provider;
import java.security.PublicKey;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.cms.IssuerAndSerialNumber;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.cert.jcajce.JcaX509CertificateHolder;
import org.bouncycastle.cms.KeyTransRecipientInfoGenerator;
import org.bouncycastle.operator.jcajce.JceAsymmetricKeyWrapper;
import org.bouncycastle.operator.jcajce.JceKTSKeyWrapper;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class JceKTSKeyTransRecipientInfoGenerator extends KeyTransRecipientInfoGenerator {
    private static final byte[] ANONYMOUS_SENDER = Hex.decode(StubApp.getString2(28286));

    public JceKTSKeyTransRecipientInfoGenerator(X509Certificate x509Certificate, String str, int i3) throws CertificateEncodingException {
        this(x509Certificate, new IssuerAndSerialNumber(new JcaX509CertificateHolder(x509Certificate).toASN1Structure()), str, i3);
    }

    private static byte[] getEncodedRecipID(IssuerAndSerialNumber issuerAndSerialNumber) throws CertificateEncodingException {
        try {
            return issuerAndSerialNumber.getEncoded(StubApp.getString2("26791"));
        } catch (IOException e10) {
            throw new CertificateEncodingException(u.q(e10, new StringBuilder(StubApp.getString2(28287)))) { // from class: org.bouncycastle.cms.jcajce.JceKTSKeyTransRecipientInfoGenerator.1
                @Override // java.lang.Throwable
                public Throwable getCause() {
                    return e10;
                }
            };
        }
    }

    private static byte[] getEncodedSubKeyId(byte[] bArr) {
        try {
            return new DEROctetString(bArr).getEncoded();
        } catch (IOException e10) {
            throw new IllegalArgumentException(u.q(e10, new StringBuilder(StubApp.getString2(28288)))) { // from class: org.bouncycastle.cms.jcajce.JceKTSKeyTransRecipientInfoGenerator.2
                @Override // java.lang.Throwable
                public Throwable getCause() {
                    return e10;
                }
            };
        }
    }

    public JceKTSKeyTransRecipientInfoGenerator setProvider(String str) {
        ((JceKTSKeyWrapper) this.wrapper).setProvider(str);
        return this;
    }

    private JceKTSKeyTransRecipientInfoGenerator(X509Certificate x509Certificate, IssuerAndSerialNumber issuerAndSerialNumber, String str, int i3) throws CertificateEncodingException {
        super(issuerAndSerialNumber, new JceKTSKeyWrapper(x509Certificate, str, i3, ANONYMOUS_SENDER, getEncodedRecipID(issuerAndSerialNumber)));
    }

    public JceKTSKeyTransRecipientInfoGenerator setProvider(Provider provider) {
        ((JceKTSKeyWrapper) this.wrapper).setProvider(provider);
        return this;
    }

    public JceKTSKeyTransRecipientInfoGenerator(X509Certificate x509Certificate, AlgorithmIdentifier algorithmIdentifier) throws CertificateEncodingException {
        super(new IssuerAndSerialNumber(new JcaX509CertificateHolder(x509Certificate).toASN1Structure()), new JceAsymmetricKeyWrapper(algorithmIdentifier, x509Certificate.getPublicKey()));
    }

    public JceKTSKeyTransRecipientInfoGenerator(byte[] bArr, PublicKey publicKey, String str, int i3) {
        super(bArr, new JceKTSKeyWrapper(publicKey, str, i3, ANONYMOUS_SENDER, getEncodedSubKeyId(bArr)));
    }

    public JceKTSKeyTransRecipientInfoGenerator(byte[] bArr, AlgorithmIdentifier algorithmIdentifier, PublicKey publicKey) {
        super(bArr, new JceAsymmetricKeyWrapper(algorithmIdentifier, publicKey));
    }
}
