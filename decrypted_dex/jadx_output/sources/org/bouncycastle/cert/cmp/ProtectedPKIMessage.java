package org.bouncycastle.cert.cmp;

import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.cmp.CMPCertificate;
import org.bouncycastle.asn1.cmp.CMPObjectIdentifiers;
import org.bouncycastle.asn1.cmp.PKIBody;
import org.bouncycastle.asn1.cmp.PKIHeader;
import org.bouncycastle.asn1.cmp.PKIMessage;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.operator.ContentVerifier;
import org.bouncycastle.operator.ContentVerifierProvider;
import org.bouncycastle.operator.MacCalculator;
import org.bouncycastle.operator.PBEMacCalculatorProvider;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ProtectedPKIMessage {
    private PKIMessage pkiMessage;

    public ProtectedPKIMessage(PKIMessage pKIMessage) {
        if (pKIMessage.getHeader().getProtectionAlg() == null) {
            throw new IllegalArgumentException(StubApp.getString2(28022));
        }
        this.pkiMessage = pKIMessage;
    }

    private boolean verifySignature(byte[] bArr, ContentVerifier contentVerifier) throws IOException {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.pkiMessage.getHeader());
        aSN1EncodableVector.add(this.pkiMessage.getBody());
        OutputStream outputStream = contentVerifier.getOutputStream();
        outputStream.write(new DERSequence(aSN1EncodableVector).getEncoded(StubApp.getString2(26791)));
        outputStream.close();
        return contentVerifier.verify(bArr);
    }

    public PKIBody getBody() {
        return this.pkiMessage.getBody();
    }

    public X509CertificateHolder[] getCertificates() {
        CMPCertificate[] extraCerts = this.pkiMessage.getExtraCerts();
        if (extraCerts == null) {
            return new X509CertificateHolder[0];
        }
        X509CertificateHolder[] x509CertificateHolderArr = new X509CertificateHolder[extraCerts.length];
        for (int i3 = 0; i3 != extraCerts.length; i3++) {
            x509CertificateHolderArr[i3] = new X509CertificateHolder(extraCerts[i3].getX509v3PKCert());
        }
        return x509CertificateHolderArr;
    }

    public PKIHeader getHeader() {
        return this.pkiMessage.getHeader();
    }

    public boolean hasPasswordBasedMacProtection() {
        return this.pkiMessage.getHeader().getProtectionAlg().getAlgorithm().equals((ASN1Primitive) CMPObjectIdentifiers.passwordBasedMac);
    }

    public PKIMessage toASN1Structure() {
        return this.pkiMessage;
    }

    public boolean verify(ContentVerifierProvider contentVerifierProvider) throws CMPException {
        try {
            return verifySignature(this.pkiMessage.getProtection().getBytes(), contentVerifierProvider.get(this.pkiMessage.getHeader().getProtectionAlg()));
        } catch (Exception e10) {
            throw new CMPException(u.r(e10, new StringBuilder(StubApp.getString2(28023))), e10);
        }
    }

    public ProtectedPKIMessage(GeneralPKIMessage generalPKIMessage) {
        if (!generalPKIMessage.hasProtection()) {
            throw new IllegalArgumentException(StubApp.getString2(28022));
        }
        this.pkiMessage = generalPKIMessage.toASN1Structure();
    }

    public boolean verify(PBEMacCalculatorProvider pBEMacCalculatorProvider, char[] cArr) throws CMPException {
        try {
            MacCalculator macCalculator = pBEMacCalculatorProvider.get(this.pkiMessage.getHeader().getProtectionAlg(), cArr);
            OutputStream outputStream = macCalculator.getOutputStream();
            ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
            aSN1EncodableVector.add(this.pkiMessage.getHeader());
            aSN1EncodableVector.add(this.pkiMessage.getBody());
            outputStream.write(new DERSequence(aSN1EncodableVector).getEncoded(StubApp.getString2("26791")));
            outputStream.close();
            return Arrays.constantTimeAreEqual(macCalculator.getMac(), this.pkiMessage.getProtection().getBytes());
        } catch (Exception e10) {
            throw new CMPException(u.r(e10, new StringBuilder(StubApp.getString2(28024))), e10);
        }
    }
}
