package org.bouncycastle.cert;

import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.x509.AuthorityKeyIdentifier;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.SubjectKeyIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.operator.DigestCalculator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class X509ExtensionUtils {
    private DigestCalculator calculator;

    public X509ExtensionUtils(DigestCalculator digestCalculator) {
        this.calculator = digestCalculator;
    }

    private byte[] calculateIdentifier(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        byte[] bytes = subjectPublicKeyInfo.getPublicKeyData().getBytes();
        OutputStream outputStream = this.calculator.getOutputStream();
        try {
            outputStream.write(bytes);
            outputStream.close();
            return this.calculator.getDigest();
        } catch (IOException e10) {
            throw new CertRuntimeException(u.q(e10, new StringBuilder(StubApp.getString2(28015))), e10);
        }
    }

    private byte[] getSubjectKeyIdentifier(X509CertificateHolder x509CertificateHolder) {
        Extension extension;
        if (x509CertificateHolder.getVersionNumber() == 3 && (extension = x509CertificateHolder.getExtension(Extension.subjectKeyIdentifier)) != null) {
            return ASN1OctetString.getInstance(extension.getParsedValue()).getOctets();
        }
        return calculateIdentifier(x509CertificateHolder.getSubjectPublicKeyInfo());
    }

    public AuthorityKeyIdentifier createAuthorityKeyIdentifier(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        return new AuthorityKeyIdentifier(calculateIdentifier(subjectPublicKeyInfo));
    }

    public SubjectKeyIdentifier createSubjectKeyIdentifier(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        return new SubjectKeyIdentifier(calculateIdentifier(subjectPublicKeyInfo));
    }

    public SubjectKeyIdentifier createTruncatedSubjectKeyIdentifier(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        byte[] calculateIdentifier = calculateIdentifier(subjectPublicKeyInfo);
        byte[] bArr = new byte[8];
        System.arraycopy(calculateIdentifier, calculateIdentifier.length - 8, bArr, 0, 8);
        byte b2 = (byte) (bArr[0] & 15);
        bArr[0] = b2;
        bArr[0] = (byte) (b2 | 64);
        return new SubjectKeyIdentifier(bArr);
    }

    public AuthorityKeyIdentifier createAuthorityKeyIdentifier(SubjectPublicKeyInfo subjectPublicKeyInfo, GeneralNames generalNames, BigInteger bigInteger) {
        return new AuthorityKeyIdentifier(calculateIdentifier(subjectPublicKeyInfo), generalNames, bigInteger);
    }

    public AuthorityKeyIdentifier createAuthorityKeyIdentifier(X509CertificateHolder x509CertificateHolder) {
        return new AuthorityKeyIdentifier(getSubjectKeyIdentifier(x509CertificateHolder), new GeneralNames(new GeneralName(x509CertificateHolder.getIssuer())), x509CertificateHolder.getSerialNumber());
    }
}
