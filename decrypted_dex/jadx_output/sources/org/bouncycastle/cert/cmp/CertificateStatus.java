package org.bouncycastle.cert.cmp;

import com.stub.StubApp;
import java.math.BigInteger;
import org.bouncycastle.asn1.cmp.CertStatus;
import org.bouncycastle.asn1.cmp.PKIStatusInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.operator.DigestAlgorithmIdentifierFinder;
import org.bouncycastle.operator.DigestCalculator;
import org.bouncycastle.operator.DigestCalculatorProvider;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CertificateStatus {
    private CertStatus certStatus;
    private DigestAlgorithmIdentifierFinder digestAlgFinder;

    public CertificateStatus(DigestAlgorithmIdentifierFinder digestAlgorithmIdentifierFinder, CertStatus certStatus) {
        this.digestAlgFinder = digestAlgorithmIdentifierFinder;
        this.certStatus = certStatus;
    }

    public BigInteger getCertRequestID() {
        return this.certStatus.getCertReqId().getValue();
    }

    public PKIStatusInfo getStatusInfo() {
        return this.certStatus.getStatusInfo();
    }

    public boolean isVerified(X509CertificateHolder x509CertificateHolder, DigestCalculatorProvider digestCalculatorProvider) throws CMPException {
        AlgorithmIdentifier find = this.digestAlgFinder.find(x509CertificateHolder.toASN1Structure().getSignatureAlgorithm());
        if (find == null) {
            throw new CMPException(StubApp.getString2(28020));
        }
        try {
            DigestCalculator digestCalculator = digestCalculatorProvider.get(find);
            CMPUtil.derEncodeToStream(x509CertificateHolder.toASN1Structure(), digestCalculator.getOutputStream());
            return Arrays.areEqual(this.certStatus.getCertHash().getOctets(), digestCalculator.getDigest());
        } catch (OperatorCreationException e10) {
            throw new CMPException(StubApp.getString2(28021) + e10.getMessage(), e10);
        }
    }
}
