package org.bouncycastle.cert.cmp;

import com.stub.StubApp;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.cmp.CertConfirmContent;
import org.bouncycastle.asn1.cmp.CertStatus;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.operator.DefaultDigestAlgorithmIdentifierFinder;
import org.bouncycastle.operator.DigestAlgorithmIdentifierFinder;
import org.bouncycastle.operator.DigestCalculator;
import org.bouncycastle.operator.DigestCalculatorProvider;
import org.bouncycastle.operator.OperatorCreationException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CertificateConfirmationContentBuilder {
    private List acceptedCerts;
    private List acceptedReqIds;
    private DigestAlgorithmIdentifierFinder digestAlgFinder;

    public CertificateConfirmationContentBuilder() {
        this(new DefaultDigestAlgorithmIdentifierFinder());
    }

    public CertificateConfirmationContentBuilder addAcceptedCertificate(X509CertificateHolder x509CertificateHolder, BigInteger bigInteger) {
        this.acceptedCerts.add(x509CertificateHolder);
        this.acceptedReqIds.add(bigInteger);
        return this;
    }

    public CertificateConfirmationContent build(DigestCalculatorProvider digestCalculatorProvider) throws CMPException {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        for (int i3 = 0; i3 != this.acceptedCerts.size(); i3++) {
            X509CertificateHolder x509CertificateHolder = (X509CertificateHolder) this.acceptedCerts.get(i3);
            BigInteger bigInteger = (BigInteger) this.acceptedReqIds.get(i3);
            AlgorithmIdentifier find = this.digestAlgFinder.find(x509CertificateHolder.toASN1Structure().getSignatureAlgorithm());
            if (find == null) {
                throw new CMPException(StubApp.getString2(28020));
            }
            try {
                DigestCalculator digestCalculator = digestCalculatorProvider.get(find);
                CMPUtil.derEncodeToStream(x509CertificateHolder.toASN1Structure(), digestCalculator.getOutputStream());
                aSN1EncodableVector.add(new CertStatus(digestCalculator.getDigest(), bigInteger));
            } catch (OperatorCreationException e10) {
                throw new CMPException(StubApp.getString2(28019) + e10.getMessage(), e10);
            }
        }
        return new CertificateConfirmationContent(CertConfirmContent.getInstance(new DERSequence(aSN1EncodableVector)), this.digestAlgFinder);
    }

    public CertificateConfirmationContentBuilder(DigestAlgorithmIdentifierFinder digestAlgorithmIdentifierFinder) {
        this.acceptedCerts = new ArrayList();
        this.acceptedReqIds = new ArrayList();
        this.digestAlgFinder = digestAlgorithmIdentifierFinder;
    }
}
